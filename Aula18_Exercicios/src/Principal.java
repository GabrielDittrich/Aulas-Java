import exercicio01.ContaCorrente;

public class Principal {

    public static void main(String[] args) throws Exception {

        // Nova instancia da classe ContaCorrente
        ContaCorrente oc = new ContaCorrente("Luan", 1234, 2500, 500);

        // Exibindo saldo atual do objeto "oc"
        oc.exibirSaldo();

        // Depositando 300 reais
        oc.depositar(300);

        // Tentar realizar saque de 600 reais
        try {
            oc.sacar(600);
        } catch (Exception e) {
            // se exceder o limite disponivel para o saque, a exceção sera lançada:
            System.out.println(e.getMessage());
        }

        // Exibir saldo atual do objeto "cc"
        oc.exibirSaldo();

        // Tentar realizar saque de 5000 reais
        try {
            oc.sacar(5000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        oc.exibirSaldo();

    }
}
