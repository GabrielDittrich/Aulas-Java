public class Professor extends Pessoa {

    private String diciplina;

    public Professor() {
    }

    public Professor(String nome, String email, String diciplina) {
        super(nome, email);
        this.diciplina = diciplina;
    }

    public String getDiciplina() {
        return diciplina;
    }

    public void setDiciplina(String diciplina) {
        this.diciplina = diciplina;
    }

    @Override
    public String toString() {

        return super.toString() + "\nDiciplinas: " + diciplina;
    }

    @Override
    public String falar() {
        return "\nO Professor está lecionando";
    }

    @Override
    public String estudar() {
        return "\nO Professoar " + getNome() + " Está estudando para a aula";
    }
}
