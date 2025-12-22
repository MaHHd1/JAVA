package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {
    public static void main(String[] args) {

        Zoo myZoo = new Zoo("Belvedere Zoo", "Tunis");

        System.out.println("=== INSTRUCTION 26 : Ajout d'animaux aquatiques ===");

        Dolphin dolphin1 = new Dolphin("Delphinidae", "Flipper", 8, true, "Sea", 45.5f);
        Dolphin dolphin2 = new Dolphin("Delphinidae", "Dolly", 6, true, "Ocean", 50.0f);
        Penguin penguin1 = new Penguin("Spheniscidae", "Pingu", 3, false, "Antarctica", 150.0f);
        Penguin penguin2 = new Penguin("Spheniscidae", "Rico", 5, false, "Antarctica", 200.0f);
        Penguin penguin3 = new Penguin("Spheniscidae", "Skipper", 7, false, "Antarctica", 180.0f);

        myZoo.addAquaticAnimal(dolphin1);
        myZoo.addAquaticAnimal(dolphin2);
        myZoo.addAquaticAnimal(penguin1);
        myZoo.addAquaticAnimal(penguin2);
        myZoo.addAquaticAnimal(penguin3);

        myZoo.displayAquaticAnimals();

        System.out.println("\n=== INSTRUCTION 27 : swim() pour tous les animaux aquatiques ===");
        myZoo.swimAllAquatics();

        System.out.println("\n*** REMARQUE INSTRUCTION 27 ***");
        System.out.println("Chaque animal aquatique affiche son propre message :");
        System.out.println("- Les dauphins affichent : 'This dolphin is swimming.'");
        System.out.println("- Les pingouins affichent : 'This penguin is swimming.'");
        System.out.println("Le polymorphisme permet à chaque classe d'avoir son comportement spécifique !");

        System.out.println("\n=== INSTRUCTION 29 : Profondeur maximale des pingouins ===");
        float maxDepth = myZoo.maxPenguinSwimmingDepth();
        System.out.println("La profondeur maximale des pingouins est : " + maxDepth + " mètres");

        System.out.println("\n=== INSTRUCTION 30 : Nombre d'animaux aquatiques par type ===");
        myZoo.displayNumberOfAquaticsByType();

        System.out.println("\n=== INSTRUCTION 31 : Test de equals() ===");
        Aquatic aquatic1 = new Dolphin("Delphinidae", "TestDolphin", 5, true, "Ocean", 40.0f);
        Aquatic aquatic2 = new Dolphin("Delphinidae", "TestDolphin", 5, true, "Ocean", 50.0f);
        Aquatic aquatic3 = new Dolphin("Delphinidae", "TestDolphin", 6, true, "Ocean", 40.0f);
        Aquatic aquatic4 = new Penguin("Spheniscidae", "TestDolphin", 5, false, "Ocean", 100.0f);

        System.out.println("aquatic1.equals(aquatic2) : " + aquatic1.equals(aquatic2));
        System.out.println("(même nom, même âge, même habitat, vitesse différente)");

        System.out.println("\naquatic1.equals(aquatic3) : " + aquatic1.equals(aquatic3));
        System.out.println("(même nom, âge différent, même habitat)");

        System.out.println("\naquatic1.equals(aquatic4) : " + aquatic1.equals(aquatic4));
        System.out.println("(même nom, même âge, même habitat, mais types différents)");
    }
}