class Strings
 {
    public static void main(String[] args) 
    {
        String str1 = "navya";
        String str2 = " Navya Swetha  ";
        String str3= "swetha";

        System.out.println(str1);
        System.out.println( str1.length());
        System.out.println("String  in Uppercase: " + str1.toUpperCase());
        System.out.println("String  in Lowercase: " + str1.toLowerCase());
        System.out.println("String 1 equals String 2 (case-sensitive): " + str1.equals(str2));
        System.out.println("String 1 equals String 3 (case-insensitive): " + str1.equalsIgnoreCase(str3));
         System.out.println(str1.charAt(1));
         System.out.println(str2.indexOf('d'));
    }
 }