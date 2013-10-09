//Normal Tree    
public abstract class Node {
    private Node[] Children;
    
    public Node(Node[] children) {
        this.Children = children;
    }
    public int getNumChildren() {
        return Children.length;
    }
    public Node getCChild(int index) {
        return Children[index];
    }
}
public class IntNode extends Node {
    private int value;
    public IntNode(Node[] Children, int value) {
        super(children);
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}

//Binary tree

public class Node {
    Node left;
    Node right;
    int value;
    
    public Node(Node left, Node right, int value) {
        this.left = left;
        this.right = right;
        this.value = value;    
    }
    public Node getLeft() { return left; }
    public Node getRight() { return right; }    
    public int getValue() { return value; }
}

//Check if node exists : Running Time : O (log n)
public class ifNodeExists(Node root, int value) {
    while(root != null) {
        if(root.value > value ) { ifNodeExists(root.left, value) }
        if(root.value < value ) { ifNodeExists(root.right, value) }
        if(root.value == value ) { return true }
    }
    return false;
}

//Find the maximum height of a binary tree : Running Time : O (n)
public int treeHeight(Node root) {
	if(root == null) { return 0;}
	return(1 + Max( treeHeight( root.getLeft() ), 
					treeHeight( root.getRight() ) ) ) ;
}

//preOrder Traversal : Running Time : O (n)
public void preOrderTraversal(Node root) {
	if(root == null) { return; }
	System.out.println(root.getValue());
	preOrderTraversal(root.getLeft());
	preOrderTraversal(root.getright());
}

//postOrder Traversal : Running Time : O (n)
public void postOrderTraversal(Node root) {
	if(root == null) { return; }
	postOrderTraversal(root.getLeft());
	postOrderTraversal(root.getright());
	System.out.println(root.getValue());
}

//inOrder Traversal : Running Time : O (n)
public void inOrderTraversal(Node root) {
	if(root == null) { return; }
	inOrderTraversal(root.getLeft());
	System.out.println(root.getValue());
	inOrderTraversal(root.getright());
}

//preOrder traversal without recursion : Running Time : O (n)
public void preOrderWithoutRecursion(Node root) {
	NodeStack stack = new NodeStack();
	stack.push( root );
	while(!stack.isEmpty()) {
		Node currentNode = stack.pop();
		System.out.println(currentNode.getValue());
		//If right child exists push it first because stack is a LIFO
		if( Node n = currentNode.getRight() ) {
			stack.push(n);
		}
		if( Node n = currentNode.getLeft() ) {
			stack.push(n);
		}
	}
}

//Given two nodes in BST, find lowest common ancestor : Running Time : O (log n)
public Node findLowestCommonAncestor(Node root, int value1, int value2) {
	while( root != null ) {
		if( ( value1 < root.getValue() ) && ( value2 < root.getValue() ) ) {
			root = root.getLeft();
		} else if( ( value1 > root.getValue() ) && ( value2 > root.getValue() ) ) {
			root = root.getRight();
		} else {
			return root;
		}
	}
	return null;
}
//Overload Wrapper to handle references to Nodes instead of values
public Node findLowestCommonAncestor(Node root, Node child1, Node child2) {
	if( root == null || child1 == null || child2 == null ) { return null; }
	Node findLowestCommonAncestor(root, child1.getValue(), child2.getValue());
}

//BinaryTreeToHeap

//UnbalancedBinarySearchTree
















