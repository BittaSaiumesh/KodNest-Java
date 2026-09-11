import java.util.*;
public class ReverseTheString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        char arr[] = str.toCharArray();
        int j=arr.length-1;
        int i=0;
        while(i<j){
            char temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        String str2 = new String(arr);
        System.out.println("Reversed String: "+str2);
        System.out.println("Original String: "+str);
    }
}
