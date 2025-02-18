package com.RendezVous.servlet.model;

public class Patient {
    int id;
    String username;
    String email;
    int telephone;
    String motif;

    public Patient(){}
    public Patient(int id, String username, String email, int telephone, String motif){
        this.id = id;
        this.username = username;
        this.email = email;
        this.telephone = telephone;
        this.motif = motif;
    }
    public int getId() { return this.id; }
    public void setId( int id ) { this.id = id; }

    public String getUsername() { return this.username; }
    public void setUsername( String username ) { this.username = username; }

    public String getEmail() { return this.email; }
    public void setEmail( String email ) { this.email = email; }

    public int getTelephone() { return this.telephone; }
    public void setTelephone( int telephone ) { this.telephone = telephone; }

    public String getMotif() { return this.motif; }
    public void setMotif( String motif ) { this.motif = motif; }
}

