package junit5tutorial;

import java.util.Arrays;
import java.util.Random;

public class C04SortArraysInASpecifiedTime {
	
	//Create a method to sort 100000 integer arrays whose lengths are 5.
	//Array elements should be selected randomly
	//Test it, if it can be done in at most 2 seconds
	
	public void sortArraysInASpecifiedTime() {
		
		Random rand = new Random();
		
		int[] arr = new int[5];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = rand.nextInt(100);
		}
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
	}

}
