package com.RendezVous.servlet.model;
import java.util.Date;

public class RendezVous {
    int id;
    int id_medecin;
    int id_patient;
    String statut;
    Date date;

    public RendezVous(){}

    public RendezVous(int id, int id_patient , int id_medecin, String statut, Date date){
        this.id = id;
        this.id_patient = id_patient;
        this.id_medecin = id_medecin;
        this.statut = statut;
        this.date = date;
    }
    public int getId() { return this.id; }
    public void setId( int id ) { this.id = id; }

    public int getId_patient() { return this.id_patient; }
    public void setId_patient( int id_patient ) { this.id_patient = id_patient; }

    public int getId_medecin() { return this.id_medecin; }
    public void setId_medecin( int id_medecin ) { this.id_medecin = id_medecin; }


    public String getStatut() { return this.statut; }
    public void setStatut( String statut ) { this.statut = statut; }

    public java.sql.Date getDate() { return (java.sql.Date) this.date; }
    public void setDate( Date date ) { this.date = date; }
}
