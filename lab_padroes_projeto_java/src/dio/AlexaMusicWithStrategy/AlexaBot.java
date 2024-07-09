package dio.AlexaMusicWithStrategy;

public class AlexaBot {
    // a strategy se refere ao comportamento do robo;
    private AlexaMusic musicStrategy;

    public void setStrategy(AlexaMusic musicStrategy) {
        this.musicStrategy = musicStrategy;
    }

    public void playMusic() {
        if (musicStrategy != null) {
            System.out.println(musicStrategy.getMusicType());
            musicStrategy.playMusic();
        } else {
            System.out.println("Nenhum estilo musical encontrado");

        }
    }

}
