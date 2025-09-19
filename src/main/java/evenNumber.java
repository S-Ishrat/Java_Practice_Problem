import java.util.Scanner;

public class evenNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        for (int i=2;i<number;i=i+2){
            System.out.println(i);
        }

    }
}
