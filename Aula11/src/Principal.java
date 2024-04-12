public class Principal {
    public static void main(String[] args) {

        int op;
        String modelo;
        String placa;

        do {
            System.out.println("\nEstacionamento - Menu Principal");
            System.out.println("1) Estacionar Carro");
            System.out.println("2) Liberar Carro");
            System.out.println("3) Listar Carro estacionados");
            System.out.println("0) Sair");
            System.out.println("Informe uma opção: ");
            op = Console.lerInt();

            switch (op) {
                case 1:

                    System.out.println("\nDados dos carros: ");
                    System.out.println("Marca/Modelo: ");
                    modelo = Console.lerString();
                    System.out.println("Placa: ");
                    placa = Console.lerString();

                    Carro carro = new Carro(modelo, placa);

                    Estacionamento.estacionarCarro(carro);

                    break;

                case 2:

                    System.out.println("\nPlaca do carro para liberar: ");
                    placa = Console.lerString();

                    Estacionamento.liberarCarro(placa);

                    break;

                case 3:
                    System.out.println("\nCarros estacionados: ");
                    Estacionamento.mostarCarrosEstacionados();

                    break;

                case 0:
                    System.out.println("Sistema foi finalizado...");
                    break;

                default:
                    System.out.println("\nOpção invalida digite novamente.");
                    break;
            }
        } while (op != 0);
    }
}
