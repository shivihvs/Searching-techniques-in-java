package line_search;
import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
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
	    for(i=0;i<n;i++)
	    {
	    	if(a[i]==key)
	    	{
	    		System.out.println("element is found at position "+(i+1));
	    		flag=1;
	    	}
	    	
	    }
	    if(flag==0)
	    {
	    	System.out.println("element not found");
	    }
		
		// TODO Auto-generated method stub

	}

}
