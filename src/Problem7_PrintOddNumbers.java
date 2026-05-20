public class Problem7_PrintOddNumbers {

    public static void main(String[] args) {

        //Print odd numbers from 1 to 50

        for(int i=0; i<=50; i=i+1) {
            if(i%2!=0) {
                System.out.println(i);
            }
        }
    }
}
