package w1.w3s_assignment;

public class break_conti {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i < 4) {
                System.err.println("i is less than 4");

            }
            if (i == 4) {
                continue;

            }
            if (i > 4) {
                System.err.println("i is greater than 4");
                break;
            }
        }
    }
}
