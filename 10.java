import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter the first number:- ");
        int a = scanner.nextInt();
        int b;
        while(true){
        System.out.println("Please Enter the second number:- ");
        int temp1 = scanner.nextInt();
        if(temp1==a){
            System.out.println("Please enter another number");
        }
        else{
            b = temp1;
            break;
        }
        }
        int c;
        while(true){
        System.out.println("Please Enter the Third number:- ");
        int temp2 = scanner.nextInt();
        if(temp2==a || temp2==b){
            System.out.println("Please enter another number");
        }
        else{
            c = temp2;
            break;
        }
        }
        if(a>b){
            if(a>c){
                System.out.println("First number is largest");
            }
            else{
                System.out.println("Last number is largest");
            }
        }
        else{
            if(b>c){
               System.out.println("Second number is largest");
            }
            else{
                System.out.println("Last number is largest");
            }
        }
        scanner.close();
        
    }
}
