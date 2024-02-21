package Observer.pattern.java;

public class Teste {
    public static void main(String[] args) {
        Dashboard teste = new Dashboard();
        Estacao.addObserver(teste);

        Estatisticas estatisticas = new Estatisticas();
        Estacao.addObserver(estatisticas);

        Estacao.notifyObservers();
    }
}
