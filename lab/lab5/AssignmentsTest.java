public class AssignmentsTest {
    public static void main(String[] args) {
    X[] xa = new X[3];
    Y[] ya = new Y[3];
    X[] xy = new Y[3];

    // Part I: Assignments and Casting
    // ya = xa;            // compile error
    // xa = ya;            // no error
    // ya = (Y[]) xa;      // runtime error
    // ya = (Y[]) xy;      // no error

    // xa = ya;
    // ya = xa;            // compile error

    // xa = ya;
    // ya = (Y[]) xa;      // no error


    }
}

class X {
    //
}

class Y extends X {
    //
}
