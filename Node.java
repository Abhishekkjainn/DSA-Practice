import java.util.ArrayList;

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

    // insert before head
    public static Node insertathead(Node head, int target) {
        Node newnode = new Node(target);
        Node temp = head;
        newnode.next = temp;
        temp.back = newnode;
        return newnode;
    }

    public static Node insertbeforetail(Node head, int k) {
        Node newNode = new Node(k);
        Node temp = head;
        if (head.next == null) {
            Node makehead = new Node(k);
            makehead.next = head;
            head.back = makehead;
            return makehead;
        }
        while (temp.next.next != null) {
            temp = temp.next;
        }
        Node front = temp.next;
        temp.next = newNode;
        newNode.back = temp;
        front.back = newNode;
        newNode.next = front;
        return head;
    }

    public static Node insertatk(Node head, int k, int target) {
        int count = 0;
        Node temp = head;

        // Edge cases 1. if(k==1)
        if (k == 1) {
            Node newNode = new Node(target, head, null);
            head.back = newNode;
            return newNode;
        }

        while (temp != null) {
            count++;
            if (count == (k - 1)) {
                Node front = temp.next;
                Node newNode = new Node(target, front, temp);
                temp.next = newNode;
                front.back = newNode;
                return head;
            }
            temp = temp.next;
        }
        return null;
    }

    public static Node insertafterk(Node head, int p, int x) {
        Node temp = head;
        int count = 0;

        while (temp != null) {
            if (count == p) { // Fix: Directly compare with p (0-based index)
                Node front = temp.next;
                Node newNode = new Node(x);
                newNode.next = front;
                newNode.back = temp;
                temp.next = newNode;
                if (front != null) { // Fix: Avoid NullPointerException
                    front.back = newNode;
                }
                return head;
            }
            temp = temp.next;
            count++;
        }
        return head;
    }

    // reverse a DLL
    public static Node reverseaDLL(Node head) {
        Node temp = head;
        Node last = null;
        if (temp.next == null) {
            return temp;
        }
        while (temp != null) {
            last = temp.back;
            temp.back = temp.next;
            temp.next = last;
            temp = temp.back;
        }
        return last.back;
    }

    public static Node add2ll(Node head, Node head2) {
        int count = 0;
        double sum = 0;
        Node temp = head;
        int count2 = 0;
        double sum2 = 0;
        Node temp2 = head2;
        while (temp != null) {
            sum = sum + (temp.data * Math.pow(10, count));
            count++;
            temp = temp.next;
        }
        while (temp2 != null) {
            sum2 = sum2 + (temp2.data * Math.pow(10, count2));
            count2++;
            temp2 = temp2.next;
        }
        int total = (int) (sum + sum2);
        int first = total % 10;
        total = total / 10;
        Node newNode = new Node(first);
        Node temp3 = newNode;
        while (total > 0) {
            int test = total % 10;
            total = total / 10;
            Node latest = new Node(test, null, temp3);
            temp3.next = latest;
            temp3 = temp3.next;
        }
        return newNode;
    }

    public static Node add2lleff(Node head, Node head2) {
        Node temp = head;
        Node temp2 = head2;
        Node DummyNode = new Node(-1);
        Node current = DummyNode;
        int carry = 0;
        int sum = 0;

        while (temp != null || temp2 != null) {
            sum = carry + ((temp != null) ? temp.data : 0) + ((temp2 != null) ? temp2.data : 0);
            Node newNode = new Node(sum % 10);
            carry = sum / 10;
            current.next = newNode;
            current = current.next;
            temp = (temp != null) ? temp.next : temp;
            temp2 = (temp2 != null) ? temp2.next : temp2;
        }
        if (carry != 0) {
            Node newNode = new Node(carry);
            current.next = newNode;
        }

        return DummyNode.next;

    }

    public static Node oddEvenBrute(Node head) {
        Node temp = head;
        ArrayList<Integer> oddeven = new ArrayList<>();

        while (temp != null && temp.next != null) {
            oddeven.add(temp.data);
            temp = temp.next.next;
        }
        if (temp != null) {
            oddeven.add(temp.data);
        }
        temp = head.next;
        while (temp != null && temp.next != null) {
            oddeven.add(temp.data);
            temp = temp.next.next;
        }
        if (temp != null) {
            oddeven.add(temp.data);
        }
        temp = head;
        int i = 0;
        while (temp != null) {
            temp.data = oddeven.get(i);
            i++;
            temp = temp.next;
        }

        return head;

    }

    public static Node oddEvenEff(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node odd = head;
        Node even = head.next;
        Node evenhead = head.next;

        while (even != null && even.next != null) {
            odd.next = odd.next.next;
            even.next = even.next.next;
            odd = odd.next;
            even = even.next;
        }
        odd.next = evenhead;
        return head;
    }

    public static Node sort012brute(Node head) {
        int zero = 0;
        int one = 0;
        int two = 0;
        Node temp = head;
        if (head == null) {
            return head;
        }
        while (temp != null) {
            if (temp.data == 0) {
                zero++;
            } else if (temp.data == 1) {
                one++;
            } else {
                two++;
            }
            temp = temp.next;
        }

        temp = head;
        while (temp != null) {
            if (zero != 0) {
                temp.data = 0;
                zero--;
            } else if (one != 0) {
                temp.data = 1;
                one--;
            } else if (two != 0) {
                temp.data = 2;
                two--;
            }
            temp = temp.next;
        }
        return head;
    }

    public static Node sort012eff(Node head) {
        Node zeroHead = new Node(-1);
        Node oneHead = new Node(-1);
        Node twoHead = new Node(-1);

        Node zero = zeroHead;
        Node one = oneHead;
        Node two = twoHead;

        if (head == null || head.next == null) {
            return head;
        }

        Node temp = head;
        while (temp != null) {
            if (temp.data == 0) {
                zero.next = temp;
                zero = temp;
            } else if (temp.data == 1) {
                one.next = temp;
                one = temp;
            } else {
                two.next = temp;
                two = temp;
            }
            temp = temp.next;
        }
        zero.next = (oneHead.next != null) ? oneHead.next : (twoHead.next != null) ? twoHead.next : null;
        one.next = twoHead.next;
        two.next = null;

        return zeroHead.next;
    }

    // remove nth brute
    public static Node removeNbrute(Node head, int n) {
        int count = n;
        int length = 0;
        Node temp = head;
        if (head == null) {
            return null;
        }
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        if (count == length) {
            return head.next;
        }
        int res = length - count;
        temp = head;
        System.out.println(length);
        System.out.println(count);
        System.out.println(res);

        int count2 = 0;
        while (temp != null) {
            count2++;
            if (count2 == res) {
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        }

        return head;
    }

    public static Node removeNeff(Node head, int n) {
        Node fast = head;
        Node slow = head;

        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        if (fast == null) {
            return head.next;
        }

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return head;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 4, 5, 9, 9 };
        Node head = convertarrtoDLL(arr);
        Node head2 = convertarrtoDLL(arr2);
        // head = deletehead(head);
        // head = deletetail(head);
        // head = deletekth(head, 1);
        // head = insertAtEnd(head, 8);
        // head = deleteNode(head, 1);
        // head = insertathead(head, 25);
        // head = insertbeforetail(head, 1502);
        // head = insertatk(head, 6, 25);
        // head = insertafterk(head, 2, 6);
        // head = reverseaDLL(head);
        // System.out.println(add2ll(head, head2));
        // head = add2lleff(head, head2);
        // head = oddEvenEff(head);
        // head = sort012eff(head);
        head = removeNeff(head, 5);
        printDLL(head);
        // printDLL(head2);
    }
}
