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
}
