import java.util.*;
public class TwoDArray {
    public static void main(String[] args){
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};
        int[][] res = new int[arr1.length][arr1.length];
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                res[i][j] = arr1[i]+arr2[j];
            }
        }
        System.out.println(Arrays.deepToString(res));
    }
}
