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
public abstract class Pedido {
    protected String descricao;
    protected int quantidade;
    
    public abstract double getValor();

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Pedido(String descricao, int quantidade) {
        this.descricao = descricao;
        this.quantidade = quantidade;
    }
}
