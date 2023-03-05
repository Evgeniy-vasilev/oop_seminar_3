import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.add("1");
        list.add("2");
        list.add("4");
        list.add("5");
        list.add(1, "3");


        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String element = iterator.next();
            System.out.println(element);
        }

    }
}