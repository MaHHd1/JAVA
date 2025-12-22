package tn.esprit.gestionzoo.entities;

import java.util.*;

public class AffectationHashMap {
    private HashMap<Employe, Departement> affectations;

    public AffectationHashMap() {
        this.affectations = new HashMap<>();
    }

    public void ajouterEmployeDepartement(Employe e, Departement d) {
        affectations.put(e, d);
        System.out.println("Employé " + e.getNom() + " affecté au département " + d.getNomDepartement());
    }

    public void afficherEmployesEtDepartements() {
        System.out.println("\n=== Liste des affectations ===");
        if (affectations.isEmpty()) {
            System.out.println("Aucune affectation.");
        } else {
            for (Map.Entry<Employe, Departement> entry : affectations.entrySet()) {
                System.out.println("Employé: " + entry.getKey().getNom() + " " + entry.getKey().getPrenom() +
                        " (ID: " + entry.getKey().getIdentifiant() + ") -> Département: " +
                        entry.getValue().getNomDepartement());
            }
        }
        System.out.println("Total: " + affectations.size() + " affectation(s)");
    }

    public void supprimerEmploye(Employe e) {
        if (affectations.containsKey(e)) {
            affectations.remove(e);
            System.out.println("Employé " + e.getNom() + " supprimé avec succès.");
        } else {
            System.out.println("Employé " + e.getNom() + " non trouvé.");
        }
    }

    public void supprimerEmployeEtDepartement(Employe e, Departement d) {
        if (affectations.containsKey(e) && affectations.get(e).equals(d)) {
            affectations.remove(e);
            System.out.println("Employé " + e.getNom() + " du département " + d.getNomDepartement() + " supprimé avec succès.");
        } else {
            System.out.println("Affectation non trouvée.");
        }
    }

    public void afficherEmployes() {
        System.out.println("\n=== Liste des employés ===");
        if (affectations.isEmpty()) {
            System.out.println("Aucun employé.");
        } else {
            Set<Employe> employes = affectations.keySet();
            for (Employe e : employes) {
                System.out.println(e);
            }
        }
    }

    public void afficherDepartements() {
        System.out.println("\n=== Liste des départements ===");
        if (affectations.isEmpty()) {
            System.out.println("Aucun département.");
        } else {
            Collection<Departement> departements = affectations.values();
            Set<Departement> uniqueDepartements = new HashSet<>(departements);
            for (Departement d : uniqueDepartements) {
                System.out.println(d);
            }
        }
    }

    public boolean rechercherEmploye(Employe e) {
        return affectations.containsKey(e);
    }

    public boolean rechercherDepartement(Departement d) {
        return affectations.containsValue(d);
    }

    public TreeMap<Employe, Departement> trierMap() {
        TreeMap<Employe, Departement> sortedMap = new TreeMap<>(affectations);
        System.out.println("\n=== Map triée par identifiant d'employé ===");
        for (Map.Entry<Employe, Departement> entry : sortedMap.entrySet()) {
            System.out.println("Employé ID: " + entry.getKey().getIdentifiant() +
                    " - " + entry.getKey().getNom() + " " + entry.getKey().getPrenom() +
                    " -> Département: " + entry.getValue().getNomDepartement());
        }
        return sortedMap;
    }
}