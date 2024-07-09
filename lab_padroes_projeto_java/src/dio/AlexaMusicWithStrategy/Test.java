package dio.AlexaMusicWithStrategy;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário que insira o tipo de música
        System.out.println("Escolha o tipo de música (eletronica, indie, pop): ");
        String musicType = scanner.nextLine();

        // Criando a estratégia com base na entrada do usuário
        AlexaMusic musicStrategy;
        switch (musicType.toLowerCase()) {
            case "eletronica":
                musicStrategy = new ElectronicMusic();
                break;
            case "indie":
                musicStrategy = new IndieMusic();
                break;
            case "pop":
                musicStrategy = new PopMusic();
                break;
            default:
                System.out.println("Estilo musical não reconhecido. Usando música padrão (eletronica).");
                musicStrategy = new ElectronicMusic();
        }


        AlexaBot alexaBot = new AlexaBot();
        alexaBot.setStrategy(musicStrategy);
        alexaBot.playMusic();

        scanner.close();
    }

}

