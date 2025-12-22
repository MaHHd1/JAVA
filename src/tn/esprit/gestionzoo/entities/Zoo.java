package tn.esprit.gestionzoo.entities;

public class Zoo {
    private static final int NBR_CAGES = 25;
    private Animal[] animals;
    private String name;
    private String city;
    private int nbrAnimals;

    // Constructor avec validation
    public Zoo(String name, String city) {
        // Instruction 18: Le nom d'un Zoo ne doit pas être vide
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Erreur : Le nom du zoo ne peut pas être vide. Nom par défaut attribué.");
            this.name = "Zoo Sans Nom";
        } else {
            this.name = name;
        }
        this.city = city;
        this.animals = new Animal[NBR_CAGES];
        this.nbrAnimals = 0;
    }

    // Instruction 17: Modifier addAnimal pour inclure isZooFull()
    public boolean addAnimal(Animal animal) {
        // Vérifier si le zoo est plein avec la méthode isZooFull()
        if (isZooFull()) {
            System.out.println("Le zoo est plein !");
            return false;
        }

        // Vérifier l'unicité de l'animal
        if (searchAnimal(animal.getName()) != -1) {
            System.out.println("L'animal " + animal.getName() + " existe déjà dans le zoo !");
            return false;
        }

        animals[nbrAnimals] = animal;
        nbrAnimals++;
        System.out.println("Animal " + animal.getName() + " ajouté avec succès !");
        return true;
    }

    // Afficher tous les animaux
    public void displayAnimals() {
        System.out.println("\n=== Animaux du zoo " + name + " ===");
        if (nbrAnimals == 0) {
            System.out.println("Aucun animal dans le zoo.");
        } else {
            for (int i = 0; i < nbrAnimals; i++) {
                System.out.println((i + 1) + ". " + animals[i]);
            }
        }
        System.out.println("Nombre total d'animaux : " + nbrAnimals + "/" + NBR_CAGES);
    }

    // Rechercher un animal par nom
    public int searchAnimal(String name) {
        for (int i = 0; i < nbrAnimals; i++) {
            if (animals[i].getName().equalsIgnoreCase(name)) {
                return i;
            }
        }
        return -1;
    }

    // Supprimer un animal
    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal.getName());

        if (index == -1) {
            System.out.println("Animal " + animal.getName() + " non trouvé !");
            return false;
        }

        // Réorganiser le tableau
        for (int i = index; i < nbrAnimals - 1; i++) {
            animals[i] = animals[i + 1];
        }

        animals[nbrAnimals - 1] = null;
        nbrAnimals--;
        System.out.println("Animal " + animal.getName() + " supprimé avec succès !");
        return true;
    }

    // Vérifier si le zoo est plein
    public boolean isZooFull() {
        return nbrAnimals >= NBR_CAGES;
    }

    // Comparer deux zoos
    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals > z2.nbrAnimals) {
            return z1;
        } else {
            return z2;
        }
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getNbrAnimals() {
        return nbrAnimals;
    }

    // Setter avec validation pour le nom
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Erreur : Le nom du zoo ne peut pas être vide.");
        }
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrAnimals=" + nbrAnimals +
                "/" + NBR_CAGES +
                '}';
    }
}