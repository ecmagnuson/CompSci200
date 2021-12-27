package zyLabsChapter3;

public class indexPractice {

    // prints values between - and .
    public static void getFileName(String fileName) {

        System.out.println(
            fileName.substring(
                fileName.indexOf("-") + 1, //beginning index
                fileName.indexOf(".")      //ending index
            )
        );
    }

    //returns after the .
    public static void getFileType(String fileName) {
        
        System.out.println(
            fileName.substring(fileName.indexOf(".") + 1)
        );
    }

    public static void main(String[] args) {

        String fileName = "123-Homework.pdf";

        getFileName(fileName);
        getFileType(fileName);
    }
}

// String s = "Allofthisrandomstuff=itwillprintthis";
// String s1 = s.substring(s.indexOf("=")+1);

// System.out.print(s1.trim());

// "hamburger".substring(4, 8) returns "urge"

// String s = "test string (67)";

// s = s.substring(s.indexOf("i") + 1);
// s = s.substring(0, s.indexOf(")"));

// System.out.println(s);
