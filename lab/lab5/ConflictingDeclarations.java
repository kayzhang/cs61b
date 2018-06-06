public class ConflictingDeclarations extends X implements In{
    public static void main(String[] args) {
        // double x = cons;
        double x = X.cons;

        X m = new X();
        ConflictingDeclarations c = new ConflictingDeclarations();
        c.test(3);
        ((X) c).test(3);
        m.test(3);
        // ((ConflictingDeclarations) m).test(3);
        // c.super.test(3);
        // error: 
    }



    public int test() {
        int a = 3;
        return a;
    }

    public int test(int x) {
        x = 3;
        System.out.println("subclass method");
        return x;
    }
}

class X {
    public static final double cons = 3.14;

    public int test(int x) {
        int a = 3;
        System.out.println("superclass method");
        return a;
    }
}

interface In {
    public static final double cons = 3.13;

    public int test(int y) ;
}
