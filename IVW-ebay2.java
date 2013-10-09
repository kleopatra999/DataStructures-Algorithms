//basic binary tree

struct node{
int data;
node rightnode;
node leftnode;
}


input -> root  
output-> mirror


1

2 3
1 
3 2


mirrorTree(struct root){

if(root==null){return null;}
else{
system.out.println(node.value);
node.left = mirrorTree(node.right);
node.right= mirrorTree(node.left);
}
}