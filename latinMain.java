import java.util.*;

public class latinMain {
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the word: ");
		String original = sc.next();
		String pigWord = solver(original);
		
		System.out.println("The origianl word: "+ original);
		System.out.println("The pig word: "+ pigWord);
	}
	
	
	
	
	
	
	
	public static String solver(String word){
		
		//Split the string into the array
		String[] array = word.split("");
		char[] vowels= {'a','e','i','o','u'};
		char first = word.charAt(0);
		
		//This checks if the first letter is a vowel
		for (int i = 0; i < vowels.length; i++) {

			if ( first == vowels[i]) {

				return word + "way";

			}

		}
		
		
		String add = "";  // This stores the letters before the vowel
		char temp = first;
		
		//This nest loop iterates through the string until it reaches a vowel
		for(int i=1; i < array.length; i++){
			
			add += temp;
			
			for(int j=0;j< vowels.length;j++){ // This checks each letter for the vowel
				
				temp = word.charAt(i);
				
				if(temp == vowels[j]){
					return word.substring(i)+add+"ay"; // This sends back pig word by adding the temp
				}
				
			}
		}
	
		return word + "ay";
}


}
