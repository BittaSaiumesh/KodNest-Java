import java.util.*;
public class InsertingElement {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int insert=sc.nextInt();
        int [] arr2=new int[n+1];
        for(int i=0;i<n;i++){
            arr2[i]=arr[i];
        }
        arr2[n]=insert;
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
        sc.close();
    }
    
}
