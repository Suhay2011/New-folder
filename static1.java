public class static1 {
   int rollNo;
   String name;
   static String college = "ABC College";
   
   void display() {
    System.out.println("Roll No " + rollNo);
    System.out.println("Name: " + name);
    System.out.println("College: " + college);
    System.out.println();
}
public static void main(String[] args) {
    static1 s1 = new static1();
    s1.rollNo = 101;
    s1.name = "Suhayl";
    static1 s2 = new static1();
    s2.rollNo = 102;
    s2.name = "Hamza";
    s1.display();
    s2.display();
}
}
