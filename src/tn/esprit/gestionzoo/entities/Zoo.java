package tn.esprit.gestionzoo.entities;

public class Zoo {
    private static final int NBR_CAGES = 3;
    private static final int NBR_AQUATIC_CAGES = 10;
    private Animal[] animals;
    private Aquatic[] aquaticAnimals;
    private String name;
    private String city;
    private int nbrAnimals;
    private int nbrAquaticAnimals;

    public Zoo(String name, String city) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Erreur : Le nom du zoo ne peut pas être vide. Nom par défaut attribué.");
            this.name = "Zoo Sans Nom";
        } else {
            this.name = name;
        }
        this.city = city;
        this.animals = new Animal[NBR_CAGES];
        this.aquaticAnimals = new Aquatic[NBR_AQUATIC_CAGES];
        this.nbrAnimals = 0;
        this.nbrAquaticAnimals = 0;
    }

    public void addAnimal(Animal animal) throws ZooFullException {
        if (nbrAnimals >= NBR_CAGES) {
            throw new ZooFullException("Le zoo est plein ! Impossible d'ajouter " + animal.getName());
        }

        if (searchAnimal(animal.getName()) != -1) {
            System.out.println("L'animal " + animal.getName() + " existe déjà dans le zoo !");
            return;
        }

        animals[nbrAnimals] = animal;
        nbrAnimals++;
        System.out.println("Animal " + animal.getName() + " ajouté avec succès !");
    }

    public void addAquaticAnimal(Aquatic aquatic) {
        if (nbrAquaticAnimals >= NBR_AQUATIC_CAGES) {
            System.out.println("Le tableau d'animaux aquatiques est plein !");
            return;
        }

        aquaticAnimals[nbrAquaticAnimals] = aquatic;
        nbrAquaticAnimals++;
        System.out.println("Animal aquatique " + aquatic.getName() + " ajouté avec succès !");
    }

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

    public void displayAquaticAnimals() {
        System.out.println("\n=== Animaux aquatiques du zoo " + name + " ===");
        if (nbrAquaticAnimals == 0) {
            System.out.println("Aucun animal aquatique dans le zoo.");
        } else {
            for (int i = 0; i < nbrAquaticAnimals; i++) {
                System.out.println((i + 1) + ". " + aquaticAnimals[i]);
            }
        }
        System.out.println("Nombre total d'animaux aquatiques : " + nbrAquaticAnimals + "/" + NBR_AQUATIC_CAGES);
    }

    public void swimAllAquatics() {
        System.out.println("\n=== Tous les animaux aquatiques nagent ===");
        for (int i = 0; i < nbrAquaticAnimals; i++) {
            System.out.print(aquaticAnimals[i].getName() + " : ");
            aquaticAnimals[i].swim();
        }
    }

    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0;
        for (int i = 0; i < nbrAquaticAnimals; i++) {
            if (aquaticAnimals[i] instanceof Penguin) {
                Penguin penguin = (Penguin) aquaticAnimals[i];
                if (penguin.getSwimmingDepth() > maxDepth) {
                    maxDepth = penguin.getSwimmingDepth();
                }
            }
        }
        return maxDepth;
    }

    public void displayNumberOfAquaticsByType() {
        int nbrDolphins = 0;
        int nbrPenguins = 0;

        for (int i = 0; i < nbrAquaticAnimals; i++) {
            if (aquaticAnimals[i] instanceof Dolphin) {
                nbrDolphins++;
            } else if (aquaticAnimals[i] instanceof Penguin) {
                nbrPenguins++;
            }
        }

        System.out.println("\n=== Statistiques des animaux aquatiques ===");
        System.out.println("Nombre de dauphins : " + nbrDolphins);
        System.out.println("Nombre de pingouins : " + nbrPenguins);
    }

    public int searchAnimal(String name) {
        for (int i = 0; i < nbrAnimals; i++) {
            if (animals[i].getName().equalsIgnoreCase(name)) {
                return i;
            }
        }
        return -1;
    }

    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal.getName());

        if (index == -1) {
            System.out.println("Animal " + animal.getName() + " non trouvé !");
            return false;
        }

        for (int i = index; i < nbrAnimals - 1; i++) {
            animals[i] = animals[i + 1];
        }

        animals[nbrAnimals - 1] = null;
        nbrAnimals--;
        System.out.println("Animal " + animal.getName() + " supprimé avec succès !");
        return true;
    }

    public boolean isZooFull() {
        return nbrAnimals >= NBR_CAGES;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals > z2.nbrAnimals) {
            return z1;
        } else {
            return z2;
        }
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getNbrAnimals() {
        return nbrAnimals;
    }

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