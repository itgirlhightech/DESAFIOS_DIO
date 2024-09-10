public class ArvoreGenealogica {
    private Pessoa raiz;

    public ArvoreGenealogica(Pessoa raiz) {
        this.raiz = raiz;
    }

    public Pessoa getRaiz() {
        return raiz;
    }

    public void imprimirArvore(Pessoa pessoa, int nivel) {
        if (pessoa == null) {
            return;
        }

        for (int i = 0; i < nivel; i++) {
            System.out.print("  ");
        }
        System.out.println(pessoa);

        for (Pessoa filho : pessoa.getFilhos()) {
            imprimirArvore(filho, nivel + 1);
        }
    }

    public void imprimirArvore() {
        imprimirArvore(raiz, 0);
    }
}
