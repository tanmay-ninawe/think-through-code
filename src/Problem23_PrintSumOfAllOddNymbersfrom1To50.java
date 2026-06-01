public class Problem23_PrintSumOfAllOddNymbersfrom1To50 {

    public static void main(String[] args) {

        // Print sum of all odd numbers from 1 to 50

        int sum = 0;

        for(int i=0; i<=50; i++) {
            if (i % 2 != 0) {
                sum = sum + i;   
            }
        }
        System.out.println(sum);

        /*
         * ################# Logic
         * considering the sum as 0
         * then starting the for loop till 50. and making sure that by diving it by 2 the reminder is not zero.
         * then keeping that number in i + sum and assigning that num to sum.
         * printing the sum for the o/p.
         * 
         */

    }
}
