package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class Main {
    public static void main(String[] args) {

        AffectationHashMap affectationMap = new AffectationHashMap();

        Employe emp1 = new Employe(3, "Dupont", "Jean", "IT", 5);
        Employe emp2 = new Employe(1, "Martin", "Sophie", "RH", 4);
        Employe emp3 = new Employe(5, "Bernard", "Luc", "Finance", 6);
        Employe emp4 = new Employe(2, "Dubois", "Marie", "Marketing", 3);

        Departement dept1 = new Departement(101, "IT", 10);
        Departement dept2 = new Departement(102, "RH", 5);
        Departement dept3 = new Departement(103, "Finance", 8);
        Departement dept4 = new Departement(104, "Marketing", 6);

        System.out.println("=== INSTRUCTION 2 & 3 : Ajout et affichage ===");
        affectationMap.ajouterEmployeDepartement(emp1, dept1);
        affectationMap.ajouterEmployeDepartement(emp2, dept2);
        affectationMap.ajouterEmployeDepartement(emp3, dept3);
        affectationMap.ajouterEmployeDepartement(emp4, dept4);

        affectationMap.afficherEmployesEtDepartements();

        System.out.println("\n=== Test : Ajouter le même employé dans deux départements différents ===");
        System.out.println("Ajout de emp1 (Dupont) au département Marketing...");
        affectationMap.ajouterEmployeDepartement(emp1, dept4);

        affectationMap.afficherEmployesEtDepartements();
        System.out.println("\n*** REMARQUE : L'employé ne peut être affecté qu'à un seul département.");
        System.out.println("La dernière affectation remplace la précédente (HashMap n'accepte pas de clés dupliquées).");

        System.out.println("\n=== INSTRUCTION 4 : Suppression d'un employé ===");
        affectationMap.supprimerEmploye(emp2);
        affectationMap.afficherEmployesEtDepartements();

        System.out.println("\n=== INSTRUCTION 5 : Suppression d'un employé et département ===");
        affectationMap.supprimerEmployeEtDepartement(emp3, dept3);
        affectationMap.afficherEmployesEtDepartements();

        affectationMap.ajouterEmployeDepartement(emp2, dept2);
        affectationMap.ajouterEmployeDepartement(emp3, dept3);

        System.out.println("\n=== INSTRUCTION 6 : Afficher les employés ===");
        affectationMap.afficherEmployes();

        System.out.println("\n=== INSTRUCTION 7 : Afficher les départements ===");
        affectationMap.afficherDepartements();

        System.out.println("\n=== INSTRUCTION 8 : Rechercher un employé ===");
        System.out.println("Recherche emp1 (Dupont) : " + affectationMap.rechercherEmploye(emp1));
        Employe emp5 = new Employe(10, "Inconnu", "Test", "IT", 1);
        System.out.println("Recherche emp5 (Inconnu) : " + affectationMap.rechercherEmploye(emp5));

        System.out.println("\n=== INSTRUCTION 9 : Rechercher un département ===");
        System.out.println("Recherche département IT : " + affectationMap.rechercherDepartement(dept1));
        Departement dept5 = new Departement(999, "Inexistant", 0);
        System.out.println("Recherche département Inexistant : " + affectationMap.rechercherDepartement(dept5));

        System.out.println("\n=== INSTRUCTION 10 : Trier la map par identifiant ===");
        affectationMap.trierMap();

        System.out.println("\n=== Fin des tests ===");
    }
}