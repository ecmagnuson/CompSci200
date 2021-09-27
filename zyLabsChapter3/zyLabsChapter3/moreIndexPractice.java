package zyLabsChapter3;
import java.util.Scanner;

public class moreIndexPractice {

	/*
	 * Things I've learned. In the main method you can't just pass a parameter into a method without having that method
	 * say it needs a parameter. So I was really confused when I tried putting a string into the method testGetFileName
	 * but the method itself hadn't been calling for a parameter yet, it was just testGetFileName();
	 */
	
    public static String GetFileName(String userInput) {
    	
    			
		String userInput2 = userInput.substring(userInput.indexOf("-") + 1);
		
		String userInput3 = userInput2.substring(0, userInput2.indexOf("."));
    	
    	return userInput3;
    
    }

    public static String GetFileType(String input) {
    	
    	
    	String fileType2 = input.substring(input.indexOf(".")+ 1);
    	String fileType3 = fileType2.toLowerCase();
    	
        return fileType3;
  
    }

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		String fileData;
		fileData = scnr.nextLine();
		
		GetFileName(fileData);
		GetFileType(fileData);
		
		System.out.println("file type " + GetFileType(fileData));
		
		scnr.close();
		
	}

	
	
}
