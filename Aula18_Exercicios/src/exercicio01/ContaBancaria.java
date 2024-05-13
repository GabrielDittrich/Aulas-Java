package exercicio01;

public abstract class ContaBancaria {

    protected String nomeCliente;
    protected int numConta;
    protected float saldo;

    public ContaBancaria(String nomeCliente, int numConta, float saldo) {
        this.nomeCliente = nomeCliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public abstract void sacar(float valor) throws Exception;

    public abstract void depositar(float valor);

    public abstract void exibirSaldo();

}
