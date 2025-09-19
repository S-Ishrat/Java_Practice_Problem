import java.util.Scanner;

public class capitalSmall {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch='a';
        if(ch>='A'&& ch<='Z'){
            System.out.println("capital number");
        }
        else {
            System.out.println("small letter");
        }

    }
}
