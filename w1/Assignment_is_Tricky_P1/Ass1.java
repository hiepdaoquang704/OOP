package w1.Assignment_is_Tricky_P1;

/**
 * Ass1
 */
public class Ass1 {
    public static void main(String[] args) {
        Number n1 = new Number();
        Number n2 = new Number();
        n1.i = 2;
        n2.i = 5;
        n1.i = n2.i;
        n2.i = 10;
        System.err.println("n2.i = " + n2.i);
        System.err.println("n1.i = " + n1.i);
    }
}