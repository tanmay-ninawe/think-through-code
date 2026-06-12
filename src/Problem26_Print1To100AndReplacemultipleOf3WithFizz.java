import java.util.Arrays;

public class Problem26_Print1To100AndReplacemultipleOf3WithFizz {

    public static void main(String[] args) {

        // Print 1 to 100 but replace multiples of 3 with "Fizz"

        for(int i=1; i<=100; i++){
            if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            else{
                System.out.println(i);
            }
        }
        
         /*
         * ################# Logic
         * print the all 1 - 100 numbers
         * Then check the numbs which are divided by 3 
         * then replace that 3 divisble numbs with Fizz
         * 
         */

    }
    }

