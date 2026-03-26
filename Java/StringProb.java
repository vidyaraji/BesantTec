public class StringProb {

    // Print even-length words
    // Insert a string into another string
    // check whether a string is a Palindrome
    // Check Anagram
    // Reverse a String
    // Print a New Line in String
    // Add Characters to a String
    // Iterate Over Characters in String
    // Convert Enum to String
    // Get a Character From the Given String
    // Convert String to String Array
    // Swapping Pair of Characters
    // Split into several sub-strings


    //Anagram
    public static boolean isAnagram(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        char[] arr = new char[s2.length()];
        for (int i = 0; i < s2.length(); i++) {
            arr[i] = s2.charAt(i);
        }

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            boolean found = false;

            for (int j = 0; j < arr.length; j++) {
                if (ch == arr[j]) {
                    arr[j] = '*';
                    found = true;
                    break;
                }
            }

            if (!found) {
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {
        // Print even-length words
        String str1 = "Hello";
        if (str1.length() % 2 == 0) {
            System.out.println(str1 + " is even length Word");
        } else {
            System.out.println(str1 + " is Odd length words");
        }

        // Insert a string into another string (doubt)

        String str2 = "World";
        int i = 2;
        String str3 = str1.substring(0, i);
        String str4 = str1.substring(i);
        str3 += str2 + str4;
        System.out.println(str3);

        // check whether a string is a Palindrome
        str1 = "madam";
        str2 = "";
        for (i = str1.length() - 1; i >= 0; i--) {
            str2 += str1.charAt(i);
        }
        if (str1.equals(str2)) {
            System.out.println("Yes Its palindrome");
        } else {
            System.out.println("No Its Not Palindrome");
        }

        // Check Anagram
        str1 = "listen";
        str2 = "silent";

        if (isAnagram(str1, str2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");

        }

        // Reverse String
        str1="hello";
        str2="";
        for(i=str1.length()-1;i>=0;i--){
            str2+=str1.charAt(i);
        }
        System.out.println("Reversed String: "+ str2);


        // Print a New Line in String
        System.out.println("Hello \nHow Are You");


        // Add Characters to a String
        // subString
        String toAdd="X";
        int position=3;

        String newString= str1.substring(0, position)+toAdd+str1.substring(position);
        System.out.println(newString);



        // Iterate Over Characters in String
        for(char s: str1.toCharArray()){
            System.out.println(s);
        }

       // Get a Character From the Given String
       str1="Anabella";
       char s=str1.charAt(0);
       System.out.println(s);

        // Convert String to String Array

        str1="Inception tenet Intersteller is the best Movie of Christopher Nolan";
        String[] arr=str1.split(" ");
        for(String sh:arr){
            System.out.println(sh);
        }


        // Swapping Pair of Characters
        int ch1=4;
        int ch2=7;
        String swapString="Hello This Is Swap program";
        arr=swapString.split("");
        String ch=arr[ch1];
        arr[ch1]=arr[ch2];
        arr[ch2]=ch;
        swapString=String.join("", arr);
        System.out.println(swapString);


         // Split into several sub-strings
         arr=swapString.split(" ");
    }

}
