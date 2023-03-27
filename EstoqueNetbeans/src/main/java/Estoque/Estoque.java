/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estoque;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author danko
 */
public class Estoque {

    List<Produto> estoque = new LinkedList<Produto>();

    public void addProduto(Produto adicionado) {
        estoque.add(adicionado);
    }
}