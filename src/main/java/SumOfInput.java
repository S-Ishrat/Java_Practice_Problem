import java.util.Scanner;

public class SumOfInput {
    public static void main(String[] args) {
        int sum=0;
        char ch;
        Scanner sc=new Scanner(System.in);

        do {
            System.out.println("Enter the number :");
            int num=sc.nextInt();
            sum=sum+num;
            System.out.println("If you want to stop press 'q'");
            ch=sc.next().charAt(0);
        }
        while (ch!='q');

        System.out.println(sum);
    }
}
