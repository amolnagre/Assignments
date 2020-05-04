package Assignment1;

public class Program03 {

	public static void main(String[] args) {
		 //complete
		
		/*3.A integer array is given as input.
		 * find the difference between each element.
		 * Return the index of the largest element which has the largest difference gap.
		input: {2,3,4,2,3}
		logic: 2-3=1,3-4=1,4-2=2,2-3=1

		 * 
		 */
		
		int arr[]={2,3,4,2,3};
		//int a[]={12,8,4,12,6};
		
		int max = 0,location = 0 ;
		for(int i=0;i<arr.length-1;i++)
		{
			int result = arr[i] - arr[i+1];
			
			if(max<result)// find the index element which is greater
			{
				max = result;// store greater element into temp
				location = i;// find exact index or location of greater element
			}
		}System.out.println(location);
		
		
		
		
		
		
	}

}
