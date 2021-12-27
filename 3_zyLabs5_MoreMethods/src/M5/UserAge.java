package M5;

import java.util.Scanner;

public class UserAge {
    public static int getAge(int birthMonth, int birthDay, int birthYear, int currMonth,
            int currDay, int currYear) {

        int currAge = currYear - birthYear;

        // 1 15 1990 6 30 2017 should be 27
        // 2017 - 1990 is 27
        if ((currMonth - birthMonth) > 5) {
            currAge++;
        }

        if ((currMonth - birthMonth) < 4) {
            currAge--;
        }

        if ((currMonth == birthMonth) && (currDay == birthDay)) {
            currAge++;
        }

        if (currAge == 0) {
            currAge = 0;
        }

        return currAge;

    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int birthMonth, birthDay, birthYear;
        int currMonth, currDay, currYear;

        birthMonth = scnr.nextInt();
        birthDay = scnr.nextInt();
        birthYear = scnr.nextInt();
        currMonth = scnr.nextInt();
        currDay = scnr.nextInt();
        currYear = scnr.nextInt();

        System.out.println(getAge(birthMonth, birthDay, birthYear, currMonth, currDay, currYear));

        scnr.close();
    }
}