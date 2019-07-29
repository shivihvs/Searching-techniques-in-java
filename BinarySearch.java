package shivani;
import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args)
	{
		int []a=new int[100];
		int i ,flag=0;
		System.out.println("enter the number of element in an array");
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
	    System.out.println("enter the array elements");
	    for(i=0;i<n;i++)
	    {
	     int t=scn.nextInt();
	     a[i]=t;
	    }
	    System.out.println("enter the element to be searched for");
	    int key=scn.nextInt();
	    int beg=0;
	    int end=n-1;
	    while(beg<=end)
	    {
	    	int mid=(beg+end)/2;
	    	if(key==a[mid])
	    	{
	    		System.out.println("element found  at" + (mid+1));
	    		flag=1;
	    		break;
	    	}
	    	else if(key<a[mid])
	    	{
	    		end=mid-1;
	    	}
	    	else
	    	{
	    		beg=mid+1;
	    	}
	    	 
	    	
	    }
		if(flag==0)
		{
			System.out.println("element not found");
		}

}
}
