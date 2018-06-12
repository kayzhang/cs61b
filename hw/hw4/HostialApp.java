import list.*;

public class HostialApp {
    public static void main(String[] args) {
        DList l1 = new DList();
        DList l2 = new DList();

        for (int i = 1; i <= 10; i++) {
            l1.insertBack(10 + i);
            l2.insertBack(20 + i);
        }

        show(l1, l2);

        l1.insertAfter(100, l1.front());
        System.out.println("l1.insertAfter(100, l1.front()); // correct");
        show(l1, l2);

        l1.insertAfter(100, l2.front());
        System.out.println("l1.insertAfter(100, l2.front()); // violate the size invariant for both l1 and l2!");
        show(l1, l2);

        l1.remove(l1.front());
        System.out.println("l1.remove(l1.front()); // correct");
        show(l1, l2);

        l1.remove(l2.front());
        System.out.println("l1.remove(l2.front()); // violate the size invariant for both l1 and l2!");
        show(l1, l2);
    }

    public static void show(DList l1, DList l2) {
        System.out.println("l1.size == " + l1.length() + ": " + l1);
        System.out.println("l2.size == " + l2.length() + ": " + l2);
        System.out.println();
    }
}
