import java.util.Scanner;

public class maxminUisngDowhile {
    public static void main(String[] args) {
        char ch;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        Scanner sc=new Scanner(System.in);
        do {
            System.out.println("Enter the number : ");
            int num=sc.nextInt();
            if(max<num){
                max=num;
            }

            if (num < min) {
                min = num;
            }
            System.out.println("want to add more number?(y/n)");
            ch=sc.next().charAt(0);
          //  System.out.println(num);

        }
        while (ch!='n');

        System.out.println("maximum number is "+max);
        System.out.println("minimum number is "+min);
    }
}
