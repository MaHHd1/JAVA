
public class Main {
    public static void main(String[] args) {
        Zoo myZoo = new Zoo("Belvedere Zoo", "Tunis");

        System.out.println("=== Test Instruction 10 & 11 ===");

        Animal lion = new Animal("Felidae", "Simba", 5, true);
        Animal elephant = new Animal("Elephantidae", "Dumbo", 10, true);
        Animal tiger = new Animal("Felidae", "Rajah", 7, true);
        Animal giraffe = new Animal("Giraffidae", "Melman", 6, true);

        myZoo.addAnimal(lion);
        myZoo.addAnimal(elephant);
        myZoo.addAnimal(tiger);
        myZoo.addAnimal(giraffe);

        myZoo.displayAnimals();

        System.out.println("\n=== Test Instruction 11 : Recherche ===");
        int index = myZoo.searchAnimal("Simba");
        System.out.println("Index de Simba : " + index);

        Animal lion2 = new Animal("Felidae", "Simba", 5, true);
        System.out.println("Tentative d'ajout d'un animal identique :");
        myZoo.addAnimal(lion2);

        System.out.println("\n=== Test Instruction 13 : Suppression ===");
        myZoo.removeAnimal(tiger);
        myZoo.displayAnimals();

        System.out.println("\n=== Test Instruction 15 : Zoo plein ===");
        System.out.println("Le zoo est-il plein ? " + myZoo.isZooFull());

        System.out.println("\nAjout de plusieurs animaux...");
        for (int i = 0; i < 23; i++) {
            myZoo.addAnimal(new Animal("Species" + i, "Animal" + i, i, true));
        }

        System.out.println("Le zoo est-il plein maintenant ? " + myZoo.isZooFull());
        myZoo.displayAnimals();

        System.out.println("\n=== Test Instruction 15 : Comparaison de zoos ===");
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