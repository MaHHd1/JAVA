class Animal {
    private String family;
    private String name;
    private int age;
    private boolean isMammal;

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    public String getFamily() {
        return family;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isMammal() {
        return isMammal;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }
}

class Zoo {
    private static final int NBR_CAGES = 25; // Instruction 14: Constante
    private Animal[] animals;
    private String name;
    private String city;
    private int nbrAnimals; // Compteur d'animaux

    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        this.animals = new Animal[NBR_CAGES];
        this.nbrAnimals = 0;
    }

    public boolean addAnimal(Animal animal) {
        // Instruction 12: Vérifier si le zoo est plein
        if (nbrAnimals >= NBR_CAGES) {
            System.out.println("Le zoo est plein !");
            return false;
        }

        if (searchAnimal(animal.getName()) != -1) {
            System.out.println("L'animal " + animal.getName() + " existe déjà dans le zoo !");
            return false;
        }

        animals[nbrAnimals] = animal;
        nbrAnimals++;
        System.out.println("Animal " + animal.getName() + " ajouté avec succès !");
        return true;
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