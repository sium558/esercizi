/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._4id_gheorghiu_es10pag18;

/**
 *
 * @author gabri
 */
public class Rettangolo{
    private final double x1;
    private final double y1;
    private final double x2;
    private final double y2;

    public Rettangolo(double x1, double y1, double x2, double y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    public double calcolaArea(){
        return Math.abs((x2 - x1)*(y2 - y1));
    }
    public double calcolaPerimetro() {
        return 2*(Math.abs(x2 - x1) + Math.abs(y2 - y1));
    }
}