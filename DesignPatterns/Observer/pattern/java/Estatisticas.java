package Observer.pattern.java;

public class Estatisticas implements Observer{

    @Override
    public void update(Double press, Double temp) {
        System.out.println("estatisticas");
    }
    
}
