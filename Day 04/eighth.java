
class eighth {

    // Find x raised to the power n

    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter the base number (x): ");
        int x = sc.nextInt();

        System.out.print("Enter the exponent (n): ");
        int n = sc.nextInt();

        int result = power(x, n);

        System.out.println("Result: " + result);

        sc.close();
    }

    public static int power(int x, int n) {
        int result = 1;

        for (int i = 0; i < n; i++) {
            result *= x;
        }

        return result;
    }
}
