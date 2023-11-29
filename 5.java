import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to find its prime factors: ");
        int n = scanner.nextInt();

        System.out.println("Prime factors of " + n + " are:");
        
        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n = n / 2;
        }

        for (int i = 3; i * i <= n; i = i + 2) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n = n / i;
            }
        }

        if (n > 2) {
            System.out.print(n);
        }

        scanner.close();
    }
}
