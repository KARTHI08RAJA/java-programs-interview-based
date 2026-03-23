package ArrayBasedProgram;

import java.util.HashSet;

public class FindDuplicatesElementsInArrayHashset
{

	public static void main(String[] args)
	{
		int arr[]= {2,3,5,3,1,4,2};
		
		HashSet<Integer>set=new HashSet<Integer>(); 
		System.out.println("The duplicate elements are : ");
		
		for(int num:arr)
		{
			if(!set.add(num))
			{
				System.out.println(num);
			}
		}

	}

}
