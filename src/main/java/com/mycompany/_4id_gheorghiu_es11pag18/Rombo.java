/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._4id_gheorghiu_es11pag18;

/**
 *
 * @author gabri
 */
public class Rombo {
    private final double diagonaleMaggiore;
    private final double diagonaleMinore;
    
    public Rombo(double diagonaleMaggiore, double diagonaleMinore){
        this.diagonaleMaggiore = diagonaleMaggiore;
        this.diagonaleMinore = diagonaleMinore;
    }
    public double calcolaArea(){
        return (diagonaleMaggiore*diagonaleMinore)/2;
    }
    public double calcolaPerimetro(double lato){
        return 4*lato;
    }
}
