package Task1;

import java.util.ArrayList;
import java.util.HashMap;

public class Drivers {
    public static void main(String[] args) {
        ArrayList<String> animal = new ArrayList<>();

        //Step 1
        animal.add("Angsa");
        animal.add("Bebek");
        animal.add("Cicak");
        animal.add("Domba");
        animal.add("Elang");
        animal.add("Gajah");
        System.out.println("Output");
        System.out.print(animal);
        System.out.println();

        //Step 2
        animal.add("Badak");
        animal.add("Bebek");
        System.out.println("\nOutput");
        System.out.print(animal);
        System.out.println();

        HashMap<String, Integer> counts = new HashMap<String, Integer>();
        for (String str : animal) {
            if (counts.containsKey(str)) {
                counts.put(str, counts.get(str) + 1);
            } else {
                counts.put(str, 1);
            }
        }

        for (String key : counts.keySet()) {
            if (counts.get(key) > 1) {
                System.out.print(key + " = " +counts.get(key));
            }
        }

        System.out.println();
        System.out.println("Posisi Index : " +animal.indexOf("Bebek") + "," +animal.lastIndexOf("Bebek"));

        //Step 3
        animal.remove(1);
        System.out.println("\nOutput");
        System.out.print(animal);
        System.out.println();

        //Step 4
        System.out.print("\n");
        System.out.println("Index Ke-0 : "+animal.get(0));
        System.out.println("Index Ke-2 : "+animal.get(2));
        animal.remove(0);
        System.out.println("Output");
        System.out.print(animal);
        System.out.println("\n");

        //Step 5
        animal.set(0,"Ular");
        animal.add(2,"Itik");
        System.out.println("Output");
        System.out.print(animal);
        System.out.println("\n");

        //Step 6
        for(int i = 4; i >= 2 ; i--){
            animal.remove(i);
        }
        System.out.println("Output");
        System.out.print(animal);
        System.out.println("\n");

        //Step 7
        System.out.println("Output");
        System.out.print("Elemen Pertama: " +animal.get(0));
        System.out.println("\nElemen Terakhir: " +animal.get(animal.size() -1));

        //Step 8
        System.out.println("\nJumlah Elemen: " +animal.size());

        //Step 9
        System.out.println("\nPosisi Index Dari Badak Adalah Ke: " +animal.indexOf("Badak"));

    }
}