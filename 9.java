import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the alphabet:- ");
        char alphabet = scanner.next().charAt(0);

        if (alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u') {
            System.out.println("The alphabet is Vowel");
        } else {
            System.out.println("The alphabet is Consonant");
        }
        scanner.close();
    }
}
