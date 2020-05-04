package Assignment1;

public class Program04 {

	public static void main(String[] args) {
		
		//uncomplete
		
		/*4.Given two arrayslist.retrieve the odd position elements form
		 * first input and even position elemetns from second list. 
		put it into the new arraylist at the same positions from 
		where they are retrieved from.
		(consider 0th position as even position,
		and two lists are of same size)
		input1:{12,1,32,3}
		input2:{0,12,2,23}
		output:{0,1,2,3}
		 */

		int[] arr1={12,1,32,3};
		int[] arr2={0,12,2,23};
		int  result;

		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]%2!=0){
				result=arr1[i];
				System.out.println(result);
			}
		}
			for(int j=0;j<arr2.length;j++)
			{
			//	System.out.println("Example: "+arr1[j]%2);
				if(arr2[j]%2==0){
					result=arr2[j];
					System.out.println(result);
				}
			}
		}

	}



































/*		
		int a []= {1,2,3,4};
		int b[]= {3,4,5,6};
		int c[]=new int[a.length+b.length];
		
		int location=0;
		int sum=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					c[location]=a[i];
					location++;
				}
			}
		}
		
		for(int i=0;i<c.length;i++) {
			int temp=c[i];
			sum=sum+temp;
		}
		System.out.println(sum);
 */		