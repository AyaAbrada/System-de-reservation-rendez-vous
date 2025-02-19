package com.RendezVous.servlet.dao;

import com.RendezVous.servlet.model.RendezVous;
import java.util.Date;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RendezVousDAO {

    public List<RendezVous> getToutRendezVous() {
        List<RendezVous> rendezVouss = new ArrayList<>();
        String query = "SELECT * FROM rendezvous";

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rendervous","root","");
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)){

            while (rs.next()) {
                RendezVous rendezVous = new RendezVous(
                        rs.getInt("id"),
                        rs.getInt("id_medecin"),
                        rs.getInt("id_patient"),
                        rs.getString("statut"),
                        rs.getDate("date")

                        );
                rendezVous .setId(rs.getInt("id"));
                rendezVous .setId_medecin(rs.getInt("id_medecin"));
                rendezVous .setId_patient(rs.getInt("id_patient"));
                rendezVous .setStatut(rs.getString("statut"));
                rendezVous .setDate(rs.getDate("date"));
                rendezVouss.add(rendezVous);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return rendezVouss;
    }
    public void addRendezVous(RendezVous rendezvous) {
        String query = "INSERT INTO rendezvous(id, id_medecin , id_patient , date , statut VALUES(? , ? , ? , ? , ?)";

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rendervous","root","");
             PreparedStatement ps = conn.prepareStatement(query)) {

            ps.setInt(1, rendezvous.getId());
            ps.setInt(2, rendezvous.getId_medecin());
            ps.setInt(3, rendezvous.getId_patient());
            ps.setString(4, rendezvous.getStatut());
            ps.setDate(5, rendezvous.getDate());


            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


