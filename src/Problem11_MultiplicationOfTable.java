public class Problem11_MultiplicationOfTable {

    public static void main(String[] args) {
        
   //Print multiplication table of 7 (7×1=7 up to 7×10=70)

   int digit = 7;

   for(int i=1; i<=10; i++){
    int res1 = digit*i;

    System.out.println(digit + "x" + i + " = " + res1);
   }
}
}
