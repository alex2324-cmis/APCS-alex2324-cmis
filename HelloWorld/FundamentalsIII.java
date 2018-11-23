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
        int randomNum = (int)(Math.random() * (arr.length));
        int randomNumm = (int)(Math.random() * ((arr.length)));
        int randomNummm = (int)(Math.random() * ((10 - 1) + 1));
        String v = "" + randomNummm;
        for(int x = 0; x < arr.length; x++){
            for(int y = 0; y < arr[x].length; y++){
                if(arr[randomNum][randomNumm] != " "){
                    arr[randomNum][randomNumm] = v;
                }
            }
        }
        return arr;
    }

    public static int[][] replace(int[][] array, int threshold, int newValue){
        for(int x = 0; x < array.length; x++){
            for(int y = 0; y < array[x].length; y++){
                if(array[x][y] > threshold){
                    array[x][y] = newValue;
                }
            }
        }
        return array;
    }

    public static int[][] shift(int[][] array, int shiftRow){
        double [][] out = new double [array.length][array[0].length];
        for(int row = array.length - 1; row >= 0; row--){
            for(int col = 0; col < array[row].length; col++){
                if(row == shiftRow){
                    if(row == array.length - 1){
                        array[row][col] = (int)(Math.random() * 10);
                    } 
                    else if(row == 0){
                        array[row+2][col] = array[row + 1][col];
                        array[row + 1][col] = array[row][col];
                        array[row][col] = (int)(Math.random() * 10);    
                    }

                    else{
                        array[row + 1][col] = array[row][col];
                        array[row][col] = (int)(Math.random() * 10);    
                    }
                }
            }
        }
        return array;
    }

    public static double[][] tilt(double[][] arr){
        double[][]output = new double [arr.length][arr[0].length];
        for(int a = 0; a < arr.length; a ++){
            for(int b = 0; b < arr[0].length; b++){
                output[b][a] = arr[a][b];
            }
        }
        return output;
    }

    public static int[][] eleven(int[][] array, int width, int height){
        int x = 0;
        int y = 0;
        int a = 0;
        int z = 0;
        int d = 0;
        int p = 0;
        for(int row = 0; row < array.length; row++){
            for(int col1 = 0; col1 < array[0].length; col1++){
                x += array[row][col1];
            } 
        }
        for(int row = 1; row < array.length; row++){
            for(int col2 = 0; col2 < array[0].length; col2++){
                y += array[row][col2];
            } 
        }
        for(int row = 2; row < array.length; row++){
            for(int col3 = 0; col3 < array[0].length; col3++){
                a += array[row][col3];
            } 
        }
        for(int row = 0; row < array.length; row++){
            for(int col1 = 0; col1 < array[0].length; col1++){
                z += array[col1][row];
            } 
        }
        for(int row = 1; row < array.length; row++){
            for(int col2 = 0; col2 < array[0].length; col2++){
                d += array[col2][row];
            } 
        }
        for(int row = 2; row < array.length; row++){
            for(int col3 = 0; col3 < array[0].length; col3++){
                p += array[col3][row];
            } 
        }
        //if (x > y && a && z && d && p){
            
        //}
        return array;
    }
}