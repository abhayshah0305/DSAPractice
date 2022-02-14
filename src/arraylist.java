import java.util.ArrayList;
import java.util.LinkedList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(345);
        list.add(233);
        list.add(331);
        list.add(345);
        System.out.println(list.contains(345));
        System.out.println(list);
        list.set(1, 345);
        System.out.println(list);
    }
}
