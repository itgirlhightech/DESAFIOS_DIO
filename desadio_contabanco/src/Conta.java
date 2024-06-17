public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int Sequencial = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;


    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = Sequencial++;
        this.saldo = 0;
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente");
        } else {
        saldo -= valor; }
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Valor de depósito inválido!");
        }
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente para transferência!");
        } else {
            this.sacar(valor);
            contaDestino.depositar(valor);
        }
    }

    protected void ImprimirInfosComuns() {
        System.out.printf(String.format("Titular: %s%n", this.cliente.getNome()));
        System.out.printf(String.format("Agencia: %d%n", this.agencia));
        System.out.printf(String.format("Numero: %d%n", this.numero));
        System.out.printf(String.format("Saldo: %.2f%n", this.saldo));
    }
}
