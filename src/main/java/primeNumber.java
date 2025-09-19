public class primeNumber {
    public static void main(String[] args) {
        int number=33;
        boolean checkPrime=true;
        for (int i=2;i<number;i++){
            if (number%i==0){
                checkPrime=false;
                break;
            }
        }
        if (checkPrime){
            System.out.println("prime");
        }
        else {
            System.out.println("not prime");
        }
    }
}
