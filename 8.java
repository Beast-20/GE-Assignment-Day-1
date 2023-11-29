import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Please enter the number:- ");
        int a = scanner.nextInt();
        if(a%2==0){
            System.out.println("The number is Even");
        }
        else{
            System.out.println("The number is Odd");
        }
        
        scanner.close();
    }
}
