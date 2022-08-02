import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {

      final Stack<String> stack = new Stack<>();
      stack.push("Adam");
      stack.push("Dawid");
      stack.push("Kala");
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        String example = stack.pop();
        System.out.println(example);


    }
}
