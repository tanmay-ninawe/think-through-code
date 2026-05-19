public class Problem2_PrintEvenNumbers {

    public static void main(String[] args)  throws Exception {
        int num = 20;
        for(int i=0; i<=num; i++) {
            if(i%2 == 0) {
                System.out.println(i);
            }
        }
    }
}
