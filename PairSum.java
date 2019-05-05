package arrays;

import java.util.HashSet;
import java.util.Set;

public class PairSum {

	public PairSum() {
		// TODO Auto-generated constructor stub
	}
	
	public void getPairSum(int array[],int sum) {
		
		 Set hs =new HashSet();
		 
		 for(int a:array)
		 {
			 if(hs.contains(sum-a))
				 System.out.println(a+" "+ (sum-a));
			 else
				 hs.add(a);
				 
		 }
	

	}

	public static void main(String[] args) {
		int a[] = { 5, 3, 2, 24, 97, 80 };
		PairSum pe = new PairSum();
		pe.getPairSum(a,5);

	}
	
	

}
