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
public class Funcionario {
    protected String login, senha;
    protected boolean ehGerente;

    public Funcionario(String login, String senha, boolean ehGerente) {
        this.login = login;
        this.senha = senha;
        this.ehGerente = ehGerente;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isEhGerente() {
        return ehGerente;
    }

    public void setEhGerente(boolean ehGerente) {
        this.ehGerente = ehGerente;
    }
    
    
}
