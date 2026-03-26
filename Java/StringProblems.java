public class StringProblems {
    public static void main(String[] args) {

        //Reverse a String
        String str1="Helloi";
        String str2="";
        for(int i=str1.length()-1;i>=0;i--){
            str2+=str1.charAt(i);
        }
        System.out.println(str2);


        //Palindrome
        if(str1.equals(str2)){
            System.out.println("Its palindrome");
        }


        //Vowels and constant
        int vowels=0;
        int constant=0;
        String[] arr=str1.split("");
        for(int i=0;i<arr.length;i++){
            if(arr[i]=="a"|| arr[i]=="e" || arr[i]=="i" || arr[i]=="o" || arr[i]=="u"){
                vowels++;
            }
            else{
                constant++;
            }
        }
        System.out.println("Vowels " + vowels);
        System.out.println("Constant " + constant);



        //Remove Duplicates
        str1="Hello";
        str2="";
        String[] arr1=str1.split(""); // {"H","e","l","l","o"}
        for(int i=0;i<str1.length();i++){
           if(!str2.contains(arr1[i])){
            str2+=arr1[i];
           }
        }
        System.out.println("str2: "+str2);


        //Count Words
        String word="Hello i m Karthick";
        String[] words=word.split(" ");
        System.out.println(words.length);

        

    }
}
