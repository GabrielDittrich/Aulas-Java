public class Aluno extends Pessoa {
    private int periodoAtual;
    private String turno;

    public Aluno() {

    }

    public Aluno(int periodoAtual, String turno) {
        this.periodoAtual = periodoAtual;
        this.turno = turno;
    }

    public Aluno(String nome, String email, int periodoAtual, String turno) {
        super(nome, email);
        this.periodoAtual = periodoAtual;
        this.turno = turno;
    }

    public int getPeriodoAtual() {
        return periodoAtual;
    }

    public void setPeriodoAtual(int periodoAtual) {
        this.periodoAtual = periodoAtual;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + "\nPeriodo Atual: " + periodoAtual + "Turno em que esta: " + turno;
    }

    @Override
    public String falar() {
        return "\nO Aluno " + getNome() + " esta conversando";
    }

    @Override
    public String estudar() {
        return "O Aluno " + getNome() + " Está estudando para a prova";
    }
}
