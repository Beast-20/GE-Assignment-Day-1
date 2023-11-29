import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Please enter the first number that is a:- ");
        int a = scanner.nextInt();
        System.out.println("Please enter the first number that is b:- ");
        int b = scanner.nextInt();
        System.out.println("Value of a and b before swapping is:- "+a+" "+b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Value of a and b after swapping is:- "+a+" "+b);
        scanner.close();
    }
}
