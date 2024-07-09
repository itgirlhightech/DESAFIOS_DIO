package dio.AlexaMusicWithStrategy;

public class ElectronicMusic implements AlexaMusic {
    @Override
    public void playMusic() {
        System.out.println("Mudando para sua seleção de eletronica...");
    }
    @Override
    public String getMusicType() {
        return "eletrônica";
    }

    }

