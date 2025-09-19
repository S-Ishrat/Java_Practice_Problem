public class countPrimeNumbers {
    public static void main(String[] args) {
        for (int i=1;i<50;i++){
            boolean checkPrime=true;
            for (int num=2;num<i;num++){
                if(i%num==0){
                    checkPrime=false;
                    break;
                }
            }
            if (checkPrime){
                System.out.println(i);
            }
        }


    }
}
