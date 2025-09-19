public class RandomPhoneNumber {
    public static void main(String[] args) {
        int max=99999999;
        int min=10000000;
        String prefix="017";
        int random= (int) (Math.random()*(max-min)+min);
        String RandomPhoneNum=prefix+random;
        System.out.println(RandomPhoneNum);

    }
}
