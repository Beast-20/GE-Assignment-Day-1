import java.util.Scanner;
class Main{
    public static void main (String[] args) {
        double num = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the value of N:- ");
        int n;
        while(true){
            n = scanner.nextInt();
            if(n<=0){
                System.out.println("Please enter value greater than zero");
            }
            else{
            break;
            }
        }
        for(int i = 2;i<=n;i++){
            System.out.println(num);
            num = num+(1.0/i);
        }
        System.out.println(num);
        scanner.close();
    }
}