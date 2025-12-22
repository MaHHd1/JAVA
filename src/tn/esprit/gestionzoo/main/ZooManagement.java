package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {
    public static void main(String[] args) {

        Zoo myZoo = new Zoo("Belvedere Zoo", "Tunis");

        System.out.println("=== Test avec nombre de cages réduit à 3 ===\n");

        try {
            Animal lion = new Animal("Felidae", "Simba", 5, true);
            myZoo.addAnimal(lion);
            System.out.println("Nombre d'animaux dans le zoo : " + myZoo.getNbrAnimals());

            Animal elephant = new Animal("Elephantidae", "Dumbo", 10, true);
            myZoo.addAnimal(elephant);
            System.out.println("Nombre d'animaux dans le zoo : " + myZoo.getNbrAnimals());

            Animal tiger = new Animal("Felidae", "Rajah", 7, true);
            myZoo.addAnimal(tiger);
            System.out.println("Nombre d'animaux dans le zoo : " + myZoo.getNbrAnimals());

            System.out.println("\nTentative d'ajout d'un 4ème animal (zoo plein)...");
            Animal giraffe = new Animal("Giraffidae", "Melman", 6, true);
            myZoo.addAnimal(giraffe);
            System.out.println("Nombre d'animaux dans le zoo : " + myZoo.getNbrAnimals());

        } catch (ZooFullException e) {
            System.out.println("Exception attrapée : " + e.getMessage());
            System.out.println("Nombre d'animaux dans le zoo : " + myZoo.getNbrAnimals());
        } catch (InvalidAgeException e) {
            System.out.println("Exception attrapée : " + e.getMessage());
        }

        myZoo.displayAnimals();

        System.out.println("\n=== Test InvalidAgeException ===\n");

        try {
            System.out.println("Tentative de création d'un animal avec âge négatif...");
            Animal invalidAnimal = new Animal("Canidae", "Wolf", -5, true);
            myZoo.addAnimal(invalidAnimal);
            System.out.println("Nombre d'animaux dans le zoo : " + myZoo.getNbrAnimals());
        } catch (InvalidAgeException e) {
            System.out.println("Exception attrapée : " + e.getMessage());
            System.out.println("L'animal n'a pas été ajouté.");
            System.out.println("Nombre d'animaux dans le zoo : " + myZoo.getNbrAnimals());
        } catch (ZooFullException e) {
            System.out.println("Exception attrapée : " + e.getMessage());
        }

        System.out.println("\n=== Test avec animaux aquatiques ===\n");

        try {
            Dolphin dolphin1 = new Dolphin("Delphinidae", "Flipper", 8, true, "Sea", 45.5f);
            myZoo.addAquaticAnimal(dolphin1);

            Penguin penguin1 = new Penguin("Spheniscidae", "Pingu", 3, false, "Antarctica", 150.0f);
            myZoo.addAquaticAnimal(penguin1);

            System.out.println("\nTentative de création d'un pingouin avec âge négatif...");
            Penguin invalidPenguin = new Penguin("Spheniscidae", "BadPenguin", -2, false, "Antarctica", 100.0f);
            myZoo.addAquaticAnimal(invalidPenguin);

        } catch (InvalidAgeException e) {
            System.out.println("Exception attrapée : " + e.getMessage());
            System.out.println("Le pingouin n'a pas été créé.");
        }

        myZoo.displayAquaticAnimals();
        myZoo.swimAllAquatics();

        System.out.println("\n=== Fin des tests ===");
    }
}