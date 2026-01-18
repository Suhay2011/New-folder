abstract class objects {
    abstract void showShape();
    public void shape(){
        System.out.println("I'm form abstract class");
    }
}
class Sphere extends objects{
    void showShape(){
        System.out.println("objects type is Cuboid");
    }
}
class Prism extends objects{
    void showShape(){
        System.out.println("Object type is Prism");
    }
}
class Cuboid extends objects{
    void showShape(){
        System.out.println("Object type is Cuboid");
    }
}
class main2{
    public static void main(String args[]){
        objects obj = new Sphere();
        obj.showShape();
        obj = new Cuboid();
        obj.showShape();
        obj = new Prism();
        obj.showShape();
        obj.shape();
    }
}