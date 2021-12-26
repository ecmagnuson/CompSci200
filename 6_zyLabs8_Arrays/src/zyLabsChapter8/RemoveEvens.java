package zyLabsChapter8;
import java.util.Arrays;
import static java.lang.Math.sqrt;

///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
//Title:           Removing the even numbers from an array.
//Course:          CS 200
//
//Author:          Elliott Magnuson
//Email:           ecmagnuson@wisc.edu
//Lecturer's Name: Jim Williams
//
///////////////////////////////// CITATIONS ////////////////////////////////////
//
//None.
//
/////////////////////////////// 80 COLUMNS WIDE ////////////////////////////////

public class RemoveEvens {

	public static int[] removeEvens(int [] nums) {
		
		
		
		//I have to create a new array that only has odd numbers in it. 
						
		//count the amount of even numbers in nums
		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				j++;
			}
		}
		
		//making a list the size we would expect.
		//j is all of the numbers we removed that are even
		int newNums[] = new int[nums.length - j];
		
		
		int k = 0;
		for (int i = 0; i < nums.length; i++) {
			
			if (nums[i] % 2 != 0) {
				newNums[k] = nums[i];
				k++;
			} 
		}

		
		return newNums;
	}

	public static void main(String[] args) {

		int [] input = {-5,-3,-1,1,3,5};
	
		
		int [] result = removeEvens(input);
	
		// Helper method Arrays.toString() converts int[] to a String
		System.out.println(Arrays.toString(result)); // Should print [1, 3, 5, 7, 9]
		
		
	}
}
