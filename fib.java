
public class Fibonacci {
    public static void main(String[] args) {

        int a = 0, b = 1;

        System.out.println("First 100 Fibonacci Numbers:");

        for (int i = 1; i <= 100; i++) {
            System.out.print(a + " ");

            int next = a + b;
            a = b;
            b = next;
        }
    }
}
