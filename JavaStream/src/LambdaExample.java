import java.util.List;
import java.util.function.Consumer;

public class LambdaExample {
    public static void main(String[] args) {
        final List<String> names = List.of("Adam", "Marcin", "Kasia");

        System.out.println("Normal: ");
        names.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("Hello " +s);
            }
        });

        System.out.println("\n Lambda: ");
        names.forEach(s -> System.out.println("Hello " +s));

        System.out.println("\n Interfejs funkcyjny: ");
        System.out.println(modify("Alek", s -> s + "!")); /// return after ' -> ' (name  + "!")
    }

    public static String modify(String s, StringModifier modifier) {
        return modifier.modify(s);
    }
}
