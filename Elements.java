import java.util.*;
public class Elements {
    public static void main(String[] args){
        int[][] arr1 = {{1,2,3}, {4,5,6}};
        int[][] arr2 = {{1,2,3}, {4,5,6}};
        int sum = 0;
        int sum2 = 0;
        int total = 0;
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                sum = sum+arr1[i][j];
            }
        }
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr2[i].length;j++){
                sum2 = sum2+arr2[i][j];
            }
        }
        total = sum+sum2;             
        System.out.println(total);
    }
}
