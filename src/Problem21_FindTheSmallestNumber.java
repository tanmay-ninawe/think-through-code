import java.util.Arrays;

public class Problem21_FindTheSmallestNumber {

    public static void main(String[] args) {

        // Find smallest of 3 numbers: 88, 12, 45

        int[] yo = { 88, 12, 45 };
        Arrays.sort(yo);
        System.out.println(yo[0]);


//---------------------------------------------------------------------

int smallest = yo[0];

        for(int i=0; i<=yo.length-1; i++){
            if (smallest > yo[i]) {
                smallest = yo[i];                
            }
        }

        System.out.println(smallest);

        /*
         * ################# Logic
         * Approach 1 
         * - Use Arrays.sort to sort the elements. 
         * - then print the first element of the array.
         * 
         * Approach 2
         * - Assume the first element as smallest
         * - then start the loop and check every integer.
         * - then compare that with array of i and if the element is smaller than smallest then store that in the smalled variable.
         */

    }
}
