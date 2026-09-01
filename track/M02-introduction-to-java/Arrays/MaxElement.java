
import java.util.*;
public class MaxElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int b = sc.nextInt();
        int[] arr = new int[b];
        System.out.println("Enter the elements:");
        for(int i=0;i<b;i++){
            arr[i]=sc.nextInt();
        }
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
        sc.close();
    }
    
}
