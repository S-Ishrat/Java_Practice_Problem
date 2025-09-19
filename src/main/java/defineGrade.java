import java.util.Scanner;

public class defineGrade {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        if(number>=80 && number<=100){
            System.out.println("A+");
        } else if (number<80 && number>=70) {
            System.out.println("A");

        } else if (number>=40 && number<70) {
            System.out.println("D");

        }
        else{
            System.out.println("F");
        }
    }
}
