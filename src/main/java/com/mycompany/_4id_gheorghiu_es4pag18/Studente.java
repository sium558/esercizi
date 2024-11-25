/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._4id_gheorghiu_es4pag18;

/**
 *
 * @author gabri
 */
public class Studente {
    private String cognome;
    private String nome;
    private String codiceFiscale; 
    private int numeroMatricola;
    
    public Studente(String cognome, String nome, String codiceFiscale, int numeroMatricola) {
        this.cognome = cognome;
        this.nome = nome;
        this.codiceFiscale = codiceFiscale;
        this.numeroMatricola = numeroMatricola;
    }
    public String getCognome() {
        return cognome;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCodiceFiscale() {
        return codiceFiscale;
    }
    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }
    public int getNumeroMatricola() {
        return numeroMatricola;
    }
    public void setNumeroMatricola(int numeroMatricola) {
        this.numeroMatricola = numeroMatricola;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        System.out.println("il cognome e': "+cognome);
        System.out.println("il nome e': "+nome);
         System.out.println("il codice fiscale e': "+codiceFiscale);
        System.out.println("il numero matricola e': "+numeroMatricola);
        return null;
    }
}

