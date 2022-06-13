/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coorpo;

/**
 *
 * @author Aluno
 */
public class Coorpo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Coracao coracao = new Coracao();
        
        coracao.setDono("joao");
        coracao.getPulsando();
        coracao.setPulsando(true);
        
    }
    
}
