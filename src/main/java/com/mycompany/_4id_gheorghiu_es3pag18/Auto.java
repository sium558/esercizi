/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._4id_gheorghiu_es3pag18;

/**
 *
 * @author gabri
 */
public class Auto {
    private String marca;  
    private String modello;
    private String targa;
    private int anno;

  
    public Auto(String marca, String modello, String targa, int anno) {
        this.marca = marca;
        this.modello = modello;
        this.targa = targa;
        this.anno = anno;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModello() {
        return modello;
    }
    public void setModello(String modello) {
        this.modello = modello;
    }
    public String getTarga() {
        return targa;
    }
    public void setTarga(String targa) {
        this.targa = targa;
    }
    public int getAnno() {
        return anno;
    }
    public void setAnno(int anno) {
        this.anno = anno;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        System.out.println("la marca e': "+marca);
        System.out.println("il modello e': "+modello);
         System.out.println("la targa e': "+targa);
        System.out.println("l'anno e': "+anno);
        return null;
    }
}
