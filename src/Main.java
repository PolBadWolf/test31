
public class Main {
    private String var1;

    public static void main(String[] args) {
        new Main().start();
    }
    private void start() {
        DopClass dopClass = new DopClass(getInterf());
        dopClass.ttt();
    }

    private Interf getInterf() {
        return new Interf() {
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
}
