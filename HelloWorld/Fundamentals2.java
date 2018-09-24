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
    public static void lastItem(double[] array){
        int x = 0;
        int y = 0;
        
    }
}