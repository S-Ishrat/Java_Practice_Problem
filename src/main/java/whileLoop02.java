import java.util.Scanner;

public class whileLoop02 {
    public static void main(String[] args) {
        int sum = 0;
        while (true){
//            int sum=0;
            Scanner sc=new Scanner(System.in);
            int num=sc.nextInt();
            if(num==-1){
                break;
            }
            else {
                sum=sum+num;

            }

        }
        System.out.println(sum);

    }
}
