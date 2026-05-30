public class Problem21_PrintMultiplysOf9 {

    public static void main(String[] args) {

       // Print first 10 multiples of 9

       int num = 9;
       int digit = 0;

       for(int i=1; i<=10; i++){
        digit = num * i ;
        System.out.println("Multiply of 9 x " + i + " = " + digit);
       }
        
       

        /*
         * ################# Logic
         * written the for loop to start the iteration for each number.
         * then adding the condition in for loop - to run the loop till 10th iteration.
         * then multiplying that with 9 and i'th index.
         */

    }
}
