public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] arr1 = {{2,3,4,5},{5,6,7,8}};
        //int[][] arr2 = {{3,4,5,6},{7,8,9,2}};

        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;++j){
                System.out.println(arr1[i][j]);
                //System.out.println();
               // System.out.println(arr2[i][j]);
            }
        }

        System.out.println();
    }
}
