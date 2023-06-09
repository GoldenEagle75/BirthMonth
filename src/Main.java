import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String trash = "";
        int birthMonth = 0;
        System.out.println("What is the number of your birth month?");
        if (in.hasNextInt()){
            birthMonth = in.nextInt();
            if (birthMonth <= 12 && birthMonth >= 1){
                System.out.println("You said your birth month was: " + birthMonth + ".");
            }
            else {
                System.out.println("Enter a valid birth month, not " + birthMonth + ".");
            }
        }
        else {
            trash = in.nextLine();
            System.out.println("Enter a valid birth month, not " + trash + ".");
        }
    }
}