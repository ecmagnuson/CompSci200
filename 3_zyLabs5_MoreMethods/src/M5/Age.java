package M5;

import java.util.Calendar;

//return the age in years months and days from current date
public class Age {
    
    private final int birthMonth;
    private final int birthDay;
    private final int birthYear;
    
    public Age (int birthMonth, int birthDay, int birthYear) {
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.birthYear = birthYear;
    }
    
    public int[] getAge() {
        int[] age = new int[3];
        age[0] = birthMonth;
        age[1] = birthDay;
        age[2] = birthYear;
        return age;
    }
    
    /*
     * returns a length 3 int array of current [month, day, year]
     */
    public static int[] getCurrentDate() {
        int[] currentDate = new int[3];
        
        //MONTH is +1 because January is default to 0.
        currentDate[0] = Calendar.getInstance().get(Calendar.MONTH) + 1;
        currentDate[1] = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
        currentDate[2] = Calendar.getInstance().get(Calendar.YEAR);

        return currentDate;
    }
    
    public static void main (String[] args) {
        
        Age person = new Age(7, 18, 1996);
        int[] personAge = person.getAge();
        int[] currentDate = getCurrentDate();
        
        
        
        
        
    }
}
