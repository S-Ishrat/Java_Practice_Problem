import java.util.Scanner;

public class ATMBootthTransaction {
    public static void main(String[] args) {
        int balance=10000;
        System.out.println("-----WELCOME TO THE ATM BOOTH-----\n WHAT TYPE OF TRANSACTION YOU WANT TO PERFORM?\n1.CHECK BALANCE\n2.WITHDRAW MONEY\n3.DEPOSIT MONEY");
        Scanner sc=new Scanner(System.in);
        System.out.println("Please type.....");
        int num=sc.nextInt();
        if(num==1){
            System.out.println("Your Current Balance is"+balance);
        } else if (num==2) {
            System.out.println("How much you want to withdraw?");
            int withdrawmoney= sc.nextInt();
            balance=balance-withdrawmoney;
            System.out.println("Your Current Balance"+balance);

        }
        else {
            System.out.println("How much you want to deposit?");
            int depositmoney= sc.nextInt();
            balance=balance+depositmoney;
            System.out.println("Your Current Balance"+balance);
        }


    }
}
