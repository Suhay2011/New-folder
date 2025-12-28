import java.util.*;
 public class user {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Hello User please Enter your name :");
        String name=sc.nextLine();
        System.out.println("Enter your lucky number");
        int lucky=sc.nextInt();
        System.out.println("Hello "+name+", Your lucky number " + lucky +" SHows you are really hard working. Keep it Up!");
    }
}