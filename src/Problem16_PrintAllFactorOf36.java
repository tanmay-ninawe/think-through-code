public class Problem16_PrintAllFactorOf36 {

    public static void main(String[] args) {

        // Print all factors of 36


        int num = 36;
                
        for(int i=1; i<=num; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }

        

/*
################# Logic 

For num = 36, i = 1: 36 % 1 = 0 → factor ✓
For num = 36, i = 2: 36 % 2 = 0 → factor ✓
For num = 36, i = 3: 36 % 3 = 0 → factor ✓
For num = 36, i = 4: 36 % 4 = 0 → factor ✓
For num = 36, i = 5: 36 % 5 = 1 → not a factor
For num = 36, i = 6: 36 % 6 = 0 → factor ✓
...and so on.

*/        


        

}
}
