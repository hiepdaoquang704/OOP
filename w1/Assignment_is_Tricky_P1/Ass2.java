package w1.Assignment_is_Tricky_P1;

public class Ass2 {
    public static void main(String[] args) {
        Number n1 = new Number();
        Number n2 = new Number();
        n1.i = 2;
        n2.i = 5;
        n1 = n2;
        n2.i = 10;
        n1.i = 20;
        System.err.println("n2.i = " + n2.i);
        System.err.println("n1.i = " + n1.i);
    }

}
