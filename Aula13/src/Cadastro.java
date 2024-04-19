import java.util.ArrayList;
import java.util.List;

public class Cadastro {

    private static List<Funcionario> listaFuncionario = new ArrayList<>();

    public static void cadastrar(Funcionario funcionario) {
        listaFuncionario.add(funcionario);
    }

    public static List<Funcionario> getListaFuncionario() {
        return listaFuncionario;
    }

    public static Funcionario buscar(int matricula) {

        // Percorrer a lista de Funcionario
        for (Funcionario tempFunc : listaFuncionario) {

            // Verificar se a matricula recebida como parametro é igual
            // A matricula do funcionario atual (tempFunc)
            if (tempFunc.getMatricula() == matricula) {

                // Se for verdade, retornamos o funcionario atual (funcTemp)
                return tempFunc;
            }
        }

        // Se sair do laço, significa que não há funcionarios com a matricula
        // Igual ao valor do parametro "matricula" recebido no metodo
        return null; // Então retornamos nulo
    }

}
