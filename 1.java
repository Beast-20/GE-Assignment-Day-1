import java.util.Scanner;
import java.util.Random;

class Main{
    public static void main (String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of times you want to flip the coin:- ");
        int T = scanner.nextInt();
        int head_c = 0;
        int tail_c = 0;
        for(int i = 0;i<T;i++){
            double toss = rand.nextDouble();
            if(toss<0.5){
                tail_c+=1;
            }
            else{
                head_c+=1;
            }
        }
        scanner.close();
        double head_p = head_c*100/10;
        double tail_p = tail_c*100/10;
        System.out.println("Heads percentage:- " + head_p);
        System.out.println("Tails's percentage:- " + tail_p);
        
 
    }
}