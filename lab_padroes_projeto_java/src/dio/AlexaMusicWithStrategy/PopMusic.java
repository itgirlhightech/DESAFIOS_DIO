package dio.AlexaMusicWithStrategy;

public class PopMusic implements AlexaMusic {

    @Override
    public void playMusic() {
        System.out.println("Mudando para a sua seleção de pop...");
    }
    @Override
    public String getMusicType() {
        return "pop";
    }
}

