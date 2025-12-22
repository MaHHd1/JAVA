package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {
    public static void main(String[] args) {

        System.out.println("=== INSTRUCTION 21 : Création avec constructeurs par défaut ===");
        Aquatic aquatic1 = new Aquatic();
        Terrestrial terrestrial1 = new Terrestrial();
        Dolphin dolphin1 = new Dolphin();
        Penguin penguin1 = new Penguin();

        System.out.println("Objets créés avec constructeurs par défaut.");

        System.out.println("\n=== INSTRUCTION 22 : Création avec constructeurs paramétrés ===");
        Aquatic aquatic2 = new Aquatic("Fish", "Nemo", 2, false, "Ocean");
        Terrestrial terrestrial2 = new Terrestrial("Felidae", "Lion", 5, true, 4);
        Dolphin dolphin2 = new Dolphin("Delphinidae", "Flipper", 8, true, "Sea", 45.5f);
        Penguin penguin2 = new Penguin("Spheniscidae", "Pingu", 3, false, "Antarctica", 150.0f);

        System.out.println("Objets créés avec constructeurs paramétrés.");

        System.out.println("\n=== INSTRUCTION 23 : Affichage avec toString() ===");
        System.out.println(aquatic2);
        System.out.println(terrestrial2);
        System.out.println(dolphin2);
        System.out.println(penguin2);

        System.out.println("\n=== INSTRUCTION 24 : Test de la méthode swim() ===");
        System.out.print("Aquatic : ");
        aquatic2.swim();

        System.out.print("Dolphin : ");
        dolphin2.swim();

        System.out.print("Penguin : ");
        penguin2.swim();

        System.out.println("\n*** REMARQUE INSTRUCTION 24 ***");
        System.out.println("- Aquatic affiche : 'This aquatic animal is swimming.'");
        System.out.println("- Dolphin affiche : 'This dolphin is swimming.' (méthode redéfinie)");
        System.out.println("- Penguin affiche : 'This aquatic animal is swimming.' (hérite de Aquatic)");
        System.out.println("Le polymorphisme permet à Dolphin d'avoir son propre comportement !");

        System.out.println("\n=== Test du Zoo avec les nouveaux types d'animaux ===");
        Zoo myZoo = new Zoo("Belvedere Zoo", "Tunis");

        myZoo.addAnimal(dolphin2);
        myZoo.addAnimal(penguin2);
        myZoo.addAnimal(terrestrial2);
        myZoo.addAnimal(aquatic2);

        myZoo.displayAnimals();
    }
}