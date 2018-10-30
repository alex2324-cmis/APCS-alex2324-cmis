public class Fundamentals2
{
    public static void main(String args[]){
        int[] array = {1,2,4,6,8};
        double[] arrayy = {1.4, 2.5,3.6,2.6,6.7};
        String[] arrayyy = {"Hellow", "World", "Dog", "Moooo", "House"};
        System.out.println(array [0]);
        System.out.println(arrayy [2]);
        System.out.println(arrayyy [4]);
    }
    //end number 1
    public static void printArray(int[] array, boolean skip){  
        int x = 0;
        int y = 0;
        if(skip == true){
            while(x < array.length){
                System.out.println(array[x]);
                x += 2;
            }
        }
        else if(skip == false){
            while (y < array.length){
                System.out.println(array[y]);
                y += 1;
            }
        }
    }
    //end number 2
    public static void printArray(double[] array, boolean skip){  
        int x = 0;
        int y = 0;
        if(skip == true){
            while(x < array.length){
                System.out.println(array[x]);
                x += 2;
            }
        }
        else if(skip == false){
            while (y < array.length){
                System.out.println(array[y]);
                y += 1;
            }
        }
    }
    //end number 2
    public static void printArray(String[] array, boolean skip){  
        int x = 0;
        int y = 0;
        if(skip == true){
            while(x < array.length){
                System.out.println(array[x]);
                x += 2;
            }
        }
        else if(skip == false){
            while (y < array.length){
                System.out.println(array[y]);
                y += 1;
            }
        }
    }
    //end number 2
    public static void printArray(boolean[] array, boolean skip){  
        int x = 0;
        int y = 0;
        if(skip == true){
            while(x < array.length){
                System.out.println(array[x]);
                x += 2;
            }
        }
        else if(skip == false){
            while (y < array.length){
                System.out.println(array[y]);
                y += 1;
            }
        }
    }
    //end number 2
    public static void lastItem(int[] array){
        int answer = array[array.length-1];
        System.out.println(answer);
    }
    //end number 3
    public static void lastItem(double[] array){
        double answer = array[array.length-1];
        System.out.println(answer);
    }
    //end number 3
    public static void lastItem(String[] array){
        String answer = array[array.length-1];
        System.out.println(answer);
    }
    //end number 3
    public static void lastItem(Boolean[] array){
        Boolean answer = array[array.length-1];
        System.out.println(answer);
    }
    //end number 3
    public static void MiddleItem(int[] array){
        if (array.length % 2 != 0){
            int solution = array[array.length/2];
            System.out.println(solution);        
        }
        else {
            int solution = array[(array.length/2) - 1];
            System.out.println(solution);
        }
    }
    //end number 4
    public static void MiddleItem(double[] array){
        if (array.length % 2 != 0){
            double solution = array[array.length/2];
            System.out.println(solution);        
        }
        else {
            double solution = array[(array.length/2) - 1];
            System.out.println(solution);
        }
    }
    //end number 4
    public static void MiddleItem(String[] array){
        if (array.length % 2 != 0){
            String solution = array[array.length/2];
            System.out.println(solution);        
        }
        else {
            String solution = array[(array.length/2) - 1];
            System.out.println(solution);
        }
    }
    //end number 4
    public static void MiddleItem(Boolean[] array){
        if (array.length % 2 != 0){
            Boolean solution = array[array.length/2];
            System.out.println(solution);        
        }
        else {
            Boolean solution = array[(array.length/2) - 1];
            System.out.println(solution);
        }
    }
    //end number 4
    public static int[] randomInts(int n, int min, int max){
        int [] num = new int[n];
        for(int x = 0; x < n; x++){
            int d = (int)((Math.random() * (max - min) + min));
            num [x] = d;
        }
        return num;
    }
    //end number 5
    public static double[] randomDoubles(int n, double min, double max){
        double [] num = new double[n];
        for(int x = 0; x < n; x++){
            double d = (double)((Math.random() * (max - min) + min));
            num [x] = d;
        }
        return num;
    }
    //end number 6
    public static int[] copy(int[] array){
        int[] errey  = new int[array.length];
        int x = 0;
        while (array.length > x)
        {
            errey [x] = array [x];
            x++;
        }
        return array;
    }
    //end number 7
    public static int[] pairs(int n){
        int[] array = new int[n * 2];
        int y = 1;
        for (int x = 0; x < array.length; x+=2){
            array[x] = y * 2;
            array[x + 1] = y * 2;
            y++;
        }
        return array;
    }
    //end number 8
    public static int[] concat(int[] a, int[] b){
        int[] array = new int[a.length + b.length];
        int z = 0;
        for(int x = 0; x < a.length; x++){
            array[x] = a[x];
        }
        for (int d = a.length; d < array.length; d++){
            array[d] = b[z];
            z++;
        }
        return array;
    }
    //end number 9
    public static int[] merge(int[] a, int[] b){
        int array[] = new int[a.length + b.length];
        int arr[] = new int[0];
        int small = 0;
        int big = 0;
        if (a.length > b.length){
            big = a.length;
            small = b.length;
            arr = a;
        }
        else if(b.length > a.length){
            big = b.length;
            small = a.length;
            arr = b;
        }

        for (int x = 0; x < small; x++){
            array[2*x] = a[x];
            array[2*x+1] = b[x];
        }
        for(int y = small*2; y < array.length; y++){
            array[y] = arr[small];
            small++;
        } 
        return array;
    }
    //end number 10
    public static int[] reverse(int[] array){
        for(int i = 0; i < array.length/2; i++)
        {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array; 
    }
    //end number 11
    public static int[] subArray(int[] array, int start, int stop){
        int arrayy[] = new int [stop-start];
        int b = 0;
        while(b < arrayy.length){
            for(int a = 0; a < array.length; a++){
                if (start == array[a]){
                    arrayy[b] = array[a];
                    b++;
                }
                else if (stop == array[a]){
                    arrayy[b] = array[a];
                }
                else{
                    
                }
            }
        }
        return array;
    }
}
