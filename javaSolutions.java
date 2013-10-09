public  static void permutation(String str) { 
    permutation("", str); 
 }

 private static void permutation(String prefix, String str) {
    int n = str.length();
    if (n == 0) System.out.println(prefix);
    else {
        for (int i = 0; i < n; i++)
           permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
    }

}
//count number of nodes
int countChildren(Node node)
{
    if ( node == null )
        return 0;
    return 1 + countChildren(node.getLeft()) + countChildren(node.getRight());
}
//heightOfBinaryTree
public int heightOfBinaryTree(Node node)
{
    if (node == null) {  return 0;  }
    else {
        return 1 +
        Math.max(heightOfBinaryTree(node.left),
            heightOfBinaryTree(node.right));
    }
}
//Kadane Algo  find the maximum sum of contiguous subarray.
String[] numbers = string.split(",");
int max_so_far = 0;
int max_ending_here = 0;
for (int i = 0; i < numbers.length;i++){
	 max_ending_here = max_ending_here + Integer.parseInt(numbers[i]);
	 if (max_ending_here < 0)
		 max_ending_here = 0;
	 if (max_so_far < max_ending_here)
		  max_so_far = max_ending_here;
}
System.out.println(max_so_far);

//Tree
public class Node {
	private Node left;
	private Node right;
	private int value;
public Node( Node left, Node right, int value ){
	this.left = left;
	this.right = right;
	this.value = value;
}
public Node getLeft() { return left; }
public Node getRight() { return right; }
public int getValue() { return value; }
}

//find node in bst
Node findNode( Node root, int value ){
	while( root != null ){
		int currval = root.getValue();
			if( currval == value ) break;
			if( currval < value ){
				root = root.getRight();
			} else { // currval > value
				root = root.getLeft();
			}
	}
	return root;
}

//preorder traversal
void preorderTraversal( Node root ){
if( root == null ) return;
	root.printValue();
	preorderTraversal( root.getLeft() );
	preorderTraversal( root.getRight() );
}

//preorder w/o recursion
void preorderTraversal( Node root ){
	NodeStack stack = new NodeStack();
	stack.push( root );
	while( stack.size() > 0 ){
		Node curr = stack.pop();
		curr.printValue();
		Node n = curr.getRight();
		if( n != null ) stack.push( n );
			n = curr.getLeft();
		if( n != null ) stack.push( n );
	}
}
//lowest common ancestor
Node findLowestCommonAncestor( Node root, int value1, int value2 ){
	while( root != null ){
		int value = root.getValue();
		if( value > value1 && value > value2 ){
			root = root.getLeft();
		} else if( value < value1 && value < value2 ){
			root = root.getRight();
		} else {
			return root;
		}
	}
return null; // only if empty tree
}

public static Character firstNonRepeated( String str ){
HashMap<Character,Integer> charHash =
new HashMap<Character,Integer>();
Arrays | 87
int i, length;
Character c;
length = str.length();
// Scan str, building hash table
for (i = 0; i < length; i++) {
c = str.charAt(i);
if (charHash.containsKey(c)) {
// Increment count corresponding to c
charHash.put(c, charHash.get(c) + 1);
} else {
charHash.put(c, 1);
}
}
// Search hash table in order of str
for (i = 0; i < length; i++) {
c = str.charAt(i);
if (charHash.get(c) == 1)
return c;
}
return null;
}

//linkedlist cycle
bool determineTermination( Node *head ){
Node *fast, *slow;
slow = head;
fast = head->next;
while( true ){
if( !fast || !fast->next )
return false;
else if( fast == slow || fast->next == slow )
return true;
else {
slow = slow->next;
fast = fast->next->next;
}
}
}


boolean isPrime(int num){   //9 
    for(int i=2; i<num/2;i++){        // 2 3 4 5 6 7 8 
        if(num%i == 0){             // F T 9%2 =1
            return false;           //F
        }       
    }     
    return true;   
}

void printPrimes(int max) {

    for(int i = 2; i<max; i++) { 
        if(isPrime(i)) { System.out.println(i);}       
    }
}
