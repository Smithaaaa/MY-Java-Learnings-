public class Arrayss2 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int[][]a ={{1,2},{3,4}};

        int[][]c = {{10,22},{30,40}};

        int[][]c1 = new int[2][2];
        System.out.println(c.length);

        for(int i=0;i<c.length;i++){
            for(int j=0;j<c[i].length;j++){
                System.out.println(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
