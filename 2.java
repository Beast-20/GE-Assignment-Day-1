import java.util.Scanner;

class Main{
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.print("Please enter the year:- ");
        while(true){
            int T = scanner.nextInt();
            
            String intString = "" + T;
            if(intString.length()==4){
                year = T;
                break;
            }
            System.out.println("Please enter 4 digit number");
            
        }
        if(year%4==0 && year%100!=0){
            System.out.println("Given year is leap year");
        }
        else{
            System.out.println("Given year is not leap year");
        }
        scanner.close();
        
  
    }
}