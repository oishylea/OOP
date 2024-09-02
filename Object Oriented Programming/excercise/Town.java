//ArrayList

import java.util.ArrayList;

public class Town {
    public static void main(String[] args) {
        ArrayList<String> townList = new ArrayList<>();

        townList.add("Kangar");
        townList.add("Penang");
        townList.add("Kuala Lumpur");
        townList.add("Johor Bahru");

        for (int i = 0; i < townList.size(); i++) {
            System.out.println("Element at index " + i + ": " + townList.get(i));
        }

        boolean containsShahAlam = townList.contains("Shah Alam");
        System.out.println("Does the list contain 'Shah Alam'? " + containsShahAlam);

        townList.add(3, "Shah Alam");

        townList.remove(2);

        townList.remove(0);

        int shahAlamIndex = townList.indexOf("Shah Alam");
        System.out.println("Index of 'Shah Alam': " + shahAlamIndex);

        int kangarIndex = townList.indexOf("Kangar");
        if (kangarIndex != -1) {
            townList.set(kangarIndex, "Muar");
        }

        boolean isEmpty = townList.isEmpty();
        System.out.println("Is the list empty? " + isEmpty);
    }
}
