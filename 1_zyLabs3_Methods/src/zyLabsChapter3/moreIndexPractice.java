package zyLabsChapter3;
import java.util.Scanner;

public class moreIndexPractice {
	
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
		
		Scanner input = new Scanner(System.in);
		
		String fileData = input.nextLine();
		input.close();
		
		GetFileName(fileData);
		String fileType = GetFileType(fileData);
		
		System.out.println("file type " + GetFileType(fileType));			
	}
}
