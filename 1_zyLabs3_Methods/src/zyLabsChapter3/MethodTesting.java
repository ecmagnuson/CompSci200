package zyLabsChapter3;
import java.util.Scanner;

public class MethodTesting {

    public static double calcBaseArea(double baseLength, double baseWidth) {
        return baseLength * baseWidth;
    }

    public static double calcPyramidVolume(double baseLength, double baseWidth,
            double pyramidHeight) {
        return calcBaseArea(baseLength, baseWidth) * pyramidHeight * (double) 1 / 3;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        input.close();

        System.out.println("This calculates the volume of a rectangular pyramid");
        System.out.println("Enter three doubles: lenght, width, height");

        double userLength = input.nextDouble();
        double userWidth = input.nextDouble();
        double userHeight = input.nextDouble();

        System.out.println("Volume: " + calcPyramidVolume(userLength, userWidth, userHeight));
    }
}
