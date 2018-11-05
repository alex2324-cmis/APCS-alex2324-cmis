public class CorrectAnswerQuizII
{
    public static int[] minmax(int[] array){
        int[] output = new int[2];
        int min = array[0];
        int max = array[0];
        for(int x = 1; x < array.length; x ++){
            if(array[x] < min){
                min = array[x];
            }
            else if(array[x]> max){
                max = array[x];
            }
        }
        output[0] = min;
        output[1] = max;
        return output;
    }
    public static int[] filter(int[] array, int min, int max, boolean positive){
        int a = 0;
        if (positive == false){
            for(int x = 0; x < array.length; x ++){
                if(array[x] < min || array[x] > max){
                    a++;
                }
            }
        }else if (positive == true){
            for (int x = 0; x < array.length; x ++){
                if(array[x] >= min && array[x] <= max){
                    a++;
                }
            }
        }
        int[] output = new int[a];
        int y = 0;
                if (positive == false){
            for(int x = 0; x < array.length; x ++){
                if(array[x] < min || array[x] > max){
                    output[y] = array[x];
                    y++;
                }
            }
        }else if (positive == true){
            for (int x = 0; x < array.length; x ++){
                if(array[x] >= min && array[x] <= max){
                    output[y] = array[x];
                    y++;
                }
            }
        }
        return output;
    }
}
