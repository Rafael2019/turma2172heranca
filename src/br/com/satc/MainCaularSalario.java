/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc;

import br.com.satc.objeto.Funcionario;

/**
 *
 * @author rafael.152317
 */
public class MainCaularSalario {
    
    public static void main(String[] args) {
        
        Funcionario funcionario = new Funcionario("Professor", 30, 20);
        
        System.out.println(funcionario.getSalario());
        
    }
    
}
