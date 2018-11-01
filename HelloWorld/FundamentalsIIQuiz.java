public class FundamentalsIIQuiz
{
    public static int[] minmax(int[] array){
        int array4[] = new int [2];
        int big = array[0];
        int small = array[0];
        for (int x = 0; x < array.length; x++){
            if(array[x] < big){
                big += array4[x];
            }
            big ++;
        }
        for(int y = array[array.length-1]; y < array.length; y++){
            if(array[y] > small){
                small += array4[y];
            }
            small--;
        }
        return array4;
    }

    public static int[] filter(int[] array, int min, int max, boolean positive){
        int array0 [] = new int[10];    
        int x = 0;
        int small = array0[0];
        int big = array0[0];
        if(positive == true){
            for (int y = 0; y < array0.length; y++){
                if(small < array[y] && big > array[y]){
                    //for
                }
            }
        }
        return array0;
    }
}


