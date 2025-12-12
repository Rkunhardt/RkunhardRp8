package h2;

public class SimpleList {
    public Node head;

    public SimpleList() {
        this.head = new Node(Integer.MIN_VALUE);
        this.head.next = null;
    }

    public Node getFirst() {
        return this.head.next;
    }

    public Node getLast() {
        Node current = this.head;
        while (current.next != null) {
            current = current.next;
        }
        if (current == this.head) {
            return null;
        }
        return current;
    }

    public void append(int newValue) {
        Node newNode = new Node(newValue);
        Node current = this.head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public Node findFirst(int value) {
        Node current = this.head.next;
        while (current != null) {
            if (current.value == value) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public boolean insertAfter(int preValue, int newValue) {
        Node current = this.head.next;
        while (current != null) {
            if (current.value == preValue) {
                Node newNode = new Node(newValue);
                newNode.next = current.next;
                current.next = newNode;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public boolean delete(int value) {
        Node current = this.head;
        while (current.next != null) {
            if (current.next.value == value) {
                current.next = current.next.next;
                return true;
            }
            current = current.next;
        }
        return false;
    }
}