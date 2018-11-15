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
        int y = 0;
        int z = 0;
        if(rowMajor == true){
            while (y < array.length){
                for(int x = 0; x < array[0].length; x++){
                    System.out.print(array[y][x] + " ");
                }
                y++;
                System.out.print("\n");
            }
        }
        else{
            while (z < array.length){
                for(int a = 0; a < array[0].length; a++){
                    System.out.print(array[a][z] + " ");
                }
                z++;
                System.out.print("\n");
            }
        }
    }

    public static void snakePrint(int[][] arr){
        for(int x = 0; x < arr.length; x++){
            if(x % 2 == 0){
                for(int y = 0; y < arr[x].length; y++){
                    System.out.print(arr[x][y] + " ");
                }
            }
            else{
                for (int z = arr[x].length-1; z >= 0; z--){
                    System.out.print(arr[x][z] + " ");
                } 
            }
        }
    }

    public static String[][] locate(String[][] arr){
        for(int x = 0; x < arr.length; x++){
            for(int y = 0; y < arr[x].length; y++){
                //if(arr[x][y] ){
                    //int randomNum = (int)(Math.random() * ((10 - 1) + 1));
                //}
            }
        }
        return arr;
    }
}
