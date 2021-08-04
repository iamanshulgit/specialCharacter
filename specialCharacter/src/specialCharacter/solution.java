package specialCharacter;
import java.util.*;

public class solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//solution: List all the special characters from the ASCII value to string value.
		int min = 0, max =128;		//ASCII value ranges from 0-127
		List<String> sol = new ArrayList<String>();		
		for(int i = min; i < max ; i++) {
			char value = (char)i;			//storing ASCII value to char
			sol.add(Character.toString(value).replaceAll("[a-zA-Z0-9]", ""));		//storing into the list of string using regex which remove alphanumeric character. 
			System.out.print(value);			//checking out the all ASCII values
		}
		System.out.println();
		for(String temp : sol)
			System.out.print(temp);				//checking out the list of all special characters.
	}

}
