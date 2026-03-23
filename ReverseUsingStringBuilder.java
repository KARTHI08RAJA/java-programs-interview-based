package practice;

public class ReverseUsingStringBuilder 
{

	public static void main(String[] args) 
	{
		String str="Raja";
		String rev=new StringBuffer(str).reverse().toString();
		System.out.println(rev);

	}

}
