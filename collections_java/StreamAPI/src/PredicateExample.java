import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] agrs) {
        List<String> palavras = Arrays.asList("java", "python", "javascript", "ruby", "c#");

        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

        palavras.stream()
                .filter(p -> p.length() < 5)
                .forEach(System.out::println);
    }
}
