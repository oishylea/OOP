//QUESTION 2

import java.util.Scanner;

enum Animal {
    CAT ("fish"), COW("grass"), TIGER("meat");
    String eat;
    Animal (String m){
        eat=m;
    }
}

public class EnumTest3 {

    public static Animal h;
    h=Animal.CAT;
    public static void main (String [] args){
        System.out.println("Cow eats "+h.eat);
        System.out.println("Cat eats "+Animal.CAT.eat);
        System.out.println("The ordinal value for COW is "+Animal.COW.ordinal());

        Scanner in = new Scanner (System.in);
        System.out.println("Taipkan pilihan ");
        System.out.print("(CAT,COW,TIGER) : ");
        String input = in.next().toUpperCase();
        Animal hwn = Enum.valueOf(Animal.class, input) ;
        System.out.println("Choose an animal: "+hwn);

        if (hwn.equals(Animal.TIGER)){
            System.out.println("This animal is dangerous!!");
        }
        else if(hwn.equals(Animal.CAT))
            System.out.println("This animal can be our pet :)");
        
        else if (hwn.equals(Animal.COW))
            System.out.println("We can eat its meat...");
    }

}
    
    