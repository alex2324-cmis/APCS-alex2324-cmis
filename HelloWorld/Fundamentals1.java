
public class Fundamentals1
{
    public static void main(String args[]){
        dataTypes();
        add(10, 60);
        sub(50, 20);
        mul(2,9);
        div(16,8);
        add(100.43,20.54);
        sub(324.23,233.23);
        mul(23.2,22.3);
        div(8.5,4.5);
        compare (10,10);
        evenOddZero(2);
    }
    
    public static void dataTypes(){
        byte a = 0b00010100;
        short s = 10000;
        int b = 100000;
        long c = 100000L;
        float d = 234.5f;
        double e = 123.4;
        boolean f = true;
        char g = 'A';
        String h = "Byte data type is an 8-bit signed two's complement integer";
        String i = "Byte can represent the amount of fingers a person has, the amount of pencils a person has, and the amount of toes a person has";
        String j = "Short data type is a 16-bit signed two's complement integer";
        String k = "Short can represent the amount of sleep that I want (in seconds), the amount of pandas alive, and the amount of tissue I use in a month";
        String m = "Int data type is a 32-bit signed two's complement integer.";
        String l = "Int can represent the amount of calories 15 people consumed in their lifetime, the amount of seconds I live, amount of money a company can lose";
        String n = "Long data type is a 64-bit signed two's complement integer";
        String o = "Long data can represent a light year in meters, Long can represent the amount of toilet paper rolls the world uses in a billion years,the diameter of Jupiter";
        String p = "Float data type is a single-precision 32-bit IEEE 754 floating point";
        String q = "Float can be represented as 1 million light year in cenimeters, the diameter of milky way, diameter of Andromeda Galaxy";
        String r = "Double data type is a double-precision 64-bit IEEE 754 floating point";
        String t = "Double can be represented as one quintillion Jeff Bezos's net worth, the amount of time everyone in the world spends sleeping in their lifetime, the diameter of Kepler-39 ";
        String u = "Boolean data type represents one bit of information";
        String v = "Boolean can be represented as am I a boy?, Is it 6 pm?, and Is this color red?";
        String w = "Char data type is a single 16-bit Unicode character";
        String x = "Char can represent the most expensive keyboard in Cambodian riel, amount of Bornean orangutan left in the world, and the amount of mosquitoes people catch in Thailand";
        System.out.println("Example data types :");
        System.out.println("byte : 0b00010100");
        System.out.println("short : 10000");
        System.out.println("int : 100000");
        System.out.println("long : 100000L");
        System.out.println("float : 234.5f");
        System.out.println("double : 123.4");
        System.out.println("boolean : true");
        System.out.println("char : 'A'");
    }
    
    public static int add(int a, int b){
        int add = a + b;
        return add;
    }
    
    public static int sub(int a,int b){
        int sub = a - b;
        return sub;
    }
    
    public static int mul(int a, int b){
        int mul = a * b;
        return mul;
    }
    
    public static int div(int a, int b){
        int div = a / b;
        return div;
    }
    
    public static double add(double a, double b){
        double add = a + b;
        return add;
    }
    
    public static double sub(double a, double b){
        double sub = a - b;
        return sub;
    }
    
    public static double mul(double a, double b){
        double mul = a * b;
        return mul;
    }
    
    public static double div(double a, double b){
        double div = a / b;
        return div;
    }
    
    public static void compare(int a, int b){
        if (a<b) {
         System.out.format("The value of a is %d and it is less than b whose value is %d%n", a,b);
        }
        else if (a>b) {
            System.out.format("The value of b is %d and it is less than a whose value is %d%n", a,b);
        }
            
        else{
            System.out.format("The value of a which is %d and b which is %d are equal %n", a,b);
        }
    }
    
    public static void evenOddZero(int a){
        if(a % 2 == 0) {
            System.out.println(1);
        }
        
        if(a % 2 != 0){
            System.out.println(-1);
        }
        
        if (a == 0){
            System.out.println(0);
        }
    }
    
    public static void sqareTable(){
        int a = 1;
        int b = 1;
        for(a = 1; a<=10; a++){
            b = a * a;
            int random = (int )(Math.random() * ((b - a)+1)) + a;
            System.out.format("%d\t%d\t%d\n", a,b,random);
        }
    }
    
    public static int triangle(int a){ 
        int b = 0;
        for (a = a;a >= 1; a--){
           b += a;
        }
        return b;
    }
    
    public static int pyramid(int a ){
        int b = 0;
        for (a = a; a>= 1; a--){
            b += (a*a);
        }
        return b;
    }
} 