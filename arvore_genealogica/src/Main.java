//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pessoa pai = new Pessoa("Pai");
        Pessoa mae = new Pessoa("Mãe");
        Pessoa filho1 = new Pessoa("Filho1");
        Pessoa filho2 = new Pessoa("Filho2");
        Pessoa neto1= new Pessoa("Neto1");
        Pessoa neto2= new Pessoa("Neto2");

        mae.adicionarFilho(filho1);
        mae.adicionarFilho(filho2);
        filho1.adicionarFilho(neto1);
        filho2.adicionarFilho(neto2);

        ArvoreGenealogica arvore = new ArvoreGenealogica(mae);

        arvore.imprimirArvore();
    }
}