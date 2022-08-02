import java.util.Deque;
import java.util.LinkedList;

public class QueueExample {
    public static void main(String[] args) {
        java.util.Queue<String> queque = new LinkedList<>();
        queque.add("Adam");
        queque.add("Patryk");
        queque.add("Dawid");
        System.out.println(queque);
        System.out.println(queque.poll());
        System.out.println(queque.peek());
        System.out.println(queque);
        System.out.println(queque.remove());
        System.out.println("Aktualna kolejka: "+ queque);

        System.out.println("DEQUE");
        Deque<String> deque = new LinkedList<>();
        deque.add("Adam");
        deque.add("Dawid");
        deque.add("Szymon");
        System.out.println(deque);

        deque.offerFirst("Paweł");
        System.out.println(deque);
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());






    }
}