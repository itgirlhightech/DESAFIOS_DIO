import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static <List> void main(String[] args) {
        java.util.List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2;

        // vamos reduzir essa parte do codigo
        //int resultado = numeros.stream()
          //      .reduce(0, somar);

        int resultado = numeros.stream()
                        .reduce(0, Integer::sum);

        System.out.println("A soma dos numeros é:  " + resultado);
    }

}
