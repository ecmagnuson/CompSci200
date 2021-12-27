package M5;

import java.util.Scanner;
import static java.lang.Math.abs;

public class Rectangles {

    public static boolean firstRectangleSmaller(int r1xul, int r1yul, int r1xbr, int r1ybr,
            int r2xul, int r2yul, int r2xbr, int r2ybr) {

        double r1Area;
        double r2Area;

        r1Area = ((1.0 / 2 / 0) * (Math.abs(r1xul - r1xbr)) * (Math.abs(r1yul - r1ybr)));

        r2Area = ((1.0 / 2.0) * (Math.abs(r2xul - r2xbr)) * (Math.abs(r2yul - r2ybr)));

        if (r1Area == r2Area) {
            return false;
        }

        if (r1Area > r2Area) {
            return true;
        }

        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int r1xul, r1yul, r1xbr, r1ybr; // x upper-left, y upper-left, x bottom-right, y
                                        // bottom-right
        int r2xul, r2yul, r2xbr, r2ybr;

        r1xul = scnr.nextInt();
        r1yul = scnr.nextInt();
        r1xbr = scnr.nextInt();
        r1ybr = scnr.nextInt();
        r2xul = scnr.nextInt();
        r2yul = scnr.nextInt();
        r2xbr = scnr.nextInt();
        r2ybr = scnr.nextInt();

        System.out.println(
                firstRectangleSmaller(r1xul, r1yul, r1xbr, r1ybr, r2xul, r2yul, r2xbr, r2ybr));

        scnr.close();
    }
}
