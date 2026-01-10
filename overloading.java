class overloading {
    void add(int a, int b) {
        System.out.println(a + b);
    }
    void add(int a, int b, int c) {
        System.out.println(a + b +c);
    }
    double add(double a, double b) {
        return a + b;
    }
    public static void main(String[] args){
        overloading d = new overloading();
        d.add(10, 20);
        d.add(1, 2, 3);
        System.out.println(d.add(2.5, 3.5));
    }
}