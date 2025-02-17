// Write  a  java  program  to  represent  the 
// collection concept.

import java.util.*;

public class CollectionConcept {

    public static void main(String[] args) {
        
         // Using ArrayList (List) - allows duplicates
         List<String> fruitsList = new ArrayList<>();
         fruitsList.add("Apple");
         fruitsList.add("Banana");
         fruitsList.add("Apple"); // Duplicate item
         System.out.println("List (ArrayList): " + fruitsList);
 
         // Using HashSet (Set) - does not allow duplicates
         Set<String> fruitsSet = new HashSet<>();
         fruitsSet.add("Apple");
         fruitsSet.add("Banana");
         fruitsSet.add("Apple"); // Duplicate item will be ignored
         System.out.println("Set (HashSet): " + fruitsSet);
    }
}
