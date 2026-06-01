public class Problem24_CountAInGivenWord {

    public static void main(String[] args) {

        // Count how many times 'a' appears in "automation"

        String word = "automation";
        int count = 0;

        for(int i=0; i<word.length(); i++){
            char chars = word.charAt(i);
           
            if (chars == 'a') {
                count++;          
            }
        }

         System.out.print("Count of a in the given word is : " + count);
        
        
        
         /*
         * ################# Logic
         * initiating count variable
         * starting for loop to extract the each character. 
         * then separating the each char using charAt(i) and storing those characters in chars variable.
         * then comparing the char with 'a'.
         * if matched then store the count in count variable.
         * 
         * 
         */

    }
}
