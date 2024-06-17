public class Main {
    public static void main(String[] args) {
        Cliente evilyn = new Cliente();
        evilyn.setNome("Evilyn");

        Conta cc = new ContaCorrente(evilyn);
        Conta poupanca = new ContaPoupanca(evilyn);

        cc.depositar(100);
        cc.transferir(100, poupanca );

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
