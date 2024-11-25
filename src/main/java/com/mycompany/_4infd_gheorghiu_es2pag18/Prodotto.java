/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._4infd_gheorghiu_es2pag18;

/**
 *
 * @author gabri
 */
public class Prodotto {

    
    private String proprietario;
    private String nomeNegozio; 

  
    public Prodotto(String proprietario, String nomeNegozio) {
        this.proprietario = proprietario;
        this.nomeNegozio = nomeNegozio;
    }

    
    public Prodotto() {
        this.proprietario = "Jeremy";
        this.nomeNegozio = "Jeremy's market";
    }

    
    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public String getNomeNegozio() {
        return nomeNegozio;
    }

    public void setNomeNegozio(String nomeNegozio) {
        this.nomeNegozio = nomeNegozio;
    }

   
   
    public void stampaprodotto() {
        System.out.println("il modello e': "+proprietario);
        System.out.println("il numero e': "+nomeNegozio);
      
      
    }

}
