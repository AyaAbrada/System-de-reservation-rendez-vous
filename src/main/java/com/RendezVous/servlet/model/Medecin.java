package com.RendezVous.servlet.model;

public class Medecin {
    int id;
    String nom;

    public Medecin(){}

    public Medecin(int id, String nom){
        this.id = id;
        this.nom = nom;
    }

    public int getId(){return this.id; }
    public void setId(int id){this.id = id; }

    public String getNom(){return this.nom; }
    public void setNom(String nom){this.nom = nom; }
}
