package Arrays;

import java.util.*;
class Solution{
    public int [] missingAndRepeat(int[][] arr){
        HashMap <Integer,Integer> map = new HashMap<>();
        for(int i =0; i<arr.length; i++) {
            for(int j =0; j<arr[i].length; j++) {
                map.put(arr[i][j], map.getOrDefault(arr[i][j],0)+1);
            }
        }
        int res[] = new int[2];
        for(int i =0; i<arr.length; i++) {
            if(map.containsKey(i)){
                    res[0]=i;
            }
            else{
                res[1]=i;
            }
        }
        return res;

    }
}

public class RepeatAndMissing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution s = new Solution();
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int arr[][] = new int[rows][columns];
        //int count = 1;
        for(int i =0; i<arr.length; i++) {
            for(int j =0; j<arr[i].length; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        s.missingAndRepeat(arr);
        
        
    }
    
}
