import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierExample {
    public static void main(String[] agrs) {
        Supplier<String> cumprimento = () -> "Olá, é um prazer conhecê-lo(a)!";

        List<String> listaCumprimento = Stream.generate(() ->  "Olá, é um prazer conhecê-lo(a)!")
                .limit(5)
                .collect(Collectors.toList());

        listaCumprimento.forEach(c -> System.out.println(c));
    }
}
