public class Sistema {

    private static void exibirMenu() {

        System.out.println("\nFuncionario System");
        System.out.println("1) Cadastro Programados");
        System.out.println("2) Cadastro Gerente");
        System.out.println("3) Procurar Funcionario");
        System.out.println("4) Listar Todos");
        System.out.println("0) Sair");
        System.out.println("Informe uma opção: ");
    }

    private static void verificarOpcao(int op) {

        int matricula;
        String nome;
        String linguagens;
        String nomeProjeto;

        switch (op) {
            case 1:

                System.out.println("\nNovo Programador");

                System.out.println("Mátricula: ");
                matricula = Console.lerInt();

                System.out.println("Nome: ");
                nome = Console.lerString();

                System.out.println("Linguagem que o programador domina: ");
                linguagens = Console.lerString();

                Programador p = new Programador(matricula, nome, linguagens);

                Cadastro.cadastrar(p);
                System.out.println("\nProgramador cadastrado com sucesso");

                break;
            case 2:
                System.out.println("\nNovo Gerente");

                System.out.println("Mátricula");
                matricula = Console.lerInt();

                System.out.println("Nome: ");
                nome = Console.lerString();

                System.out.println("Projeto que gerencia: ");
                nomeProjeto = Console.lerString();

                Gerente g = new Gerente(matricula, nome, nomeProjeto);
                Cadastro.cadastrar(g);

                System.out.println("Gerente cadastrado com sucesso");

                break;
            case 3:

                System.out.println("\nProcurar Funcionario");
                System.out.println("Matricula: ");
                matricula = Console.lerInt();

                // Enviar a matricula digitada como parametro para o
                // Metodo buscar da classe Cadastro
                // ou null se não encontrar funcionario com essa matricula informada
                Funcionario f = Cadastro.buscar(matricula);

                if (f != null) {
                    System.out.println("\nFuncionario localizado");
                    System.out.println(f.toString());
                    return;
                }
                System.out.println("\n O funcionario" + matricula + " não foi encontrado");

                break;
            case 4:

                System.out.println("\nTodos os funcionário Cadastrados: ");

                if (Cadastro.getListaFuncionario().size() == 0) {
                    System.out.println("Não há funcionarios cadastrados...");
                    return; // Finalizar o metodo
                }
                // Caso contrário percorrer a lista e mostrar os funcionarios um a um
                for (Funcionario tempFunc : Cadastro.getListaFuncionario()) {
                    System.out.println(tempFunc.toString());
                }

                break;
            case 0:
                System.out.println("Programa foi finalizado...");

                break;
            default:
                System.out.println("Opção invalida.");
                System.out.println("Digite novamente: ");
                break;
        }
    }

    public static void executar() {

        int op;
        do {
            exibirMenu();
            op = Console.lerInt();
            verificarOpcao(op);

        } while (op != 0);
    }
}
