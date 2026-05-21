public class Problem11_FindLargestOfThreeNumbers {

    public static void main(String[] args) {
        
   //Find largest of 3 numbers: 24, 67, 19

   int[] a = {24, 67, 19};
   int Largest = 0;

   for(int i=0; i<=a.length-1; i++){
        
        if (a[i] > Largest) {
            Largest = a[i];
        }
   }
   System.out.println("Largest Value from the Array is :" + Largest);
   
   } 

    

    


    
}

