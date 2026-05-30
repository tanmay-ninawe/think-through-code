public class Problem20_SwapNumbersWithoutUsingThirdVariable {

    public static void main(String[] args) {

       // Swap two numbers a=5, b=10 without using a third variable
        int a = 5;
        int b = 10;
      
        a = a + b; //15
        b = a - b; // 15 - 10 = 5
        a = a - b; // 15 - 5 = 10


        System.out.println(a);
        System.out.println(b);
       

        /*
         * ################# Logic
        * a = a + b;  // a = 5 + 10  → a is now 15
        * b = a - b;  // b = 15 - 10 → b is now 5   ✅ (b got a's original value)
        * a = a - b;  // a = 15 - 5  → a is now 10  ✅ (a got b's original value)
         * 
         * 
         * 
         */

    }
}
