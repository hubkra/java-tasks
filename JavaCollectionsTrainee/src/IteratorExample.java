import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
         ArrayList<String> strings = new ArrayList<>();
        strings.add("1");
        strings.add("2");
        strings.add("3");
        strings.add("4");
        strings.add("5");


        System.out.println("Pętla");
        for (String s : strings)
        {
            System.out.println(s);
        }

        System.out.println("\n Streamy");
        strings
                .stream().
                forEach(System.out::println);

        System.out.println("\n Iterator");
        Iterator<String> iterator = strings.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

    }
}
