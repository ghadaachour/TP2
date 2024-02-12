/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.eniso.tp2;
import com.eniso.tp2.Etudiant;
import java.util.ArrayList ;

/**
 *
 * @author GHADA
 */
public class TP2 {

     public static void main(String[] args) {
        ArrayList <Etudiant> liste = new ArrayList<> ();
        SystemGestionEtudiant gestionEtudiants = new SystemGestionEtudiant(liste);

        gestionEtudiants.getEtudiants().add(new Etudiant("ghada", "achour", 1, "ghadaachour524@gmail.com"));
        gestionEtudiants.getEtudiants().add(new Etudiant("ahmed", "ayed", 2, "ahmedayed@gmail.com"));

        System.out.println("les étudiants initialement:");
        gestionEtudiants.afficherEtudiant();

        gestionEtudiants.modifierEmailEtudiant (2, "ahmedayedl2@yahoo.fr");
        gestionEtudiants.supprimerEtudiant(1);
        System.out.println("les étudiants après les modification  :");
        gestionEtudiants.afficherEtudiant();
     }
}

