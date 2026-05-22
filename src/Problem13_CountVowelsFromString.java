public class Problem13_CountVowelsFromString {

    public static void main(String[] args) {

        // Count vowels in "automation engineer"

        String quote = "automation engineer";
        int counter = 0;
        int CountA = 0, CountE = 0, CountI = 0, CountO = 0, CountU = 0;

        for (int i = 0; i < quote.length(); i++) {

            char newChar = quote.charAt(i);

            if (newChar == 'a' || newChar == 'e' || newChar == 'i' || newChar == 'o' || newChar == 'u') {
                // System.out.print(newChar);
                counter++;

                if (newChar == 'a') {
                    CountA++;
                } else if (newChar == 'e') {
                    CountE++;
                } else if (newChar == 'i') {
                    CountI++;
                } else if (newChar == 'o') {
                    CountO++;
                } else if (newChar == 'u') {
                    CountU++;
                }
            }
        }
        System.out.println(" total A's in Given String is : " + CountA);
        System.out.println(" total E's in Given String is : " + CountE);
        System.out.println(" total I's in Given String is : " + CountI);
        System.out.println(" total O's in Given String is : " + CountO);
        System.out.println(" total U's in Given String is : " + CountU);
    }

}
