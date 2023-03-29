import java.util.Scanner;

public class Localizacao {
    private String corredor;
    private int estante;
     public Localizacao(String corredor, int estante){
         this.corredor = corredor;
         this.estante = estante;
     }

    public String getCorredor() {
        return corredor;
    }

    public void setCorredor(String corredor) {
        this.corredor = corredor;
    }

    public int getEstante() {
        return estante;
    }

    public void setEstante(int estante) {
        this.estante = estante;
    }
}
