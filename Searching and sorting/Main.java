package arrayOperation;

import java.util.*;

public class Main {

	public static void main(String[] args) 

	{

		Scanner num=new Scanner(System.in);

		int [] list=new int[10];
		System.out.println("Enter 10 numbers =");

		for(int i=0;i<10;i++)

		{

			list[i]=num.nextInt();

		}

	
		Searching search =new Searching(list);
    search.linerSearch(5);
		search.binarySearch(5);
		search.bubbleSort();
		search.selectionSort(); //During a single operation, 

                                          //comment down the other operation
		search.printArray();
	}
}

