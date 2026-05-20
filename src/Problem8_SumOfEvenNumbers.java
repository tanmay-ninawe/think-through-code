public class Problem8_SumOfEvenNumbers {


    public static void main(String[] args) {

        // print even numbers
        int even = 100;
        int sum = 0;

        for(int i=0; i<=even; i++){
            if(i%2==0){
                // System.out.println(i);
                sum = i + sum;
            }
                 
        }
            System.out.println(sum);
    }

}
