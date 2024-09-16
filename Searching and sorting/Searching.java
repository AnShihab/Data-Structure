package arrayOperation;



public class Searching 

{

	int[] list; //member variable 
	public Searching(int[] list) //local variable
	{
		this.list = list;
	}
	public void linerSearch(int item)
	{
	    int location = -1;
		boolean presence = false;
		for(int i=0 ; i<list.length-1;i++)
		{
			if(item == list[i])
			{
				presence = true;
				location=i;
				break;
			}
		}

		if(presence == true)
		{
			System.out.print("\n Found in the list "+location);
		}
		else
		{
			System.out.println("\n Not found in the list");
		}	

	}
	public void binarySearch(int item)
	{
	    int low =0;
		int up=list.length - 1;
		boolean presence=false;
		int location=-1;
		
		while(low<=up)
		{
			int mid=(low+up)/2;
			if(item == list[mid])
			{
				presence=true;
				location=mid;
				break;
			}
			else if(item > list[mid])
			{
				low = mid + 1;
			}
			else
			{
				up= mid - 1;
			}
		}

		if(presence==false)
		{
			System.out.println("\n The data is not found in the list!!!");
		}

		else
		{
			System.out.println("\n The data is in the index "+location);
		}
	}

	

	public void bubbleSort()
	{
	   for(int j=0;j<list.length-1;j++)
		{
			for(int i=0;i<list.length-1-j;i++)
			{
				if(list[i]>list[i+1])
				{
					int temp = list[i];
					list[i]=list[i+1];
					list[1+i]=temp;
				}
			}
		}
	}

	

	public void selectionSort()
	{
	    int min;
		int i,j;
		for(j=0;j<list.length-1;j++)
		{
			min=j;
			for(i=j+1;i<list.length;i++)
			{
				if(list[i]<list[min])
				{
					min=i;
				}
			}
			int temp=list[min];
			list[min]=list[j];
			list[j]=temp;

		}
	}
	public void printArray()
	{
		for(int i=0;i<list.length;i++)

		{
			System.out.println(list[i]+" ");
		}

	}

}
