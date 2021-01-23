package junit5tutorial;

import java.util.Arrays;

public class C03CompareArrayElements {

	/*
	 Create a method to compare elements of two arrays.
	 If all elements are same return true, otherwise return false
	 Your method should work for all arrays
	*/
	
	public <T> boolean compareElementsOfTwoArrays(T[] a1, T[] a2) {
		
		Arrays.sort(a1);
		Arrays.sort(a2);
		
		if(Arrays.equals(a1, a2)) {
			return true;
		}else {
			return false;
		}
		
	}
}
