public class Principal {
    public static void main(String[] args) {

        Professor professor = new Professor("Jason Sobreiro", "jasonzinho@gmail.com", "Desenvolvimento de Software");

        Aluno aluno1 = new Aluno("Gabriel", "dittrchcj@gmail.com", 3, "Manhã");

        // Chamada do método abstrato "falar"
        // Implementando pelas subclasses
        System.out.println(professor.falar());
        System.out.println(aluno1.falar());

        // Chamada do método "estudar" da interface "Acoes"
        // Implementado pelas subclasses
        System.out.println(professor.estudar());
        System.out.println(aluno1.estudar());

        // Corcunseiro
        Concurseiro concurseiro = new Concurseiro();
        System.out.println(concurseiro.estudar());
    }
}
