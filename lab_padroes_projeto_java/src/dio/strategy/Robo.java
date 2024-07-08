package dio.strategy;

public class Robo {
    // a strategy se refere ao comportamento do robo;
    private Comportamento strategy;

    public void setStrategy(Comportamento strategy) {
        this.strategy = strategy;
    }

    public void mover() {
        strategy.mover();
    }
}
