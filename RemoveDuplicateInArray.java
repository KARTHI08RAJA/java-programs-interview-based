package ArrayBasedProgram;

public class RemoveDuplicateInArray 
{

	public static void main(String[] args) 
	{
		int arr[]= {2,3,3,2,3,5,6};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					arr[j]=-1;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=-1)
			{
				System.out.println(arr[i]);
			}
		}

	}

}
