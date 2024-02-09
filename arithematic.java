public class arithematic {
    public static int square(int x) {
        return x * x;
    }
    public static int cube(int x) {
        return x * x * x;
    }
    public static int modulus(int x, int y) {
        return x % y;
    }
    public static double power(double x, double y) {
        return Math.pow(x, y);
    }
    public static void main(String[] args) {
        System.out.println(square(5));     
        System.out.println(cube(3));        
        System.out.println(modulus(10, 3)); 
        System.out.println(power(2, 5));   
    }
}
