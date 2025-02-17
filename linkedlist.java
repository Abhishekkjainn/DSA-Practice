//Node datastructure
class Node {
    int data;
    Node next;

    Node(int data1, Node next1) {
        this.data = data1;
        this.next = next1;
    }

    Node(int data1) {
        this.data = data1;
        this.next = null;
    }
}

class linkedlist {

    // convert an array to a LL
    public static Node convertarrtoLL(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    // get the length of LL
    public static int lengthofLL(Node head) {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }

    // search in a LL
    public static boolean searchLL(Node head, int target) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == target) {
                return true;
            } else {
                temp = temp.next;
            }
        }
        return false;
    }

    // Remove the head
    public static Node removeHead(Node head) {
        if (head == null) {
            return head;
        }
        // Node temp = head;
        head = head.next;
        return head;
    }

    // remove tail
    public static Node removeTail(Node head) {
        Node temp = head;
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return null;
        }
        if (lengthofLL(head) < 2) {
            return removeHead(head);
        } else {
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }
        return head;
    }

    // delete kth element
    public static Node deletek(Node head, int k) {
        if (head == null) {
            return head;
        }
        if (k == 1) {
            // Node temp = head;
            head = head.next;
            return head;
        }
        int count = 0;
        Node temp = head;
        Node prev = null;
        while (temp != null) {
            count++;
            if (count == k) {
                prev.next = prev.next.next;
                break;
            } else {
                prev = temp;
                temp = temp.next;
            }
        }
        return head;
    }

    // delete an element
    public static Node deleteel(Node head, int k) {

        if (head == null) {
            return head;
        }
        if (head.data == k) {
            head = head.next;
            return head;
        }
        Node temp = head;
        Node prev = null;
        while (temp != null) {
            if (temp.data == k) {
                prev.next = prev.next.next;
                break;
            } else {
                prev = temp;
                temp = temp.next;
            }
        }
        return head;
    }

    // Insertion
    public static Node insertheadstart(Node head, int val) {
        Node temp = new Node(val, head);
        return temp;
    }

    public static Node insertheadtail(Node head, int val) {
        if (head == null) {
            return new Node(val);
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node tail = new Node(val, null);
        temp.next = tail;
        return head;
    }

    public static Node insertatk(Node head, int k, int val) {
        if (head == null) {
            if (k == 1) {
                Node newnode = new Node(val, head);
                return newnode;
            }
        }
        if (k == 1) {
            Node newnode = new Node(val, head);
            return newnode;
        }

        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            if (count == (k - 1)) {
                Node newnode = new Node(val, temp.next);
                // newnode.next = temp.next;
                temp.next = newnode;
                break;
            } else {
                temp = temp.next;
            }
        }
        return head;
    }

    public static Node insertAtEnd(Node head, int x) {
        Node temp = head;
        Node newnode = new Node(x);
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newnode;
        return head;
    }

    public static Node reverseLL(Node head) {

        Node prev = null;
        Node current = head;
        Node next = current.next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    // sort a LL

    public static void main(String[] args) {
        int[] arr = { 5 };
        Node head = convertarrtoLL(arr);
        // head = removeHead(head);
        // head = removeTail(head);
        // head = deleteel(head, 4);
        // head = insertheadstart(head, 20);
        // head = insertheadtail(head, 25);
        // head = insertatk(head, 1, 15);

        // head = insertAtEnd(head, 15);
        head = reverseLL(head);

        Node temp = head;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }

        System.out.println("length - " + lengthofLL(head));
        System.out.println("Present - " + searchLL(head, 5));
    }
}