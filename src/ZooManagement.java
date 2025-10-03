import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {
        int nbrCages = 20;
        String zooName = "My Zoo";

        Scanner myObj = new Scanner(System.in);

        System.out.print("Give me zoo name: ");
        zooName = myObj.nextLine();

        System.out.print("Give me number of cages: ");
        nbrCages = myObj.nextInt();

        System.out.println("Zoo Name: " + zooName);
        System.out.println("Number of Cages: " + nbrCages);


    }
}
