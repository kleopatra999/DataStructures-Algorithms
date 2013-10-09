//Java Array
byte[] arrayA = new byte[10];
int size = arrayA.length

string.charAt(i)                                //Returns character at index in the string.
string1.compareTo(string2)                      //Compares two strings to each other. If they are equivalent, a zero is returned.
string1 + string2                               //Concatenates (joins) two strings to each other, returning the combined string.
string.contains(substring)                      //Returns whether string contains substring as a substring
string1.equals(string2)                         //Tests if two strings are equal. 
string.indexOf(substring,startpos)              //Returns the position of the start of the first occurrence of substring in string else -1
string1 != string2                              //Tests if two strings are not equal.
string.length()                                 //Returns the length of a string 
string.toLowerCase()                            //Returns the string in lower case.
string.toUpperCase()                            //Returns the string in upper case.    
string.replaceAll(find_regex, replace)          //Returns a string with find occurrences changed to replace.
new StringBuilder(string).reverse().toString()  //Reverses the order of the characters in the string.
string.lastIndexOf(substring,startpos)          //Returns the position of the start of the last occurrence of substring in string. 
string.split(separator«, limit»)                //Splits the given string by occurrences of the separator (itself a string) and returns a list (or array) of the substrings.
string.trim()                                   //remove whitespace from the beginning, end, or both beginning and end, of a string.

// Examples in Java
"effffff".replace("f", "jump");                 // returns "ejumpjumpjumpjumpjumpjump"
"effffff".replaceAll("f*", "jump");             // returns "ejump"
// Examples in Java
"abc,defgh,ijk".split(",");                     // {"abc", "defgh", "ijk"}
"abc,defgh;ijk".split(",|;");                   // {"abc", "defgh", "ijk"}

//String to Char Array
String s;
char[] c = s.toCharArray();
//Integer to String
int a;
String s = a.toString();
//Char to string
Char[] c;
String s = new String(c);

public char findFirstNonRepeatedCharacter(String s) {
	Char stringArray[] = s.toCharArray();
	int length = stringArray.length;
	
	//Non-optimized way O(n^2)
	for(int i=0; i<length; i++) {
		Boolean duplicateFlag = false;
		for(int j=0; j<length; j++) {
			if(stringArrar[i] == stringArrar[j]) {
				duplicateFlag = true;
				break;
			}
		}
		if(!duplicateFlag) {
			return(stringArrar[i]);
		}
	}
	//optimized way O(n)
	HashMap map = new HashMap();
	for(int i = 0; i < length; i++) {	//Building character coutn hash table
        if(map.containsKey(stringArrar[i])) {
			map.put(stringArrar[i], map.get(stringArrar[i])+1); //Adding one to existing count		
		} else {
			map.put(stringArrar[i], 1);	
		}
	}
	for(int i = 0; i < size; i++){	//Scan the string
		if(map.get(stringArrar[i]) == 1) {
			return stringArrar[i];
		} 
	} return null;
	//More Optimized
	HashMap map = new HashMap();
	for(int i = 0; i < length; i++) {	//Building character coutn hash table
        if(map.containsKey(stringArrar[i])) {
			map.put(stringArrar[i], 0); //Adding one to existing count		
		} else {
			map.put(stringArrar[i], 1);	
		}
	}
	for(int i = 0; i < size; i++){	//Scan the string
		if(map.get(stringArrar[i]) == 1) {
			return stringArrar[i];
		} 
	} return null;
}
//RemoveSpecifiedCharacters
//Reverse Words
//String to Int 
//Integer to String























