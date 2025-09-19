import java.util.Scanner;

public class MaxMin3num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int firstNum=sc.nextInt();
        System.out.println("Enter second Number : ");
        int secondNum=sc.nextInt();
        System.out.println("Enter third Number : ");
        int thirdNum=sc.nextInt();

        if(firstNum>secondNum) {
            if (firstNum > thirdNum) {
                System.out.println(firstNum);
            }
        }
        else if (secondNum>firstNum) {
            if (secondNum>thirdNum){
                System.out.println(secondNum);
            }
            else {
                System.out.println(thirdNum);
            }

        }


    }
}
