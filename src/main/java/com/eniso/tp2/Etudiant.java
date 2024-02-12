/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp2;

/**
 *
 * @author GHADA
 */
public class Etudiant {
    private String nom;
    private String prenom;
    private int numeroinscription;
    private String email;

    public Etudiant(String nom, String prenom, int numeroInscription, String email) {
        this.nom = nom;
        this.prenom = prenom;
        this.numeroinscription = numeroinscription;
        this.email = email;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getNumeroinscription() {
        return numeroinscription;
    }

    public void setNumeroInscription(int numeroInscription) {
        this.numeroinscription = numeroInscription;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String toString() {
        return "Etudiant:" +
                "nom= " + nom + ' ' +
                ", prenom= " + prenom + ' ' +
                ", numeroInscription=" + numeroinscription +
                ", email= " + email + ' ' 
                   ;
    }
}
