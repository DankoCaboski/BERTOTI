public class psvm {
    public static void main(String[] args) {
        Estacao.setPress(213.00);
        Estacao.setTemp(14.0);
        Estacao.notifyObservers();
    }
}
