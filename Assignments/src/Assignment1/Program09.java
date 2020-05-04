package Assignment1;

public class Program09 {
public static void main(String[] args) {
	
	//Incopmplete
	// requere some imrprovement for returning greate word
	/*9. find the max length-word in a given string and 
	 * return the max-length word. 
	 * if two words are of same length 
	 * return the first occuring word of max-length
		input:"hello how are you aaaaa"
		output:hello(length-5)
	 */
		
	int match = 0;
	String word = "";
	String str = ("hello how are you kkaa");
	String split[] = str.split(" ");
	for (int i = 0; i < split.length; i++) {
		String temp = split[i];
		if (match < temp.length()) {

			//match = temp.length();
			word=temp;
		}

	}
	System.out.println(word);
	
	
	
	
	}

}
