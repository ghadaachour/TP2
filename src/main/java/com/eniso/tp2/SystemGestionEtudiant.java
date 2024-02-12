/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp2;
import com.eniso.tp2.Etudiant;
import java.util.ArrayList ;
/**
 *
 * @author GHADA
 */
public class SystemGestionEtudiant {
     private ArrayList<Etudiant> etudiants;
    public SystemGestionEtudiant(ArrayList<Etudiant> etudiants) {
        this.etudiants = etudiants;
    }
    public void setEtudiants(ArrayList<Etudiant> etudiants) {
        this.etudiants = etudiants;
 }

    public ArrayList<Etudiant> getEtudiants() {
        return etudiants; 
    }
    public void afficherEtudiant () {
        for ( Etudiant etudiant : this.etudiants   ){
            System.out.println(etudiant.toString()); 
     }}
   
  public void modifierEmailEtudiant (int numeroinscription, String nouvelEmail) {
        for (Etudiant etudiant : etudiants) {
            if (etudiant.getNumeroinscription() == numeroinscription) {
                etudiant.setEmail(nouvelEmail);
                System.out.println("l'Email est modifié");
                return;
            }
        }
        System.out.println(" le numéro d'inscription n'existe pas ");
    }

    public void supprimerEtudiant(int numeroInscription) {
     for (int i = 0; i < etudiants.size(); i++) {
        Etudiant etudiant = etudiants.get(i);
        if (etudiant.getNumeroinscription() == numeroInscription) {
            etudiants.remove(i);
            System.out.println("Étudiant supprimé ");
            return;
        }
    }
    System.out.println("numéro d'inscription ne se trouve pas ");
}
    }




    

