package Task2;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    // Add a new node to the end of the list
    public void append(int data) {
        Node newNode = new Node(data);
        if (this.head == null) {
            this.head = newNode;
            return;
        }
        Node currentNode = this.head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    // Add a new node to the beginning of the list
    public void prepend(int data) {
        Node newNode = new Node(data);
        newNode.next = this.head;
        this.head = newNode;
    }

    // Remove the first occurrence of a node with the given value
    public void delete(int data) {
        if (this.head == null) {
            return;
        }
        if (this.head.data == data) {
            this.head = this.head.next;
            return;
        }
        Node currentNode = this.head;
        while (currentNode.next != null) {
            if (currentNode.next.data == data) {
                currentNode.next = currentNode.next.next;
                return;
            }
            currentNode = currentNode.next;
        }
    }

    // To Make Sorting Linked List
    public void sort() {
        if (head == null || head.next == null) {
            return;
        }
        boolean swapped;
        do {
            swapped = false;
            Node current = head;
            Node previous = null;
            while (current.next != null) {
                if (current.data > current.next.data) {
                    Node temp = current.next;
                    current.next = temp.next;
                    temp.next = current;
                    if (previous == null) {
                        head = temp;
                    } else {
                        previous.next = temp;
                    }
                    previous = temp;
                    swapped = true;
                } else {
                    previous = current;
                    current = current.next;
                }
            }
        } while (swapped);
    }


    // Print the elements of the linked list
    public void printList() {
        Node currentNode = this.head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

}
