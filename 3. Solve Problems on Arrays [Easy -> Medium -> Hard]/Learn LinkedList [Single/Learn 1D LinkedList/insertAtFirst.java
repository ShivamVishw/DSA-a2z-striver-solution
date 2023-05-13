import java.util.LinkedList;

class insertAtFirst {
    class Node {
        int data;
        Node next;
    }
    Node head;

    // Function to add element at the first position in the linkedList
    void addFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;

        //If head is equal to null then newNode will automatically be first element
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    void printList() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        insertAtFirst list = new insertAtFirst();

        list.addFirst(23);
        list.addFirst(24);
        list.addFirst(25);
        list.addFirst(28);

        list.printList();
    }
}
