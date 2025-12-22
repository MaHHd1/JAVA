package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {
    public static void main(String[] args) {

        System.out.println("=== INSTRUCTION 38 : Test des interfaces ===\n");

        try {
            Dolphin dolphin = new Dolphin("Delphinidae", "Flipper", 8, true, "Sea", 45.5f);
            Penguin penguin = new Penguin("Spheniscidae", "Pingu", 3, false, "Antarctica", 150.0f);
            Terrestrial terrestrial = new Terrestrial("Ursidae", "Bear", 5, true, 4);

            System.out.println("--- Test Dolphin (Carnivore) ---");
            System.out.println(dolphin);
            dolphin.eatMeat(Food.MEAT);
            dolphin.eatMeat(Food.PLANT);
            dolphin.swim();

            System.out.println("\n--- Test Penguin (Carnivore) ---");
            System.out.println(penguin);
            penguin.eatMeat(Food.MEAT);
            penguin.eatMeat(Food.BOTH);
            penguin.swim();

            System.out.println("\n--- Test Terrestrial (Omnivore) ---");
            System.out.println(terrestrial);
            terrestrial.eatMeat(Food.MEAT);
            terrestrial.eatPlant(Food.PLANT);
            terrestrial.eatPlantAndMeat(Food.BOTH);
            terrestrial.eatMeat(Food.PLANT);
            terrestrial.eatPlant(Food.MEAT);

            System.out.println("\n=== Test dans un Zoo ===");
            Zoo myZoo = new Zoo("Belvedere Zoo", "Tunis");

            myZoo.addAquaticAnimal(dolphin);
            myZoo.addAquaticAnimal(penguin);
            myZoo.addAnimal(terrestrial);

            myZoo.displayAquaticAnimals();
            myZoo.displayAnimals();

            System.out.println("\n--- Test swim() pour tous les aquatiques ---");
            myZoo.swimAllAquatics();

            System.out.println("\n--- Test feeding aquatic animals ---");
            System.out.println("Feeding aquatic animals with MEAT:");
            for (int i = 0; i < 2; i++) {
                if (i == 0) {
                    dolphin.eatMeat(Food.MEAT);
                } else {
                    penguin.eatMeat(Food.MEAT);
                }
            }

            System.out.println("\n--- Test feeding terrestrial animal ---");
            System.out.println("Feeding terrestrial animal with different foods:");
            terrestrial.eatMeat(Food.MEAT);
            terrestrial.eatPlant(Food.PLANT);
            terrestrial.eatPlantAndMeat(Food.BOTH);

        } catch (InvalidAgeException e) {
            System.out.println("Exception attrapée : " + e.getMessage());
        } catch (ZooFullException e) {
            System.out.println("Exception attrapée : " + e.getMessage());
        }

        System.out.println("\n=== Fin des tests ===");
    }
}