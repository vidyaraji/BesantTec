public class string {
    public static void main(String[] args) {
        String str1="Hello Welcome To Java";
        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());
        System.out.println(str1.length());
        System.out.println(str1.charAt(2));
        System.out.println(str1.startsWith("Hel"));
        System.out.println(str1.endsWith("end"));
        String str2=new String("Thanks For Visiting");
        System.out.print(str1.equals(str2));
        String str3=str2.substring(0,6);
        System.out.println(str3);
    }
}
