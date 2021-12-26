//package zyLabsChapter8;
///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           checking an array is sorted.
// Course:          CS 200
//
// Author:          Elliott Magnuson
// Email:           ecmagnuson@wisc.edu
// Lecturer's Name: Jim Williams
//
///////////////////////////////// CITATIONS ////////////////////////////////////
//
//
//None.
//
/////////////////////////////// 80 COLUMNS WIDE ////////////////////////////////


public class SortedArray {
   
   public static boolean inOrder(int [] nums) {

      for (int i = 0; i < nums.length - 1; i++) {
    	  if (nums[i] > nums[i+ 1]) {
    		  return false;
    	  } 
      }
      return true;
   }
   
   
   public static void main(String[] args) {
      
      // Test out-of-order example.
      int [] nums1 = {5, 6, 7, 8, 3};
      
      if(inOrder(nums1)){
         System.out.println("In order");
      }else{
         System.out.println("Not in order");
      }
      
      // Test in-order example.
      int [] nums2 = {5, 6, 7, 8, 10};
      
      if(inOrder(nums2)){
         System.out.println("In order");
      }else{
         System.out.println("Not in order");
      }
   }
}
