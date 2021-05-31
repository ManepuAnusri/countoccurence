package countoccurence;

//JAVA program to count occurrences 
//of a character 

class Count
{ 
	// Method that return count of the given 
	// character in the string 
	public static int count(String s, char c) 
	{ 
		int res = 0; 

		for (int i=0; i<s.length(); i++) 
		{ 
			// checking character in string 
			if (s.charAt(i) == c) 
			res++; 
		} 
		return res; 
	} 
	
	// Driver method 
	public static void main(String args[]) 
	{ 
		String str= "Anusree"; 
		char c = 'e'; 
		System.out.println(count(str, c)); 
	} 
} 

