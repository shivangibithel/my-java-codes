import java.util.*;

class A1 {
	public static void main (String[] args)
	{
		int counter , item ,num ;
int 		arr[] ;
		System.out.println("enter no. of elements in array");
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		arr = new int[num];
		for (counter= 0; counter< num; counter++)
		{
			arr[counter]= s.nextInt();
			
		}
		System.out.println("enter no. to search");
		item = s.nextInt();
		for( counter=0;counter<num;counter++)
		{
			if(arr[counter]==item)
			{
				System.out.println("location:" + (counter+1));
				break;
				
			}
		}
		if (counter==num)
		{
				System.out.println("no. does not exist");
		}
	}
}

//linear search.
