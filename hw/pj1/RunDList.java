public class RunDList {
    Run head;
    Run tail;
    private int size;

    public RunDList() {
        head = null;
        tail = null;
        size = 0;
    }

    public RunDList(int[] i) {
        head = new Run(i);
        tail = head;
        size = 1;
    }

    public void insertEnd(int[] i) {
        if (size == 0) {
            head = new Run(i);
            tail = head;
            size = 1;
        } else {
            tail.next = new Run(i);
            tail.next.prev = tail;
            tail = tail.next;
            size++;
        }
    }

    public void insertNext(Run run, int[] i) {
        if (run == tail) {
            run.next = new Run(i);
            run.next.prev = run;
            tail = run.next;
        } else {
            Run temp = run.next;
            run.next = new Run(i);
            run.next.prev = run;
            run.next.next = temp;
            run.next.next.prev = run.next;
        }
        size++;
    }

    public void deleteRun(Run run) {
        if (size == 1) {
            head = null;
            tail = null;
            size = 0;
        } else if (run == head) {
            head = head.next;
            head.prev = null;
            size--;
        } else if (run == tail) {
            tail = tail.prev;
            tail.next = null;
            size--;
        } else {
            run.prev.next = run.next;
            run.next.prev = run.prev;
        }
    }
}
