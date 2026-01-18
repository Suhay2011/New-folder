 class Hillstation {
    void location(){
        System.out.println("Location is:");
    }
    void famousfor(){
        System.out.println("Famous For:");
    }
}
 class Cape_Town extends Hillstation {
    void location(){
        System.out.println("Cape Town is in Hillstation ");
    }
    void famousfor(){
        System.out.println("it is famous for the Mountain Resembling a mountain");
    }
 }
 class Durban extends Hillstation {
    void location(){
        System.out.println("It is Located in the KwazuluNatal ");
    }
    void famousfor(){
        System.out.println("It is famous for having a great ocean view and enjoyable weather");
    }
 }
class main1{
    public static void main(String [] args){
        Hillstation A = new Hillstation();
        Hillstation M = new Cape_Town();

        Hillstation Mu = new Durban();

        A.location();
        A.famousfor();

        M.location();
        M.famousfor();

        Mu.location();
        Mu.famousfor();
    }
}