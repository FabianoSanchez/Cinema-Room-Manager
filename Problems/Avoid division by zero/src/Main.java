import java.util.Scanner;

class FixingArithmeticException {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int d = scanner.nextInt();

            int result = a / ((b + c) / d);


            if (result == 0) {
                System.out.println("Division by zero!");
            } else {
                System.out.println(result);
            }

        }catch (ArithmeticException e) {
            System.out.println("Division by zero!");
        }
    }
}