public class Node {
    int dado;
    Node next;
    Node prev;

    public Node(int dado) {
        this.prev = null;
        this.next = null;
        this.dado = dado;
    }
}
