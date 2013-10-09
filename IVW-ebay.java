//function input, array of integers
//return list of unique integeres into the array

for(i=0;i<n;i++)
{for(j=i;j<n;j++){
comparison
}

o(n2)

o(n) => external memory


public static int[] function findUnique(int[] input{
HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
111233
Hashmap
Key  value
1   1
1   2
1   3
2   1
3   1
3   2

Final HashMap
1   3
2   1
3   2
for(int i=0;i<input.length;i++){
  if(h.containsKey(input[i]) {
    h.put(input[i], h.get(input[i])+1);  o(1)
  } else {
    h.put(input[i], 1);
  }
=> o(n)

  int[] output;
  for(int i=0; i<h.length; i++) {
    output[i]=h.Key([i]);
  }  
  
  =>o(m)   m<=n 
  return(output); [1, 2, 3]
}
=>o(n)

findUnique([1, 1, 1, 2, 3, 3]) => [1, 2, 3]