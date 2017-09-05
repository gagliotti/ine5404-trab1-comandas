/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ine5404.comanda;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author martin.vigil
 */
public class GerenciadorDeFuncionarios {
    protected Map<String, Funcionario> funcionarios;
    
   public GerenciadorDeFuncionarios(){
       this.funcionarios = new HashMap<>();
   } 
   
   public void addFuncionario(Funcionario funcionario){
       this.funcionarios.put(funcionario.getLogin(), funcionario);
   }
   
}
