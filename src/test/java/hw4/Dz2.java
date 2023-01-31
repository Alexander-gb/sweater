package hw4;// Java program for reversing linked list using additional space
import java.util.*;

public class Dz2 {
    public static void main(String[] args)
    {
        LinkedList<String> linkedli = new LinkedList<String>();
        linkedli.add("Манго");
        linkedli.add("Апельсин");
        linkedli.add("Яблоко");
        linkedli.add("Груша");
        linkedli.add("Гранат");
        System.out.print("Элементы до разворота: " + linkedli);
        linkedli = reverseLinkedList(linkedli);
        System.out.print("\nЭлементы после разворота: " + linkedli);
    }


    public static LinkedList<String> reverseLinkedList(LinkedList<String> llist)
    {
        LinkedList<String> revLinkedList = new LinkedList<String>();
        for (int i = llist.size() - 1; i >= 0; i--) {

            revLinkedList.add(llist.get(i));
        }

        return revLinkedList;
    }
}