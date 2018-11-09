public class FundamentalsIII
{
    public static void main(String[]Args){
        int [][]defaultintarray = new int [5][5];
        int [][]literalintarray = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        String [][]literalstringarray = {{" ", "#", " ", "#", " ", "#", " ", "#"},{"#", " ", "#", " ", "#", " ","#", " "},{" ", "#", " ", "#", " ", "#", " ", "#"},{"#", " ", "#", " ", "#", " ","#", " "}};
    }
    public static int Choose(int[][] arr, int r, int c){
        int out = arr[r][c];
        return out;
    }
    public static double Choose(double[][] arr, int r, int c){
        double out = arr[r][c];
        return out;
    }
    public static String Choose(String[][] arr, int r, int c){
        String out = arr[r][c];
        return out;
    }
    public static void setValue(int[][] arr, int r, int c, int v){
        arr[r][c] = v; 
    }
    public static void setValue(double[][] arr, int r, int c, double v){
        arr[r][c] = v; 
    }
    public static void setValue(String[][] arr, int r, int c, String v){
        arr[r][c] = v; 
    }
    public static void print2DArray(int[][] array, boolean rowMajor){
        int v = 2;
        int d = 0;
        int z = 0;
        int b = 0;
        if(rowMajor == true){
            while(v < array[0].length){
                for(int x = 0; x < array[0].length; x++){
                    d = array[0][x];            
                }
                v++;
            }
            while(v < array[1].length){
                for(int x = 0; x < array[1].length; x++){
                    z = array[1][x];            
                }
                v++;
            }
            while(v < array[2].length){
                for(int x = 0; x < array[2].length; x++){
                    b = array[2][x];            
                }
                v++;
            }
            System.out.format("%d,%d,%d",d,z,b);
        }
        else if(rowMajor == false){

        }
    }
}
