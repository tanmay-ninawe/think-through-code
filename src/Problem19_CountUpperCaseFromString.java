public class Problem19_CountUpperCaseFromString {

    public static void main(String[] args) {

       // Count uppercase letters in "Tanmay Loves Java"

        String original = "Tanmay Loves Java";
        int Count = 0;

        for (int i=0; i<original.length(); i++){
              char gg =  original.charAt(i); 
                

                if (Character.isUpperCase(gg)) {
                    Count++;
                }                
                     
                
        }
        System.out.println(Count); 

        
        

        // 

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
