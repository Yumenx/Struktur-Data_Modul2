package Task2;

public class Drivers {
    public static void main(String[] args) {
        LinkedList myList = new LinkedList();
        myList.append(8);
        myList.append(7);
        myList.append(1);
        myList.append(4);
        myList.append(6);
        myList.append(2);
        myList.append(3);


        System.out.print("Before: ");
        myList.printList();
        myList.sort();
        System.out.print("After: ");
        myList.printList();
    }
}
