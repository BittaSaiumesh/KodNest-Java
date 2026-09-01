package Arrays;
import java.util.*;
public class InsertingIndexPostion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0 ;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int arr2[]=new int[n+1];
        for(int i =0 ; i<n ;i++){
            arr2[i]=arr[i];
        }
        int index = sc.nextInt();
        int val = sc.nextInt();
        for(int i = arr2.length-1;i>=index;i--){
            arr2[i]=arr2[i-1];
        }   
        arr2[index]=val;
        for(int i =0 ;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
        sc.close();
    }
    
}
