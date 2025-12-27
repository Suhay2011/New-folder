public class Opperators {
    public static void main(String[]args){
        
        int a = 10;
        int b = 5;

        System.out.println("Post Increment a++ :" + (a++));
        System.out.println("Pre Increment ++b:" + (++b));
        System.out.println("Addition a + b :" + (a + b));
        System.out.println("Subtraction a - b" + (a - b));
        System.out.println("Multiplication a * b" + (a * b));
        System.out.println("Division a / b" + (a / b));

        int largest = (a >b) ? a : b;
        System.out.println("Largest number :" + largest);
    }
}
