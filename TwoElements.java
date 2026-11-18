import java.util.Arrays;

public class TwoElements {
    public static void main(String[] args){
        int[][] nums1 = {{1,2,3}, {4,5,6}};
        int[][] nums2 = {{1,2,3}, {4,5,6}};
        
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums1[i].length;j++){
               for(int k=0;k<nums2[i].length;k++){
                System.out.print(nums1[i][j] + nums2[i][k] + " ");
               }
               System.out.println();
            }
            System.out.println();
        }
        
    }
}
