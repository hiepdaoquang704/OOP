package w1.Assignment_is_Tricky_P1;

public class PassObject {
    static void f(Number m) {
        m.i = 15;
    }

    public static void main(String[] args) {
        Number n = new Number();
        n.i = 14;
        f(n);
        System.err.println("n.i = " + n.i);

    }
}
