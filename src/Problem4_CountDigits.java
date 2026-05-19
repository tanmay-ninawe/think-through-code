public class Problem4_CountDigits {


    public static void main (String[] Args) {

        int digit = 12345;
        int count = 0;

        while (digit > 0) {
            digit = digit / 10;
            count ++;
        }
        System.out.println(count);
    }
}
