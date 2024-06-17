package Desafios;

import java.util.Optional;

public class OptionalEx {
    public static void main(String[] args) {
        Optional<String> optionalValue = Optional.of("hello");
        System.out.println(optionalValue.get());

       String nullablevalue = null;
        optionalValue = Optional.ofNullable(nullablevalue);
       System.out.println(optionalValue.isPresent());

        optionalValue = Optional.ofNullable(null);
       String result = optionalValue.orElse("Default");
       System.out.println(result);
    }
}
