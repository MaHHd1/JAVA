package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;

public class ZooManagement {
    public static void main(String[] args) {
        // Test Instruction 18: Validation des données
        System.out.println("=== Test de validation (Instruction 18) ===");

        // Test âge négatif
        Animal invalidAnimal = new Animal("Felidae", "TestAnimal", -5, true);
        System.out.println("Animal avec âge négatif : " + invalidAnimal);

        // Test nom de zoo vide
        Zoo invalidZoo = new Zoo("", "Tunis");
        System.out.println("Zoo avec nom vide : " + invalidZoo);

        System.out.println("\n=== Test normal (Instructions 10-17) ===");

        // Créer un zoo valide
        Zoo myZoo = new Zoo("Belvedere Zoo", "Tunis");

        // Créer des animaux
        Animal lion = new Animal("Felidae", "Simba", 5, true);
        Animal elephant = new Animal("Elephantidae", "Dumbo", 10, true);
        Animal tiger = new Animal("Felidae", "Rajah", 7, true);
        Animal giraffe = new Animal("Giraffidae", "Melman", 6, true);

        // Ajouter des animaux (utilise isZooFull() - Instruction 17)
        myZoo.addAnimal(lion);
        myZoo.addAnimal(elephant);
        myZoo.addAnimal(tiger);
        myZoo.addAnimal(giraffe);

        // Afficher les animaux
        myZoo.displayAnimals();

        System.out.println("\n=== Test Recherche ===");
        int index = myZoo.searchAnimal("Simba");
        System.out.println("Index de Simba : " + index);

        // Tentative d'ajout d'un animal identique
        Animal lion2 = new Animal("Felidae", "Simba", 5, true);
        System.out.println("\nTentative d'ajout d'un animal identique :");
        myZoo.addAnimal(lion2);

        System.out.println("\n=== Test Suppression ===");
        myZoo.removeAnimal(tiger);
        myZoo.displayAnimals();

        System.out.println("\n=== Test Zoo plein ===");
        System.out.println("Le zoo est-il plein ? " + myZoo.isZooFull());

        // Remplir le zoo
        System.out.println("\nAjout de plusieurs animaux...");
        for (int i = 0; i < 23; i++) {
            myZoo.addAnimal(new Animal("Species" + i, "Animal" + i, i, true));
        }

        System.out.println("Le zoo est-il plein maintenant ? " + myZoo.isZooFull());

        // Tentative d'ajout quand le zoo est plein
        System.out.println("\nTentative d'ajout d'un animal quand le zoo est plein :");
        myZoo.addAnimal(new Animal("Canidae", "Wolf", 4, true));

        System.out.println("\n=== Test Comparaison de zoos ===");
        Zoo anotherZoo = new Zoo("Friguia Zoo", "Sousse");
        anotherZoo.addAnimal(new Animal("Canidae", "Wolf", 4, true));
        anotherZoo.addAnimal(new Animal("Ursidae", "Bear", 8, true));

        System.out.println("\nZoo 1 : " + myZoo);
        System.out.println("Zoo 2 : " + anotherZoo);

        Zoo biggerZoo = Zoo.comparerZoo(myZoo, anotherZoo);
        System.out.println("\nLe zoo avec le plus d'animaux est : " + biggerZoo.getName() +
                " avec " + biggerZoo.getNbrAnimals() + " animaux");
    }
}
