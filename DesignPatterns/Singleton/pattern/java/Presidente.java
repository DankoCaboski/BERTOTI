public class Presidente {
    private String nome = "Teste";
    private String pais = "Brasil";

    private static Presidente presidente;

    private Presidente() {
    }

    public static Presidente getPresidente() {
        if (presidente == null) {
            presidente = new Presidente();
        }
        return presidente;
    }

    public String getNome() {
        return nome;
    }

    public String getPais() {
        return pais;
    }
    
}