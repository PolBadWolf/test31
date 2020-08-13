
public class Main {
    private String var1, var2;

    public static void main(String[] args) {
        new Main().start();
    }
    private void start() {
        // создание объекта в другом класе с передачей указателя на реализацию интерфейса
        DopClass dopClass = new DopClass(getInterf());
        // вызов метода в другом классе, в котором использован интерфейс для доступа к содержимому этого класа в пределах методов указанных в интерфейсе и их реализации
        dopClass.ttt();
    }

    // реализация интерфейса с методами для вызова из вызванной функции
    private Interf getInterf() {
        return new Interf() {
            // запись во внутреннюю переменную из вне доступом через переданую реализацию интерфейса
            @Override
            public void accept1(String t) {
                var1 = t;
            }

            @Override
            public void accept2() {
                System.out.println(var1);
            }

            @Override
            public String accept3() {
                return var1;
            }
        };
    }
    // а я ведь могу сделать несколько реализаций, которе могут каждый по своему обрабатывать
    private Interf getInterface2() {
        return new Interf() {
            @Override
            public void accept1(String t) {
                var2 = var1 + t;
            }

            @Override
            public void accept2() {
                var1 = "";
            }

            @Override
            public String accept3() {
                return var2 + var1 + var1;
            }
        };
    }
}
