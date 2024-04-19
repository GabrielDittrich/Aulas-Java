public class Programador extends Funcionario {

    private String linguagem;

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }

    public Programador(String linguagem) {
        this.linguagem = linguagem;
    }

    public Programador(int matricula, String nome, String linguagem) {
        super(matricula, nome);
        this.linguagem = linguagem;
    }

    public Programador() {
    }

    @Override
    public String toString() {
        return super.toString() + "Linguagens que dominam: " + linguagem + "\n";
    }
}
