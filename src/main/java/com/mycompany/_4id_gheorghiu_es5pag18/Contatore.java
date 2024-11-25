/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._4id_gheorghiu_es5pag18;

/**
 *
 * @author gabri
 */
public class Contatore {
    private int valore;

    public Contatore() {
        this.valore = 0;
    }
    // Metodo per incrementare il contatore
    public void incrementa() {
        valore++;
    }
    public void decrementa() {
        valore--;
    }
    public int getValore() {
        return valore;
    }
    public void reset() {
        valore = 0;
    }
}
