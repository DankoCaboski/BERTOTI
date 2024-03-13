public class Main {
    public static void main(String[] args) {
        Presidente presidente = Presidente.getPresidente();
        System.out.println(presidente.getNome());
        System.out.println(presidente.getPais());
    }
}
