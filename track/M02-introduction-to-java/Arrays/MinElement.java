
import java.util.*;
public class MinElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int b = sc.nextInt();
        int[] arr = new int[b];
        System.out.println("Enter the elements:");
        for(int i=0;i<b;i++){
            arr[i]=sc.nextInt();
        }
        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println(min);
        sc.close();
    }
    
}
