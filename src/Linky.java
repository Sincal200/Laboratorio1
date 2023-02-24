public class Linky {
    Node head;
    private int size = 0;


    public void insertAtFirst(String item) {
        Node newNode = new Node(item);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void insertAtTail(String value) {
        Node newNode = new Node(value);
        newNode.next = null;
        /* Since this insertion is at tail, this new node will point to null */
        if (null == head) {
            /* When list is empty */
            head = newNode;
        } else {
            Node tempNode = head;
            while (null != tempNode.next) {
                tempNode = tempNode.next;
            }
            tempNode.next = newNode;
        }
        size++;
    }

    public void traverse() {
        Node temp = head;
        System.out.println("");
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public Node searchByIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index passed while searching for a value");
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {

            temp = temp.next;
        }
        System.out.println(temp.data);
        return temp;
    }

    public void deleteFromPosition(int position) {
        if (position < 0 || position >= size) {
            throw new IllegalArgumentException("Position is Invalid");
        }
        /* Conditions check passed, let's delete the node */
        Node nodeToBeDeleted = head;
        for (int i = 0; i < position; i++) {
            nodeToBeDeleted = nodeToBeDeleted.next;
        }
        if (nodeToBeDeleted.next == null) {
            /* If this is a last node */
            deleteFromTail();
        } else {
            nodeToBeDeleted.data = nodeToBeDeleted.next.data;
            nodeToBeDeleted.next = nodeToBeDeleted.next.next;
        }
    }
    public void deleteFromTail() {
        /* If head is null, nothing to delete */
        if (null == head) {
            return;
        }
        /* Keep a pointer on head node and next node.
         * Keep going until next becomes null */
        Node currentNode = head;
        Node nextNode = currentNode.next;
        while (currentNode.next != null && nextNode.next != null) {
            currentNode = currentNode.next;
            nextNode = nextNode.next;
        }
        /* Now we are removing from tail, so tail - 1 node will point to null */
        currentNode.next = null;
        /* Reduce the size */
        size--;
    }

}
