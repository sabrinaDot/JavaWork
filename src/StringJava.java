
public class StringJava {

	public static void main(String[] args) {

		String sentence = "Welcome to Java Selenium Training.";
		String sentenceTwo = " Learning Java has been a Journey!";
		
		//a Java program to get the character at the given index within the String.
		
		char ch = sentence.charAt(11); 		// it's a char value at the given index number.
		System.out.println("The character at the given index is : " + ch);
		
		System.out.println("----------");
			
		//a Java program to concatenate two strings.
		
		sentence = sentence.concat(sentenceTwo);
		System.out.println("The concatination of two Strings are : " + sentence);

		System.out.println("---------");
		
		//a Java program to test if a given string contains the specified sequence of char values.
		
		CharSequence cha = "Java";
		boolean result = sentence.contains(cha);
		System.out.println("isCharValuesThereInTheSentence : " + result);
		System.out.println("---------");
		
		//a java program to get the length of a given string. 
		
		System.out.println("The length of the String is : " + sentence.length());
		System.out.println("---------"); 
		
	//a Java program to compare a given strings. 
	// a Java program to compare a given string to another string, ignoring case considerations.
				String name = "Palm Tree";
				String treeName = "palm tree";
				System.out.println("Is Palm Tree and palm tree equal : " + name.equals(treeName));
				System.out.println("Is Palm Tree and palm tree equal, ignoring case : " + name.equalsIgnoreCase(treeName));
				System.out.println("----------");
								
		
		//a Java program to remove vowels from a string. 
		
		String vowels = "[aeiouAEIOU]";
		String remove = sentence.replaceAll(vowels, "");
		System.out.println("String without vowels is :" + remove);
		


	}

}
