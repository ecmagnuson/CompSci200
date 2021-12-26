package zyLabsChapter9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sandbox {

    // .length
    // write method to be as permissive as possible. Dont care what kind of list.
    // List interface of ArrayList
    // interface vs class differentiate.
    // implement interface extend classes.
    //
    public static Boolean isOrthogonal(List<Object> a, List<Number> b) {

        int runningSum = 0;

        for (int i = 0; i < a.size(); i++) {
            runningSum += (a.get(i).toString(). * b.get(i).intValue());
        }

        if (runningSum == 0) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        List<Object> a = Arrays.asList(1.0, 1.0, -1, "hello,world");
        List<Number> b = Arrays.asList(-1, -1, -1, -1);

        System.out.println(isOrthogonal(a, b));
    }
}
