package into;

import javax.naming.Name;

public class java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//variables
		
		int mynum = 2;
		String website = "silambarasan";
		double point = 0.12;
		char letter = 's';
		boolean prob = true;

		System.out.println(prob + "its ok");
		
		//Array
		//int i;
		int[] arr = new int[5];
		//arr[0] = 1;
		//arr[1] = 2;
		//arr[2] = 3;
		//arr[3] = 4;
		//arr[4] = 5;
		
		int[] arr2 = {1,2,3,4,5,};
		//System.out.println(arr2[3]);
		
		//For loop
	int i;
		
		for( i=0;i<arr2.length;i++)
		{
			System.out.println(arr2[i]);
		}
	
		String[] Name = {"a","b","c"};
		for( i=0;i<Name.length;i++)
		{
			System.out.println(Name[i]);
			}		
		//System.out.println(Name[1]);
		for( String s : Name )
		{
			System.out.println(s);
		}
	}
}
		
