
public class Recursion {
    int num;

    // Constructor
    Recursion() { }
    Recursion(int number) {
        this.num = number;
    }

    // Phương thức tính giai thừa
    public int Recursion(int number) {
        this.num = number;
        if (this.num <= 1) // base case
            return 1;
        else
            return this.num * Recursion(this.num - 1);
    }

    // Phương thức main để chạy lớp Recursion độc lập
    public static void main(String[] args) {
        Recursion myRecursion = new Recursion();
        int result = myRecursion.Recursion(5); // Tính giai thừa của 5
        System.out.println("Factorial of 5: " + result);
    }
}