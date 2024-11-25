/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._20241125_4id_gheorghiu_es1pag18;

/**
 *
 * @author gabri
 */
public class TelefonoCellulare {
    private String modello;
    private String numero;
    public TelefonoCellulare(String modello, String numero){
        this.modello=modello;
        this.numero=numero;
    }
    public String getModello(){
        return modello;
    }
    public void setModello(String modello){
        this.modello=modello;
    }
    public String getNumero(){
        return numero;
    }
    public void setNumero(String numero){
        this.numero=numero;
    }
    public String stampatelefono(){
        System.out.println("il modello e': "+modello);
        System.out.println("il numero e': "+numero);
        return null;
        
    }
    
}
