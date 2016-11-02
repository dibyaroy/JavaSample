package stringManipulation;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacterAndPosition {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		String given = "armagedddam";
				
		
		Map<Character, Integer> b= new HashMap<Character, Integer>();
		
		int j, highestOccurance=0;
		
		char c=0;
		
		for (int i=0; i<given.length();i++)
		{
			if(b.containsKey(given.charAt(i)))
			{
				j=b.get(given.charAt(i));
				
				b.put(given.charAt(i), j+1);
						
			}
			else
			{
				b.put(given.charAt(i), 1);
			}	
			
		}
				
		Set<Character> printo = b.keySet();		
		
		for (Character character : printo) {
			System.out.println("The character is : "+character+" and the number of occurance is : "+b.get(character) );
		if(b.get(character)>highestOccurance)
		{
			highestOccurance = b.get(character);
			c=character;
 		}
			
		}
		System.out.println("The highest occured char is : "+c+" and it has occured "+highestOccurance+" times");		
	}

}
