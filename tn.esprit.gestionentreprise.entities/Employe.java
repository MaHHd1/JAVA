package tn.esprit.gestionzoo.entities;

import java.util.*;

public class Employe implements Comparable<Employe> {
    private int identifiant;
    private String nom;
    private String prenom;
    private String nomDepartement;
    private int grade;

    public Employe() {
    }

    public Employe(int identifiant, String nom, String prenom, String nomDepartement, int grade) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.prenom = prenom;
        this.nomDepartement = nomDepartement;
        this.grade = grade;
    }

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
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

    public String getNomDepartement() {
        return nomDepartement;
    }

    public void setNomDepartement(String nomDepartement) {
        this.nomDepartement = nomDepartement;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employe employe = (Employe) obj;
        return identifiant == employe.identifiant && nom.equals(employe.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identifiant, nom);
    }

    @Override
    public int compareTo(Employe e) {
        return Integer.compare(this.identifiant, e.identifiant);
    }

    @Override
    public String toString() {
        return "Employe{" +
                "identifiant=" + identifiant +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", nomDepartement='" + nomDepartement + '\'' +
                ", grade=" + grade +
                '}';
    }
}