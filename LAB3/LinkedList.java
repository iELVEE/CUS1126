import java.util.NoSuchElementException;

public class LinkedList {
    private Node first;

    public LinkedList() { first = null; }
    public Object getFirst()
    {
        if (first == null) { throw new NoSuchElementException(); }
        return first.data;
    }

    public void addFirst(Object element)
    {
        // put your code here
        if (first == null) {
            first = new Node();
        }
        else{
            Node next = new Node();
            next.data = first.data;
            next.next = first.next;
            first.next = next;
        }
        first.data = element;
    }

    public String toString()
    {
        String temp = "";
        Node current = first;
        while (current != null)
        {
            temp = temp + current.data.toString() + '\n';
            current = current.next;
        }
        return temp;
    }
    class Node
    {
        public Object data;
        public Node next;
    }
}