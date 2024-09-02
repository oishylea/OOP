//QUESTION 1

import java.util.Scanner;

public class EnumTest1 {

    enum Day {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY,FRIDAY,SATURDAY}
    public static void main(String[] args){
        Day workday;
        workday = Day.THURSDAY;
        System.out.println("Today is "+ workday);
        System.out.println("Yesterday was "+ Day.WEDNESDAY);

        //ANSWER question(2)
        Day myDay = Day.SUNDAY;
        Day yourDay= Day.SUNDAY;

        //ANSWER question(3)
        if (myDay == yourDay) {
            System.out.println("myDay and yourDay are equivalent");
        } else {
            System.out.println("myDay and yourDay are not equivalent");        }

        //ANSWER question (4)
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter a day of the weekend \n SUNDAY, SATURDAY): ");
        String input = scanner.nextLine().toUpperCase(); 
        Day weekend;
        
        weekend = Day.valueOf(input);
        System.out.println("You entered: " + weekend);
       
    }
}

/* 
1. Determine the ordinal value for WEDNESDAY 
    Answer : 3

2. Declare two variables of type Day named myDay and yourDay.

3. Compare whether myDay is equivalent to yourDay.

4. Read a String from the keyboard, and assign it to an enum variable named weekend.

5. Display the value of enum variable named weekend.
*/
