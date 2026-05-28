public class Problem18_CheckNumberIsPallindrom {

    public static void main(String[] args) {

       // Check if a number is a palindrome: 121 → true, 123 → false

        int digit = 121;
        int rev = 0;
        int og = digit;

        while (digit > 0) {
            rev = rev * 10 + (digit % 10);
            digit = digit / 10;
            
        }
        System.out.println(rev);

        if (og == rev) {
            System.out.println("Pallindrome");
        }
        else{
            System.out.println("Not Pallindrome");
        }

        /*
         * ################# Logic
         * 
         * 1. use while loop to check the condition
         * 2. use the same logic as we did in reversing the number --> rev = rev * 10 + (digit % 10);
         * 3. then remove the last digit from the given number using digit = digit / 10;
         * 4. Compare the number.
         * 
         * 
         */

    }
}
