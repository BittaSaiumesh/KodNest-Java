

public class MrthodsOfStrings {
    public static void main(String[] args) {
        String str = "Sai umesh";
        String str1 =" ";
        String str2 = "";
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.length());
        System.out.println(str.trim());
        System.out.println(str.substring(3));
        System.out.println(str.substring(3,6));
        System.out.println(str.replace('a','z'));
        System.out.println(str.replace("umesh","janu"));
        System.out.println(str.charAt(5));
        System.out.println(str.indexOf('u'));
        System.out.println(str.isEmpty());
        System.out.println(str1.isEmpty());
        System.out.println(str2.isEmpty());
        System.out.println(str2.isBlank());
        System.out.println(str1.isBlank());
        System.out.println(str.contains("sai"));
        System.out.println(str.contains("Umesh"));
        System.out.println(str1.contains("sai"));
        System.out.println(str2.contains("sai"));
        System.out.println(str.startsWith("sai"));
        System.out.println(str.startsWith("Umesh"));
        System.out.println(str1.startsWith("sai"));
        System.out.println(str2.startsWith("sai"));
        
    }
    
}
