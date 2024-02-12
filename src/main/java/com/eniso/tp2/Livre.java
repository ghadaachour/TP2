/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp2;

/**
 *
 * @author GHADA
 */
public class Livre {
     private String titre ;
    private String auteur ;
    public int anneePublication;
    public String isbn ;
    public Livre() {
        this.titre = "Titre";
        this.auteur = "Auteur ";
        this.anneePublication = 0;
        this.isbn = "isbn" ;
    }
    public Livre(String titre, String auteur) {
        this.titre = titre;
        this.auteur = auteur;
    }
   

    public Livre(String titre, String auteur, int anneePublication) {
        this(titre, auteur);
        this.anneePublication = anneePublication;
    }

    public Livre(String titre, String auteur, int anneePublication, String isbn) {
        this(titre, auteur, anneePublication); 
        this.isbn = isbn;
    }
 public String getTitre() {
        return titre;
    }

    public void setTitre(String nom) {
        this.titre = titre;
    }
    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String nom) {
        this.auteur= auteur;
    }
    public void afficher(){
          System.out.println("Titre: " + titre);
        System.out.println("Auteur: " + auteur);
        System.out.println("Année de publication: " + anneePublication);
        System.out.println("ISBN: " + isbn);
        System.out.println();
    }
    public static void main(String[] args) {
                Livre livre1 = new Livre();
        Livre livre2 = new Livre("python", "Auteur1");
        Livre livre3 = new Livre("java", "Auteur2", 2002);
        Livre livre4 = new Livre("c", "Auteur3", 2004, "ISBN");

        livre1.afficher();
        livre2.afficher();
        livre3.afficher();
        livre4.afficher();
    }
}