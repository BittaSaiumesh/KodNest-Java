import java.util.*;
public class Anagram {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two strings");
        String first = sc.next().toLowerCase();
        String second = sc.next().toLowerCase();
        
        if(first.length() != second.length()){
            System.out.println("Not Anagram");
            return;
        }
        char [] arr = first.toCharArray();
        char [] brr = second.toCharArray();

        Arrays.sort(arr);
        Arrays.sort(brr);

        String a = new String(arr);
        String b = new String(brr);

        if(a.equals(b)){
            System.out.println("Anagram");
        }else{
            System.out.println("Not Anagram");
        }
   
    }
}
