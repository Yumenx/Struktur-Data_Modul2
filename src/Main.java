import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> listAnimal = new ArrayList<>();
// number 1
        System.out.println();
        listAnimal.add("Swan");
        listAnimal.add("Goose");
        listAnimal.add("Lizard");
        listAnimal.add("Sheep");
        listAnimal.add("Eagle");
        listAnimal.add("Elephant");
        System.out.println(listAnimal);

// number 2
        listAnimal.add("Rhino"); // add badak and bebek
        listAnimal.add("Goose"); System.out.println();
        System.out.println(listAnimal);
        int totalGoose = Collections.frequency(listAnimal, "Goose"); // count many goose
        System.out.println("Total Goose : " +totalGoose);
        System.out.print("Index of Goose: "); // index of goose
        System.out.print("| ");
        for (int i = 0; i < listAnimal.size(); i++){
            if (listAnimal.get(i) == "Goose"){
                System.out.print(i);
            } System.out.print(" | ");
        }

// number 3
        System.out.println("\n");
        listAnimal.remove(1); // remove first goose
        System.out.println(listAnimal);

// number 4
        System.out.println("Index 0: " +listAnimal.get(0)); // display element index 0 & 2
        System.out.println("Index 2: " +listAnimal.get(2));
        listAnimal.remove(0); // remove index 0
        System.out.println(listAnimal); System.out.println();

// number 5
        listAnimal.set(0, "Snake"); // change lizard to snake
        System.out.println(listAnimal);
        listAnimal.add(2, "Duck");
        System.out.println(listAnimal); System.out.println();

// number 6
        listAnimal.remove("Duck");      // index 2
        listAnimal.remove("Eagle");     // index 3
        listAnimal.remove("Elephant");  // index 4
        System.out.println(listAnimal);

// number 7
        System.out.println("The first element\t: " + listAnimal.get(0));
        System.out.println("The last element\t: " + listAnimal.get(listAnimal.size()-1));

// number 8
        System.out.println("Size of List\t: " +listAnimal.size());

// number 9
        System.out.println("Index of Rhino\t: " +listAnimal.indexOf("Rhino"));

    }
}