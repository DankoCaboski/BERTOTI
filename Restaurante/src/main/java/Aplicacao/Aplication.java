package Aplicacao;


import Aplicacao.Back.Login;
import Aplicacao.Cliente.Cliente;
import Aplicacao.Funcionario.Funcionario;

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
