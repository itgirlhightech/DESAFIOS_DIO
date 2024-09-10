import java.util.Scanner;

public class Example {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        String preto = "preto";
        String rosa = "rosa";
        System.out.println("qual cor voce prefere? rosa ou preto?" );

        String corPreferida = scanner.nextLine();

            if (corPreferida.equalsIgnoreCase("preto")) {
            System.out.println("voce é muito emo");
           }  else  {
                System.out.println("im a barbie girl in a barbie world");

            }

            scanner.close();



    }
}
