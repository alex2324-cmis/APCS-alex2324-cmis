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
    //number 1
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
    //number 2
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
    //number 2
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
    //number 2
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
    //number 2
    public static void lastItem(int[] array){
        int answer = array[array.length-1];
        System.out.println(answer);
    }
    //number 3
    public static void lastItem(double[] array){
        double answer = array[array.length-1];
        System.out.println(answer);
    }
    //number 3
    public static void lastItem(String[] array){
        String answer = array[array.length-1];
        System.out.println(answer);
    }
    //number 3
    public static void lastItem(Boolean[] array){
        Boolean answer = array[array.length-1];
        System.out.println(answer);
    }
    //number 3
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
    //number 4
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
    //number 4
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
    //number 4
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
    //number 4
}