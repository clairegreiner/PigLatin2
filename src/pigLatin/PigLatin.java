package pigLatin;

import java.util.Scanner;

public class PigLatin {
	
	
	/*POST-MORTEM:
	 * 
	 * Sending my start on the variables/methods.  Original plan was a Boolian method running against the vowels. Instead, tried a switch statement but had trouble sending the results anywhere useful. Meant to keep the first letter
	 * in its own variable to string up on a final translation statement. First was thinking if-else on the vowels. Then settled for setting up a method for vowel and not-vowel.
	 * 
	 * Upon asking for help, more code was thrown into Main but I still had trouble calling actual methods. I still think my logic would work; it's execution where I'm lagging.
	 * 
	 * Now I'm comparing Mary, Jonathan, and Michael's code for different paths.  If I overhaul this I'll probably use part of Mary's statements...
	 * 
	 * 
	 */

	private static final String String = null;

	public static void main(String[] args, char isVowel) {
		// TODO Auto-generated method stub

		String realWord;
		char pigHead; // for first letter validation
		String pigHeadless = null; // for word-minus-first-letter
		String pigletLatin = null; //for truncated consonant-word
		String translation; // final output, not yet defined
		String translationVowel;
		greeting();
		
		System.out.println("Welcome to the Pig Latin Translator. Please enter a word:"); // wooo!
		Scanner sc = new Scanner(System.in); // computer takes in keyboard input		// works
		String word = sc.nextLine(); // method to run									// this
		System.out.println(word); // displays what was entered	
		char firstLetter = modifiedUserInput.charAt(0);
		
		String translation String pigHeadless {
			
			System.out.println("The translation is " + translation );
			
		}
		
	public static String translationVowel(String realWord ) {
			
			System.out.println("The translation is " + translationVowel );  //not used in method yet
		//Mary's switch code still in Main	
		}
		
	
	}

	// complete the translate; maybe validate isLetter

	public static void glueConsanant (char pigHead, String pigHeadless ) {
		translation = (pigHeadless + pigHead + "-ay"+);		
		
	}

	// complete the translate; maybe validate isLetter

	// realWord = typeWord(); // the word typed in

	// CHeck if starts with vowel

	// then change word
	// add yay to vowels
	// change and at yay to cons

	// translation = firstLetter(realWord); // get first character of word

	// result(translation); //the final concatenated mess

	public static void greeting() {

	}

	public static char firstLetter(String realWord) {
		char pigHead = realWord.charAt(0); // evaluate first letter of word in
											// question
		return pigHead;

	}

	public boolean sortVowel (char pigHead) {  //resolve these variables
		
		
		
		switch  (pigHead) {
		  case 'a':
		  case 'e':
		  case 'i':
		  case 'o':
		  case 'u': 
		return true modifiedUserInput.append("ay");;  //this shouldn't need an array; the switch should be simple enough....
		  
		   break;
		  
		default: 
		return false ; // String pigletLatin; //the truncated word
		}
		
		if true        // slap "hay" on the word 
			
		else 
	
	}

}

// the unchanged vowel-word

// if isVowel = true; //go to pigHeadless and "yay" logic

// else //go to consonant logic

// if- else: ifStringBuilder modUserInput = new StringBuilder(userInput);
/*
 * char firstLetter= modUserInput.charAt(0); System.out.println(firstLetter);
 * 
 * modUserInput.deleteCharAt(0); System.out.println(modUserInput);
 * modUserInput.insert(0, 'x'); System.out.println(modUserInput); char[] hi =
 * {'h', 'i', '_'}; modUserInput.insert(0, hi); modUserInput.append(hi); //
 * vowel = true; else the full process
 * 
 */
