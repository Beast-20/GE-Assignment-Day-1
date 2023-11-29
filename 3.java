import java.util.Scanner;

class Main{
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;
        System.out.print("Please enter the value of N:- ");
        while(true){
            int temp = scanner.nextInt();
            if(temp<=31){
                N = temp;
                break;
            }
            System.out.println("Given value is not less than equal to 31, please re enter");
        }
        int ans = 1;
        System.out.println(ans);
        for(int i = 1;i<=N;i++){
            ans = ans*2;
            System.out.println(ans);
        }
        
        scanner.close();
        
  
    }
}