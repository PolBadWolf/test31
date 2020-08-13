public class DopClass {
    private Interf myCall;

    public DopClass(Interf myCall) {
        this.myCall = myCall;
    }

    public void ttt() {
        myCall.accept1("123");
        myCall.accept2();
        myCall.accept1("0987");
        System.out.println(myCall.accept3());
    }
}
