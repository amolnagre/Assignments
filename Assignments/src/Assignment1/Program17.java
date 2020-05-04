package Assignment1;

public class Program17 {

	/*17.  Input a int array. 
	 * Square the elements in even position 
	 * and cube the elements in odd position and add them as result.
		input: {1,2,3,4}
		output: 1^3+2^2+3^3+4^2
	 */
	public static void main(String[] args) {
		
		int arr[]={1,2,3,4};
		String str="^";
		String value="";
		for(int i=0; i<arr.length; i++)
		{
			if(i%2==0)
			{
				if(value==""){
				value=value+arr[i]+str+3;
				}else{
					value=value+"+"+arr[i]+str+3;
				}
			}
			else
			{
				if(value==""){
					value=value+arr[i]+str+2;
					}else{
						value=value+"+"+arr[i]+str+2;
					}
				
				
			}
		}
		System.out.println(value);	
		

	}

}
