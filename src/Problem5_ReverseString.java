import java.util.Arrays;
import java.util.jar.Attributes.Name;

public class Problem5_ReverseString {

    public static void main (String[] args) {

        String name = "Tanmay";
        String rev = " ";

        for (int i = name.length()-1; i >= 0; i--)
        {
            rev = rev + name.charAt(i);
            
        }
        System.out.print(rev);
        }

    }
    

