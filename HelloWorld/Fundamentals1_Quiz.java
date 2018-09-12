public class Fundamentals1_Quiz
{
    public static void main(String args []){
        
    }
    public static void method(int a, int b, int c){
        int ac = a * c;
        int bc = b * c;
        int ab = a * b;
        int ca = c * a;
        if (ac>=bc && ac>=ab){
           return int ac;
        }
        else if(bc>=ab && bc>= ac){
            return int bc;
        }
        else if(ca>=ab && ca >= bc){
            return int ca;
        }
    }
    public static void method2(int a, int b){
        for (a = 0; a < 0; a--){
            
        }
    }
    public static void method3(int h, int w){
        if (h % 2 == 0 || w % 2 == 0){
            return "+";
        }
        if (h<0 || w<0){
            return "+";
        }
        if (h& 2 != 0 && w & 2 != 0){} 
    }
}
