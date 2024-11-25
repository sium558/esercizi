/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._4id_gheorghiu_es6_pag18;

/**
 *
 * @author gabri
 */
public class ContatoreModulo{
    private int valore;
    private final int n;

    public ContatoreModulo(int n){
        this.valore = 0;
        this.n = n;
    }

    public void incrementa(){
        valore++;
        if (valore >= n) {
            valore = 0;
        }
    }
    public void decrementa(){
        valore--;
        if (valore < 0) {
            valore = n - 1; // Riparte dal massimo
        }
    }

    public int getValore() {
        return valore;
    }
}
