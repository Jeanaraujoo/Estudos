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
public class Coracao {
    private String dono;
    private boolean pulsando;

    
    
                 //Get e set
    public boolean getPulsando() {
        return pulsando;
    }

    public void setPulsando(boolean pulsando) {
     if(pulsando == true){
         System.out.println("Estou vivo");
     }
     else{
         System.out.println("Estou morto");
     }
     
    }

    
    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }
       
}