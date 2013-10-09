//sort a link list in java

LinkedList<int> list = new LinkedList<int>();

list.add(1);
list.add(7);
list.add(3);


elem = head;
while(elem.next!=null){
    if(elem.next.data <elem.data){
        swap(elem.next.data, elem.data);
    }
    elem= elem.next;
}


elem = 1
elem.next !=null
7 <1 
elem=7
elem.next != null
7<3
swap elements 1 3 7
elem.next = null



//set of tests
->1. test against various linlkedlist size
->2. check type of linked list
->3. checking the data (data type, data size)
->4. smaple inputs , sorted results. diff between estimated output our output
->5. garbage value checking
->6. BST (log n) LL (n) Performance


int[] sortedLinkedListData = new int[linkedlist.size()]; //1 , 3, 7
while(elem.next!=null){
    sortedLinkedListData[i]= elem.data;
    elem= elem.next;
    i++;
}

public static Boolean diffTwoLists(){
int[] expectedOutput = new int[linkedlist.size()]; //1 , 3, 7
//sortedLinkedListData 

for(int i=0;i<linkedlist.size(); i++{
if(sortedLinkedListData[i] != expectedOutput[i]){
System.out.println("Error in our Algorithm");
return false;
}
}

//to create an int array and test against that 
//iterate through our sorted list values

}


//generate a list of random size and random values
int sizeOfList = random();
LinkedList<int> list = new LinkedList<int>(sizeOfList);
elem= head;
for(int i=0;i<sizeOfList; i++){
elem.data = random();
elem=elem.next;
}

diffTwoLists

//verify list elements are in ascending order










BODMAS

-->Bracket
Division
Multiplication
Addition
Subtraction

4+2*5  infixtree structiute



        +
    *       4
   2  5 
    
