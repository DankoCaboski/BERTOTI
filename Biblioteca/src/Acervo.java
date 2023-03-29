import java.util.LinkedList;
import java.util.List;

public class Acervo{
    List<Livro> acervo = new LinkedList<Livro>();

    public void addLivro(String autor, String titulo, int edicao, String estante, int prateleira){
        acervo.add(new Livro(autor,titulo,edicao,estante,prateleira));
    }

}
