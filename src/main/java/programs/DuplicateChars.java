package programs;

import java.util.HashMap;
import java.util.Map;

public class DuplicateChars {
	
	public void findDuplicateCharacters(String input) {
		
		Map<Character, Integer> result = new HashMap<>();
		
		for(int i=0;i<input.length();i++) {
			
			if (result.get(input.charAt(i))!=null) {
				result.put(input.charAt(i), result.get(input.charAt(i)) + 1);
				System.out.println("Duplicate chars :"+input.charAt(i));
			} else {
				result.put(input.charAt(i), 1);
			}
			
			
		}
		
		
		System.out.println("Results : "+result);
	}
	
	
	public static void main(String args[]) {
		
		DuplicateChars dc = new DuplicateChars();
		
		String values = "amar";
		dc.findDuplicateCharacters(values);
	}

}
