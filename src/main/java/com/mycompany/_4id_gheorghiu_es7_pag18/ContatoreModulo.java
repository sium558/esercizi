/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._4id_gheorghiu_es7_pag18;

/**
 *
 * @author gabri
 */
public class ContatoreModulo{
    private int valore;
    private final int n;
    private final int passo;
    
    public ContatoreModulo(int n, int passo){
        this.valore = 0;
        this.n = n;
        this.passo = passo;
    }
    public void incrementa() {
        valore += passo;
        if (valore>=n) {
            valore=0;
        }
    }
    public void decrementa() {
        valore-=passo;
        if (valore<0) {
            valore=n-passo;
        }
    }
    public int getValore() {
        return valore;
    }
}
