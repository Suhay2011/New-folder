class animal {
    void eat() {
        System.out.println("eating ... Aninal class .. eat method");
    }
}

class Lion extends animal {
    void roar() {
        System.out.println("Roar ... Lion class ... roar method");
    }
}

class Babylion extends Lion {
    void weep() {
        System.out.println("Weeping ... Babylion class ... weep method");
    }
}

class Main {
    public static void main(String args[]) {
        Babylion obj = new Babylion();
        obj.weep();
        obj.roar();
        obj.eat();
    }
}
