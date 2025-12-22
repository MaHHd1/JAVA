package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {

        StudentManagement management = new StudentManagement();

        List<Student> students = new ArrayList<>();
        students.add(new Student(3, "Alice", 20));
        students.add(new Student(1, "Bob", 22));
        students.add(new Student(5, "Charlie", 19));
        students.add(new Student(2, "David", 21));
        students.add(new Student(4, "Eve", 23));

        System.out.println("=== Test displayStudents avec Consumer ===");
        Consumer<Student> displayConsumer = student -> System.out.println(student);
        management.displayStudents(students, displayConsumer);

        System.out.println("\n=== Test displayStudents avec lambda ===");
        management.displayStudents(students, s -> System.out.println("Étudiant: " + s.getNom() + ", Age: " + s.getAge()));

        System.out.println("\n=== Test displayStudentsByFilter (age >= 21) ===");
        Predicate<Student> ageFilter = student -> student.getAge() >= 21;
        Consumer<Student> simpleDisplay = student -> System.out.println(student.getNom() + " - " + student.getAge() + " ans");
        management.displayStudentsByFilter(students, ageFilter, simpleDisplay);

        System.out.println("\n=== Test displayStudentsByFilter avec lambda (nom commence par 'C') ===");
        management.displayStudentsByFilter(students,
                s -> s.getNom().startsWith("C"),
                s -> System.out.println("Trouvé: " + s));

        System.out.println("\n=== Test returnStudentsNames ===");
        Function<Student, String> nameExtractor = student -> student.getNom();
        String allNames = management.returnStudentsNames(students, nameExtractor);
        System.out.println("Tous les noms: " + allNames);

        System.out.println("\n=== Test returnStudentsNames avec lambda (nom en majuscules) ===");
        String upperNames = management.returnStudentsNames(students, s -> s.getNom().toUpperCase());
        System.out.println("Noms en majuscules: " + upperNames);

        System.out.println("\n=== Test createStudent avec Supplier ===");
        Supplier<Student> studentSupplier = () -> new Student(6, "Frank", 24);
        Student newStudent = management.createStudent(studentSupplier);
        System.out.println("Nouveau étudiant créé: " + newStudent);

        System.out.println("\n=== Test createStudent avec lambda ===");
        Student anotherStudent = management.createStudent(() -> new Student(7, "Grace", 20));
        System.out.println("Autre étudiant créé: " + anotherStudent);

        System.out.println("\n=== Test sortStudentsById ===");
        System.out.println("Avant tri:");
        management.displayStudents(students, s -> System.out.println("ID: " + s.getId() + ", Nom: " + s.getNom()));

        Comparator<Student> idComparator = (s1, s2) -> Integer.compare(s1.getId(), s2.getId());
        management.sortStudentsById(students, idComparator);

        System.out.println("\nAprès tri par ID:");
        management.displayStudents(students, s -> System.out.println("ID: " + s.getId() + ", Nom: " + s.getNom()));

        System.out.println("\n=== Test sortStudentsById par nom ===");
        management.sortStudentsById(students, Comparator.comparing(Student::getNom));
        System.out.println("Après tri par nom:");
        management.displayStudents(students, s -> System.out.println(s.getNom()));

        System.out.println("\n=== Test convertToStream ===");
        Stream<Student> studentStream = management.convertToStream(students);
        System.out.println("Utilisation du Stream pour filtrer age > 20:");
        studentStream
                .filter(s -> s.getAge() > 20)
                .forEach(s -> System.out.println(s.getNom() + " - " + s.getAge() + " ans"));

        System.out.println("\n=== Combinaison de Stream operations ===");
        Stream<Student> stream2 = management.convertToStream(students);
        long count = stream2
                .filter(s -> s.getAge() >= 21)
                .count();
        System.out.println("Nombre d'étudiants avec age >= 21: " + count);

        System.out.println("\n=== Stream pour récupérer les noms ===");
        Stream<Student> stream3 = management.convertToStream(students);
        List<String> names = stream3
                .map(Student::getNom)
                .collect(Collectors.toList());
        System.out.println("Liste des noms: " + names);

        System.out.println("\n=== Exemples avancés avec expressions lambda ===");

        System.out.println("\n1. Afficher les étudiants majeurs (age >= 18):");
        management.displayStudentsByFilter(students,
                s -> s.getAge() >= 18,
                s -> System.out.println("  - " + s.getNom() + " (" + s.getAge() + " ans)"));

        System.out.println("\n2. Créer plusieurs étudiants avec Supplier:");
        List<Student> newStudents = new ArrayList<>();
        for (int i = 8; i <= 10; i++) {
            final int id = i;
            Student st = management.createStudent(() -> new Student(id, "Student" + id, 18 + id));
            newStudents.add(st);
            System.out.println("Créé: " + st);
        }

        System.out.println("\n3. Formater les noms avec Function:");
        String formattedNames = management.returnStudentsNames(students,
                s -> "[" + s.getId() + "] " + s.getNom().toUpperCase());
        System.out.println("Noms formatés: " + formattedNames);

        System.out.println("\n=== Fin des tests ===");
    }
}