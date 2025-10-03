import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Give me zoo name: ");
        String zooName = myObj.nextLine();
        System.out.print("Give me zoo city: ");
        String zooCity = myObj.nextLine();
        System.out.print("Give me number of cages: ");
        int nbrCages = myObj.nextInt();

        myObj.nextLine();
        Zoo myZoo = new Zoo(zooName, zooCity, nbrCages);
        Animal lion = new Animal("Félins", "Lion", 5, true);
        Animal elephant = new Animal("Éléphantidés", "Éléphant", 10, true);
        Animal crocodile = new Animal("Reptiles", "Crocodile", 3, false);
        Animal giraffe = new Animal("Giraffidés", "Girafe", 7, true);
        System.out.println("\n avec displayZoo()");
        myZoo.displayZoo();


        System.out.println("\n toString()");
        System.out.println(": " + myZoo);
        System.out.println(": " + myZoo.toString());


        System.out.println("\n animaux");
        System.out.println("Lion: " + lion);
        System.out.println("Éléphant: " + elephant);
        System.out.println("Crocodile: " + crocodile);
        System.out.println("Girafe: " + giraffe);

        System.out.println("\n après toString()");
        System.out.println("Zoo: " + myZoo);
        System.out.println("Lion: " + lion.toString());


        System.out.println("\n ancienne vs nouvelle");
        System.out.println("sans constructeur:");
        Animal oldWayAnimal = new Animal();
        oldWayAnimal.family = "Oiseaux";
        oldWayAnimal.name = "Aigle";
        oldWayAnimal.age = 2;
        oldWayAnimal.isMammal = false;
        System.out.println("Animal créé: " + oldWayAnimal);

        System.out.println("avec constructeur:");
        Animal newWayAnimal = new Animal("Oiseaux", "Aigle", 2, false);
        System.out.println("Animal créé: " + newWayAnimal);

        myObj.close();
    }
}