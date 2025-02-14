public class Node {
    int data;
    Node next;
    Node back;

    Node(int data1, Node next1, Node back1) {
        this.data = data1;
        this.next = next1;
        this.back = back1;
    }

    Node(int data1) {
        this.data = data1;
        this.next = null;
        this.back = null;
    }
}

class doublylinkedlist {
    public static Node convertarrtoDLL(int[] arr) {
        Node head = new Node(arr[0]);
        Node prev = head;

        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i], null, null);
            temp.back = prev;
            prev.next = temp;
            prev = temp;
        }
        return head;
    }

    public static void printDLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    // delete head of linked list
    public static Node deletehead(Node head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return null;
        }
        Node prev = head;
        head = head.next;
        head.back = null;
        prev.next = null;
        return head;
    }

    public static Node deletetail(Node head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return null;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        Node prev = temp;
        temp = temp.next;
        temp.back = null;
        temp.next = null;
        prev.next = null;

        return head;
    }

    // Delete kth Element of doubly linked list
    public static Node deletekth(Node head, int k) {
        int count = 0;
        Node temp = head;
        if (k == 1) {
            head = deletehead(head);
        } else {
            while (temp != null) {
                count++;
                if (count == k) {
                    Node prev = temp.back;
                    Node front = temp.next;
                    if (prev == null && front == null) {
                        return null;
                    } else if (prev == null) {
                        temp = temp.next;
                        temp.next.back = null;
                        return head;
                    } else if (front == null) {
                        temp.back.next = null;
                        temp.back = null;
                        return head;
                    } else {
                        prev.next = temp.next;
                        front.back = prev;
                    }
                } else {
                    temp = temp.next;
                }
            }
        }
        return head;
    }

    // public static Node deleteel(Node head, int k) {
    // int count = 0;
    // Node temp = head;
    // if (k == 1) {
    // head = deletehead(head);
    // } else {
    // while (temp != null) {
    // count++;
    // if (temp.data == k) {
    // Node prev = temp.back;
    // Node front = temp.next;
    // if (prev == null && front == null) {
    // return null;
    // } else if (prev == null) {
    // temp = temp.next;
    // temp.next.back = null;
    // return head;
    // } else if (front == null) {
    // temp.back.next = null;
    // temp.back = null;
    // return head;
    // } else {
    // prev.next = temp.next;
    // front.back = prev;
    // }
    // } else {
    // temp = temp.next;
    // }
    // }
    // }
    // return head;
    // }
    public static Node insertAtEnd(Node head, int x) {
        Node temp = head;
        Node newnode = new Node(x);
        while (temp != null) {
            temp = temp.next;
        }

        temp = newnode;
        return head;
    }

    public static Node deleteNode(Node head, int x) {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            if (count == x) {
                Node prev = temp.back;
                Node front = temp.next;
                prev.next = temp.next;
                front.back = temp.back;
                break;
            } else {
                temp = temp.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        int[] arr = { 29, 78 };
        Node head = convertarrtoDLL(arr);
        // head = deletehead(head);
        // head = deletetail(head);
        head = deletekth(head, 1);

        // head = insertAtEnd(head, 8);
        // head = deleteNode(head, 1);
        printDLL(head);
    }
}
