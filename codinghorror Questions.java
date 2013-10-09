//http://www.codinghorror.com/blog/2008/01/getting-the-interview-phone-screen-right.html

//Write a function to reverse a string.
public string reverseString(String s) {
    int stringMed = s.length()/2;
    int len = s.length();
    for(int i=0; i<stringMed; i++) {
        char temp = s[i];
        s[i] = s[len-i];
        s[len-i] = temp;
    }
    return s;
}

//Write function to compute Nth fibonacci number.
public int fibonacci(int n) {
    if(n<=1) { return n;}
    return(fibonacci(n-1) + fibonacci(n-2));
}

//Print out the grade-school multiplication table up to 12x12.
public void printTable() {
    for(int i=1;i<=12;i++) {
        for(int j=1;j<=12;i++) {
            System.out.println(i + " x " + j + " = " + (i*j));
        }
    }
}



//Write function to print the odd numbers from 1 to 99.
public void printOdds() {
    for (int i=1;i<100;i+=2) {
         System.out.println(i);
    }    
}

//Find the largest int value in an int array. 
public int largestNum(int[] input) {
    int max = null;
    if(input.size==0) { return null;}
    if(input.size==1) { return input[0];}
    else{  
        max = input[0];  
        for(int i=1;i<input.size-1;i++) {
            if(input[i] > max) { max = input[i];}
        }
        return max;
    }    
}

//Write a function that sums up integers from a text file, one int per line.
//Format an RGB value (three 1-byte numbers) as a 6-digit hexadecimal string.
