
public class Problem9_SumOfDigits {

    public static void main (String[] args){

        int digit = 12345;
        int sum = 0;

        // String str = String.valueOf(digit);
        // for(int i=0; i<str.length(); i++){
        //     char ch = str.charAt(i);
        //     int chr = Character.getNumericValue(ch);
        //     sum = sum + chr;
        // }


       while (digit > 0) {
            // Step 1: get the last digit of 'digit' using % 10
            //         store it in a variable called 'lastDigit'
            int lastDigit = digit %10;
            
            
            // Step 2: add lastDigit to sum
            sum = sum + lastDigit; 
            
            
            // Step 3: remove the last digit from 'digit' using / 10

            int g = lastDigit/10;
            break;
            
            
        }

        System.out.println(sum);
}

}