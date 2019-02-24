package main.java.LinkedList;


/**
 * 单向链表
 * 个单链表的节点(Node)分为两个部分，
 * 第一个部分(data)保存或者显示关于节点的信息，
 * 另一个部分存储下一个节点的地址。
 * 最后一个节点存储地址的部分指向空值。
 * 单向链表只可向一个方向遍历，
 * 一般查找一个节点的时候需要从第一个节点开始每次访问下一个节点，
 * 一直访问到需要的位置。
 * 而插入一个节点，对于单向链表，我们只提供在链表头插入，
 * 只需要将当前插入的节点设置为头节点，
 * next指向原头节点即可。删除一个节点，
 * 我们将该节点的上一个节点的next指向该节点的下一个节点。
 */
public class SingleLinkedList {
    private int size;
    private Node head;

    public SingleLinkedList() {
        size = 0;
        head = null;
    }

    private class Node {
        private Object data;
        private Node next;

        public Node(Object data) {
            this.data = data;
        }
    }

    public Object addHead(Object object) {
        Node node = new Node(object);
        if (size == 0) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }
        size++;
        return head;
    }

    public Object removeHead() {
        Object object = head;
        size--;
        head = head.next;
        return object;
    }

    public Node find(Object o) {
        Node current = head;
        int tempSize = size;
        while (tempSize > 0) {
            if (o.equals(current.data)) {
                return current;
            }
            current = current.next;
            tempSize--;
        }
        return null;
    }

    public boolean delete(Object value) {
        if (size <= 0) {
            return false;
        }
        Node parent = head;
        Node removeNode = head;
        while (removeNode.data != value) {
            if (removeNode.next == null) {
                return false;
            }
            parent = removeNode;
            removeNode = removeNode.next;
        }
        if (head == removeNode) {
            head = head.next;
            return true;
        }
        parent.next = removeNode.next;
        size--;
        return true;

    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public void display() {
        Node printNode = head;
        System.out.print("[");
        while (true) {
            if (printNode == null) {
                System.out.print("]");
                return;
            }
            System.out.print(printNode.data.toString());
            printNode = printNode.next;
        }
    }
}
