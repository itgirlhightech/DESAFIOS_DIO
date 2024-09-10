import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private List<Pessoa> filhos;

    public Pessoa(String nome) {
        this.nome = nome;
        this.filhos = new ArrayList<>();

    }

    public String getNome() {
        return nome;
    }

    public void adicionarFilho(Pessoa filho) {
        filhos.add(filho);
    }

    public List<Pessoa> getFilhos() {
        return filhos;
    }
    @Override
    public  String toString() {
        return nome;
    }

}
