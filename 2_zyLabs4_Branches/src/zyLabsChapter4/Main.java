package zyLabsChapter4;


import java.util.Scanner; 

public class Main {
   
	public static double activityCalories(String userActivity, int userMinutes) {
		
		double caloriesPerMinute;
		caloriesPerMinute = 0.0;
	
		if (userActivity.equals("walk")) {
		   caloriesPerMinute = 5.4 * userMinutes;
		}
		
		if (userActivity.equals("sit")) {
			   caloriesPerMinute = 1.4 * userMinutes;
		}
		
		if (userActivity.equals("run")) {
			   caloriesPerMinute = 13.0 * userMinutes;
		}
		
		if (userActivity.equals("bike")) {
			   caloriesPerMinute = 6.8 * userMinutes;
		}
		
		if (userActivity.equals("swim")) {
			   caloriesPerMinute = 8.7 * userMinutes;
		}
		
		return caloriesPerMinute;
}  
     
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in); 
      int userMinutes; 
      String userActivity; 
      
      userActivity = scnr.next(); 
      userMinutes = scnr.nextInt(); 
      
      System.out.println(activityCalories(userActivity, userMinutes)); 
   }
}
