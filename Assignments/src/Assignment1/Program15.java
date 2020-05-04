package Assignment1;

public class Program15 {

	public static void main(String[] args) {
		/*15. Get two integer arrays as input.
		 * Find if there are common elements in the arrays.
		 * find the number of common elements.
			input1: {1,2,3,4}
			input2: {3,4,5,6}
			output: 4(3,4,3,4)
		 */
		int arr1[] = {1,2,3,4};
		int arr2[] = {3,4,5,6};
		int ans[]=new int[4];
		String value="";
		int cnt = 0;
		for(int i=0; i<arr1.length; i++)
		{
			for(int j=0; j<arr2.length; j++)
			{
				if(arr1[i]==arr2[j])
				{
					ans[cnt]=arr1[i];
					cnt=cnt+1;
				}
			}
		}
		
		for(int i=0; i<arr2.length; i++)
		{
			for(int j=0; j<arr1.length; j++)
			{
				if(arr2[i]==arr1[j])
				{
					ans[cnt]=arr2[i];
					cnt=cnt+1;
				}
			}
		}

		
		
		for(int j=0; j<ans.length; j++)
		{
			if(value=="")
			{
				value= value + ans[j];
			}else
			{
				value= value +","+ ans[j] ;
			}
		}
		System.out.println("OutPut: "+ cnt + "{"+ value +"}");
		
			
		
		

	}

}
