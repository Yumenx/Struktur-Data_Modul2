import java.util.Iterator;
import java.util.LinkedList;

public class Drivers {
        public static void main(String[] args) {
            LinkedList<String> Animal = new LinkedList<>();
            Animal.add("Sapi");
            Animal.add("Kelinci");
            Animal.add("Kambing");
            Animal.add("Unta");
            Animal.add("Domba");
            System.out.println("Hewan: " +Animal);
            System.out.println();


            LinkedList<String> deleteAnimal = new LinkedList<>();
            deleteAnimal.add("Kelinci");
            deleteAnimal.add("Kambing");
            deleteAnimal.add("Unta");
            System.out.println("Hewan Yang Akan Di Hapus: ");
            System.out.print(deleteAnimal);
            System.out.println();


            Iterator<String> iterator = Animal.iterator();
            while(iterator.hasNext()){
                String animal = iterator.next();
                if(deleteAnimal.contains(animal)){
                    iterator.remove();
                }
            }

            System.out.println();
            System.out.println("Hasil penghapusan data:");
            for(String animal : Animal){
                System.out.println(animal);
            }
        }
    }