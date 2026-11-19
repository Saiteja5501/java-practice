public class ZeroMatrix{
    public static void main(String[] args){
        int[][] arr= {{0,0,0},{0,0,0},{0,0,0}};
        boolean found = true;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]!=0){
                    found = false;
                    break;
                }
            }
            if(!found){
            break;
            }
        }
        if(found){
            System.out.println("zero matrix");
        }
        else{
            System.out.println("not zero matix");
        }
    }
}