public class TwoD_Array{
    public static int[][] defaultArray(int h, int w){
        int arry2d [][] = new int [h][w];
        int v = 0;
        for(int x = 0; x < arry2d.length; x++){
            for(int y = 0; y < arry2d[0].length; y++){
                int out = arry2d[x][y];
                arry2d[x][y] = v;
                v++;
                System.out.print(v + " ");
            }
            System.out.println();
        }

        return arry2d;
    }
}