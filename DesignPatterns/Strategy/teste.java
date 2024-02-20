public class teste {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        
        cliente.setEmprestimo(new Proibido());

        cliente.getEmprestimo().emprestar();
    }
}
