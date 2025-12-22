package tn.esprit.gestionzoo.entities;

import java.util.Objects;

public class Departement {
    private int id;
    private String nomDepartement;
    private int nbrEmployes;

    public Departement() {
    }

    public Departement(int id, String nomDepartement, int nbrEmployes) {
        this.id = id;
        this.nomDepartement = nomDepartement;
        this.nbrEmployes = nbrEmployes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomDepartement() {
        return nomDepartement;
    }

    public void setNomDepartement(String nomDepartement) {
        this.nomDepartement = nomDepartement;
    }

    public int getNbrEmployes() {
        return nbrEmployes;
    }

    public void setNbrEmployes(int nbrEmployes) {
        this.nbrEmployes = nbrEmployes;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Departement that = (Departement) obj;
        return id == that.id && nomDepartement.equals(that.nomDepartement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nomDepartement);
    }

    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nomDepartement='" + nomDepartement + '\'' +
                ", nbrEmployes=" + nbrEmployes +
                '}';
    }
}
