package Aplicacao;


import Back.Login;
import Cliente.Cliente;
import Funcionario.Funcionario;

public class Aplication {
    public static void main(String[] args) {
        Login login = new Login();
        if(login.inicializar()){
            Funcionario.painelFuncionario();
        }
        else {
            Cliente.painelCliente();
        }
    }
}
