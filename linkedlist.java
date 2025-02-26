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

    // sort a LL

    public static Node reversell(Node head) {
        Node temp = head;
        Node prev = null;
        Node front = null;
        while (temp != null) {
            front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }

    public static boolean palindrome(Node head) {
        Node temp = head;
        int check = 0;
        int test = 0;
        int rev = 0;

        while (temp != null) {
            check = (check * 10) + temp.data;
            temp = temp.next;
        }
        test = check;
        while (test >= 0) {
            rev = (rev * 10) + test % 10;
            test = test / 10;
        }

        System.out.println(rev);
        System.out.println(check);
        if (rev == check) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 8, 0, 7, 1, 7, 7, 9, 7, 5, 2, 9, 1, 7, 3, 7, 0, 6, 5, 1, 7, 7, 9, 3, 8, 1, 5, 7, 7, 8, 4, 0, 9, 3,
                7, 3, 4, 5, 7, 4, 8, 8, 5, 8, 9, 8, 5, 8, 8, 4, 7, 5, 4, 3, 7, 3, 9, 0, 4, 8, 7, 7, 5, 1, 8, 3, 9, 7, 7,
                1, 5, 6, 0, 7, 3, 7, 1, 9, 2, 5, 7, 9, 7, 7, 1, 7, 0, 8 };
        Node head = convertarrtoLL(arr);
        // head = removeHead(head);
        // head = removeTail(head);
        // head = deleteel(head, 4);
        // head = insertheadstart(head, 20);
        // head = insertheadtail(head, 25);
        // head = insertatk(head, 1, 15);

        // head = insertAtEnd(head, 15);
        // head = reversell(head);
        // System.out.println(palindrome(head));'
        System.out.println(palindrome(head));
        Node temp = head;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }

        System.out.println("length - " + lengthofLL(head));
        System.out.println("Present - " + searchLL(head, 5));
    }
}