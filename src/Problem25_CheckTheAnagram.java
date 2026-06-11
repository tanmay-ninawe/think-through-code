import java.util.Arrays;

public class Problem24_CheckTheAnagram {

    public static void main(String[] args) {

        // Check if "tanmay" and "manyat" are anagrams (true/false)

        String word1 = "Tanmay";
        String word2 = "manyat";

        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();

        char[] array_word1 = word1.toCharArray();
        Arrays.sort(array_word1);
        System.out.println(array_word1);

        char[] array_word2 = word2.toCharArray();
        Arrays.sort(array_word2);
        System.out.println(array_word2);

        boolean final_result = Arrays.equals(array_word1, array_word2);
        if (final_result == true) {
           System.out.println("Anagram");  
        }
        else{
            System.out.println("Not Anagram");
        }





               
        }    
        
         /*
         * ################# Logic
         * Convert the string in the lower case using -> str.toLowerCase()
         * Store character in array using  -> .toCharArray
         * comparing both the string using -> Arrays.equals(array_word1, array_word2);
         * adding condition for printing the result.
         * 
         */

    }

