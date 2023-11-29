import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the dividend:- ");
        int divid = scanner.nextInt();
        System.out.println("Please Enter the divisor:- ");
        int divis = scanner.nextInt();
        int quot = divid/divis;
        int remaind = divid - (divis*quot);
        System.out.println("The Quotient is:- "+quot);
        System.out.println("The Remainder is:- "+remaind);
        scanner.close();
    }
}
