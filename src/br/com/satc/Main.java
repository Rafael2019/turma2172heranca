/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc;

import br.com.satc.objeto.Cliente;
import java.util.Date;

/**
 *
 * @author rafael.152317
 */
public class Main {
    
    public static void main(String []  args) {

        
   Date dataCadastro = new Date();
   String nome = "Rafael";
   String rg = "12";
   String cpf = "555";
   Cliente c = new Cliente(dataCadastro, nome, rg, cpf);
        
   Funcionario f = new Funcionario("Porfessor", 20, 20, "Rafael", "555"
   )
        
    }

