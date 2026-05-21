public class Problem10_CheckWordIsPallindrome {

    public static void main(String[] args) {
        
    String parent = "madam";
    String reserved = "";
    
    for(int i=parent.length()-1; i>=0; i--){

        char gg = parent.charAt(i);
        reserved += gg;
    }

    boolean compare = parent.equalsIgnoreCase(reserved); 
    // System.out.println("Given String is :" + compare);

    if (compare) {
        System.err.println("Given string is Pallindrome");
    }
    else {
        System.err.println("Given string is not Pallindrome");
    }


    

    


    
}
}
