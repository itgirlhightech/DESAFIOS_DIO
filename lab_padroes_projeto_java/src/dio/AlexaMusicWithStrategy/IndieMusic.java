package dio.AlexaMusicWithStrategy;

public class IndieMusic implements AlexaMusic {
    @Override
    public void playMusic() {
        System.out.println("Mudando para sua seleção de Indie...");
    }
    @Override
    public String getMusicType() {
        return "indie";
    }
}
