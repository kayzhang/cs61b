public class Run {
    // item[0] is the length of each run; and item[1], item[2], item[3] are RGB values
    public int[] item;
    public Run prev;
    public Run next;

    Run() {
        item = new int[4];
        prev = null;
        next = null;
    }

    Run(int[] i) {
        item = i;
        prev = null;
        next = null;
    }
}
