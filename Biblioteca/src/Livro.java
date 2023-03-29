import org.w3c.dom.ls.LSOutput;

public class Livro {
    String autor;
    String titulo;
    int edicao;
    String estante;
    int prateleira;

    public Livro(String autor, String titulo, int edicao, String estante, int prateleira) {
        this.autor = autor;
        this.titulo = titulo;
        this.edicao = edicao;
        this.prateleira = prateleira;
        this.estante = estante;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
