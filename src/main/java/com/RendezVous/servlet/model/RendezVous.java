package com.RendezVous.servlet.model;
import java.util.Date;

import java.util.Date;

public class RendezVous {
    int id;
    String statut;
    String motif;
    Date date;

    public RendezVous(){}
    public RendezVous(int id, String motif, String statut, Date date){
        this.id = id;
        this.statut = statut;
        this.motif = motif;
        this.date = date;
    }
    public int getId() { return this.id; }
    public void setId( int id ) { this.id = id; }

    public String getStatut() { return this.statut; }
    public void setStatut( String statut ) { this.statut = statut; }

    public String getMotif() { return this.motif; }
    public void setMotif( String motif ) { this.motif = motif; }

    public Date getDate() { return this.date; }
    public void setDate( Date date ) { this.date = date; }
}
