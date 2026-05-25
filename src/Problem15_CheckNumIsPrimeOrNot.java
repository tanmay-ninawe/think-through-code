public class Problem15_CheckNumIsPrimeOrNot {

    public static void main(String[] args) {

        // Check if 17 is prime (print true/false)

        // condition 1 : divide the int with self
        // condition 2 : divide the int with 1 y
        // condition 3 : the int should not divide by any other number.

        int num = 100;
        boolean flag = true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                flag = false;
                // System.out.println("Given number is not Prime number : " + num);
                break;
            }

        }
        if (flag == false) {
            System.out.println(" not Prime");
        } else {
            System.out.println("prime");
        }
    }

}
