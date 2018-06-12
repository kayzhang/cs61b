package list;

public class LockDList extends DList {
    protected LockDListNode newNode(Object item, DListNode prev, DListNode next) {
        return new LockDListNode(item, prev, next);
    }

    public void lockNode(DListNode node) {
        LockDListNode lockNode = (LockDListNode) node;
        lockNode.isLocked = true;
    }

    public void remove(DListNode node) {
        LockDListNode lockNode = (LockDListNode) node;
        if (!lockNode.isLocked) super.remove(node);
    }
}
