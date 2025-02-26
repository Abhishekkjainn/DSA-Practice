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
        while (test > 0) {
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

    public static void middle(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data + " - Middle");
    }

    public static Node deletemiddlebrute(Node head) {
        Node temp = head;
        int count = 0;
        if (head == null) {
            return head;
        }

        while (temp != null) {
            count++;
            temp = temp.next;
        }
        System.out.println(count + " Count");
        temp = head;

        for (int i = 0; i < ((count / 2) - 1); i++) {
            head = head.next;
        }
        head.next = head.next.next;
        return temp;
    }

    public static Node deletemiddleeff(Node head) {
        Node slow = head;
        Node fast = head;
        Node prev = head;
        if (head == null || head.next == null) {
            return null;
        }
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = prev.next.next;
        return head;
    }

    public static Node sortLLbrute(Node head) {
        int len = 0;
        Node temp = head;
        if (head == null) {
            return null;
        }
        while (temp != null) {
            len++;
            temp = temp.next;
        }
        int[] arr = new int[len];
        temp = head;
        int ind = 0;
        while (temp != null) {
            arr[ind] = temp.data;
            temp = temp.next;
            ind++;
        }
        temp = head;
        ind = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp1 = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp1;
                }
            }
        }
        while (temp != null) {
            temp.data = arr[ind];
            ind++;
            temp = temp.next;
        }
        return head;
    }

    public static Node sortLL(Node head) {
        // Base case: If the list is empty or has only one node, it's already sorted
        if (head == null || head.next == null) {
            return head;
        }

        // Step 1: Split the list into two halves
        Node middle = getMiddle(head);
        Node nextToMiddle = middle.next;
        middle.next = null; // Break the list into two parts

        // Step 2: Recursively sort both halves
        Node left = sortLL(head);
        Node right = sortLL(nextToMiddle);

        // Step 3: Merge the two sorted halves
        return merge(left, right);
    }

    // Function to find the middle of the linked list
    private static Node getMiddle(Node head) {
        Node slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Function to merge two sorted linked lists
    private static Node merge(Node l1, Node l2) {
        Node dummy = new Node(0); // Temporary dummy node
        Node tail = dummy;

        while (l1 != null && l2 != null) {
            if (l1.data < l2.data) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }

        // If there are remaining nodes in either list, attach them
        if (l1 != null) {
            tail.next = l1;
        } else {
            tail.next = l2;
        }

        return dummy.next; // The merged sorted list
    }

    public static void main(String[] args) {
        int[] arr = { 5, 8, 9, 4, 1, 2, 3, 4, 6, 8, 8, 5 };
        Node head = convertarrtoLL(arr);
        // head = removeHead(head);
        // head = removeTail(head);
        // head = deleteel(head, 4);
        // head = insertheadstart(head, 20);
        // head = insertheadtail(head, 25);
        // head = insertatk(head, 1, 15);

        // head = insertAtEnd(head, 15);
        // head = reversell(head);
        // System.out.println(palindrome(head));
        // middle(head);
        // head = deletemiddleeff(head);
        head = sortLL(head);
        Node temp = head;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }

        System.out.println("length - " + lengthofLL(head));
        System.out.println("Present - " + searchLL(head, 5));
    }
}