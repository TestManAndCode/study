package LinkedList;

/**
 * 双端链表
 */
public class DoubkePointLinkedList extends LinkedList.SingleLinkedList {
    private Node head;
    private Node last;
    private int size;

    private class Node {
        private Object data;
        private Node next;

        public Node(Object o) {
            this.data = o;
        }
    }

    public DoubkePointLinkedList() {
        head = null;
        size = 0;
        last = null;
    }

    public Object addHead(Object o) {
        Node node = new Node(o);
        if (size == 0) {
            head = node;
            last = node;
        }
        node.next = head;
        head = node;
        size++;
        return head;
    }

    public void addLast(Object o) {
        Node node = new Node(o);
        if (size == 0) {
            head = node;
            last = node;
            return;
        }
        last.next = node;
        last = node;
        size++;
    }

    public boolean delHead() {
        if (size == 0) {
            return false;
        }
        head = head.next;
        size--;
        return true;
    }

}
