package zyLabsChapter3;

public class indexPractice {
	
	
    public static void testGetFileName() {
    	
    	
		String fileName = "123-Homework.pdf";
		
		fileName = fileName.substring(fileName.indexOf("-") + 1);
		fileName = fileName.substring(0, fileName.indexOf("."));
    	
    	System.out.println(fileName);
    
    }


    public static void testGetFileType() {
    	
    	String fileType = "123-Homework.pdf";
    	String fileType2 = fileType.substring(fileType.indexOf(".")+ 1);
    	
        System.out.println(fileType2);
  
    }

	public static void main(String[] args) {
		
		testGetFileType();
		testGetFileName();	
		
	}

}		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//String s = "Allofthisrandomstuff=itwillprintthis";
		//String s1 = s.substring(s.indexOf("=")+1);
		
		//System.out.print(s1.trim());
		
		
		//"hamburger".substring(4, 8) returns "urge"
		
		//String s = "test string (67)";

		//s = s.substring(s.indexOf("i") + 1);
		//s = s.substring(0, s.indexOf(")"));

		//System.out.println(s);
		
		

