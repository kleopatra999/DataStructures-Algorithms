//linklist

public class Node {
    //Member variables
    private object data;
    private Node next;
    
    //Constructors C1
    public Node(Object o) {
        Node.data = o;
    }
    //Constructors C2
    public Node(Object o, Node n) {
        data = o;
        next = n
    }
    //Getters G1
    public object getData() {
        return data;
    }
    //Getters G2    
    public Node getNext() {
        return next;
    }
    //Setters S1
    public void setData(Object o) {
        data = o;
    }
    //Setters S2    
    public void setNext(Node n) {
        next = n;
    }
}



public Node addNode(List head, Node n) { // 
    if(head == null) {
        head = n;
        return head;
    }
    if(n == null) {
        return head;
    }
    n.next = head;
    head = n;
    return head;
}

public Node removeNode(List head, Node n) {
    if(head == null) {
        return null;
    }
    if(n == null) {
        return head;
    }
    if(head == n) {
        head = head.next;
        return head;//you have not removed it!! you just moved pointer
        // delete kaun karenga??
        //purane head ko??
        //is it java or C++?
    }
    while(head.next != null) {
        if(head.next == n) {
            if(head.next.next) {
                temp = head.next;
                head.next = head.next.next;h
                delete temp;
                return head
            } else {
                head.next = null;
                delete temp;
            }
        } else {
            head = head.next;
        }
    }
}
addNodeToTail(Node head, int data) {
    Node n = new Node(data);
    if (head == null) {
        head = node;
    } else {
        tempNode = head;
        while(tempNode.next != null) {
            tempNode = tempNode.next; 
        
        tempNode.next = n;
    }
}

linkListSize(Node head) {
    int size = 0;
    if(head == null) { return size; }
    while (head != null) {
        size++;
        head = head.next;
    }
    return size;    
    }    
}

nthElement(int data) {
    int size = 0;
    if(head == null) { return null; }
    int elementPosition = 0;
    while (head != null) {
        if(head.data == data) {
            return elementPosition;
        } 
        elementPosition++;
    }
    return null;    
    }    
}
nthElementFromLast(Node n, int n) {
    //Method 1 Use 2 traversal
    
    linkListSize(n);
    for(int i=0;i<n;i++){
        node = node.next;
    }
    return(node.data);

    //Method 2 optimized
    if(head == null)  { return null; }
    Node firstPointer = null;
    Node secondPointer = null;    
    int secondPointerCount = 0;
    
    while(node!=null) {
        secondPointer = node;
        secondPointerCount++;
        if(secondPointerCount>= n) {
            firstPointer = node;
        }
        node = node.next;             
    }
    return firstPointer;
}

printList() {
    if(head == null) { return; }
    while (head != null) {
        System.out.println(head.data);
        head = head.next;
    }
}

//flattenList : Doubly link list
class Node {
    Node next;
    Node prev;
    Node child;
    int value;
}

//Appends the child list to the tail
flattenList(Node head, Node tail) {
    Node curNode = head;    
    while(curNode) {
        if(curNode.child) {
            append(curNode.child, tail);
        }
        curNode = curNode.next;
    }
}
//Append function
append(Node child, Node tail) {
    tail.next = child;
    child.prev = tail;
    while(child) {
        child = child.next;
    }
    child.next = null;
    tail = child;
}


//determineLoopInLinkList

bool determineLoop(Node head) {
    Node firstPointer = head;
    Node secondPointer = head.next;
    
    while(true) {
        //If fast pointer reaches null pointer
        if((secondPointer == null) || (secondPointer.next == null)) {
            return false;
        } 
        // If fast pointer moves onto or over slow pointer
        else if((secondPointer == firstPointer) || (secondPointer.next == firstPointer)) {
            return true;
        }
        //advance slow ptr one node, fast ptr two nodes
        firstPointer = firstPointer.next;
        secondPointer = secondPointer.next.next;    
    }
}