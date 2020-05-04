package Assignment2;

public class Program23 {


		// work in progress
		/*23. Write a Program that accepts a string and removes the duplicate characters.
		 */
	    public static void main(String[] args) {
            String s1 = "Amool";
            System.out.println(removeDuplicateChar(s1));
	    }
		 public static String removeDuplicateChar(String s1){
	            StringBuffer sb = new StringBuffer(s1);
	            for(int i = 0;i < s1.length();i++)
	                  for(int j = i+1;j < s1.length();j++)
	                        if(s1.charAt(i) == s1.charAt(j))
	                              sb.deleteCharAt(j);
	            
	            return sb.toString();
	      }
	}


