

public class PriorityQueue {

    public static void main(String[] args) {
        final java.util.PriorityQueue<String> priorityQueue = new java.util.PriorityQueue<>();
        priorityQueue.add("1");
        priorityQueue.add("3");
        priorityQueue.add("4");
        priorityQueue.add("2");
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
    }
}
