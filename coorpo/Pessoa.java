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
public class Pessoa {
    Coracao coracao = new Coracao();
    private String nome;
    private int idade;
   
           //Get e Sets
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Pessoa(String nome, int idade, Coracao coracao ) {
        this.nome = nome;
        this.idade = idade;
        this.coracao = coracao;

    }
    
  
}