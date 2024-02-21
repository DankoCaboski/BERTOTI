public class Pessoa {
    private String nome;
    private int cpf;
    
    public Pessoa(String nome, int cpf){
        this.nome = nome;
        this.cpf = cpf;
    }
    
    public static void trancarMatricula(){
        System.out.println("materia trancada");
    }

}
