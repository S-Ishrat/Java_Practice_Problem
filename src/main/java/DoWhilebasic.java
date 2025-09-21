import java.util.Scanner;

public class DoWhilebasic {
    public static void main(String[] args) {
        int sum=0;
        char ch;
        Scanner sc=new Scanner(System.in);
        do {
            int num=sc.nextInt();
            sum=sum+num;
            System.out.println(sum);
            System.out.println("Do you want to add more nnumber?(y/n)");
            ch=sc.next().charAt(0);
        }
        while (ch!='n');

        System.out.println(sum);
        //sc.close();
    }
}
