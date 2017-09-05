/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ine5404.comanda;

/**
 *
 * @author martin.vigil
 */
public class Produto extends Pedido {
    protected double taxaLucro, taxaImposto, valorCusto;

    public Produto(String descricao, int quantidade, double taxaLucro, double taxaImposto, double valorCusto) {
        super(descricao, quantidade);
        this.taxaLucro = taxaLucro;
        this.taxaImposto = taxaImposto;
        this.valorCusto = valorCusto;
    }
    
    
    @Override
    public double getValor() {
        return (this.taxaImposto + this.taxaLucro + 1)*this.valorCusto;
    }
    
}
