import java.util.Scanner;

public class BasicsofJava {
    public static void main(String[] args) {
        //--------------Printing Hello World----------------
        System.out.println("hello world");

        //---------------variable naming------------------
        int RandomSequence=10;
        String S="asdfg";

        //----------------casting------------------
        double a = 10;
        int b = 20;
        int c = (int) a;
        a = b;
        System.out.println(c);

        //----------------parsing---------------------

        String s = "100";
        int s1 = Integer.parseInt(s);
        double s2 = Double.parseDouble(s);
        System.out.println(s2);

        //-------user Input----------------------------
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first number : ");
        int number1=scanner.nextInt();
        System.out.println("Enter second number : ");
        int number2=scanner.nextInt();
        int sum = number1+number2;

        System.out.print("sum of two number is : " + sum);


    }
    }

