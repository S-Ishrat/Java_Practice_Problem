import java.util.Scanner;

public class positiveNeg {
    public static void main(String[] args) {
        System.out.print("Enter the number : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number > 0) {
            System.out.println("You Have entered Positive Number");
        } else {
            System.out.println("You Have entered Negative Number");
        }
    }
}
