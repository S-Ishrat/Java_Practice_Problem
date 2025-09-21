public class reverseNumber {
    public static void main(String[] args) {
        int number=1987;
        int rev=0;
        while (number!=0){
            int rem=number%10;
            number=number/10;
             rev=rev*10+rem;
        }
        System.out.println(rev);
    }
}
