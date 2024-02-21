public class Aluno extends Pessoa{
    private String materias;

    public Aluno(String nome, int cpf, String materias) {
        super(nome, cpf);
        this.materias = materias;
    }
    
}
