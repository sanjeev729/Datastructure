package sorting;

import arrays.leader;

public class BinarySearch {
	// Returns location of key, or -1 if not found
	static int  BinarySearch(int A[], int l, int r, int key)
	{
	    int m;
	 
	    while( l <= r )
	    {
	        m = l + (r-l)/2;
	 
	        if( A[m] == key ) // first comparison
	            return m;
	 
	        if( A[m] < key ) // second comparison
	            l = m + 1;
	        else
	            r = m - 1;
	    }
	 
	    return -1;
	}
	public static void main(String[] args) {
	
			int a[] = {1,2, 5, 6, 9, 12 };
		System.out.println(BinarySearch(a, 0, a.length-1, 9));

			

		
	}
}

