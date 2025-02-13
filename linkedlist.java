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

    public static int lengthofLL(Node head) {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }

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

    public static Node removeHead(Node head) {
        if (head == null) {
            return head;
        }
        // Node temp = head;
        head = head.next;
        return head;
    }

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

    public static void main(String[] args) {
        int[] arr = { 5, 2, 4, 8, 6 };
        Node head = convertarrtoLL(arr);
        // head = removeHead(head);
        // head = removeTail(head);
        Node temp = head;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }

        System.out.println("length - " + lengthofLL(head));
        System.out.println(searchLL(head, 5));
    }
}