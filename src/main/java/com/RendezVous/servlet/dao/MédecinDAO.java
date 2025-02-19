package com.RendezVous.servlet.dao;
import com.RendezVous.servlet.model.Medecin;
import java.util.ArrayList;
import java.util.*;
import java.sql.*;

public class MédecinDAO {
    public List<Medecin> getToutMedecin() {
        List<Medecin> medecins = new ArrayList<>();
        String query = "SELECT * FROM medecin";

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rendervous","root","");
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)){

            while (rs.next()) {
                Medecin medecin = new Medecin(
                        rs.getInt("id_medecin"),
                        rs.getString("nom")
                );
                medecin.setId(rs.getInt("id"));
                medecins.add(medecin);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return medecins;
    }
    public void addMedecin(Medecin medecin) {
        String query = "INSERT INTO medecin(id_medecin , nom VALUES(? , ?)";

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rendervous","root","");
             PreparedStatement ps = conn.prepareStatement(query)) {

            ps.setInt(1, medecin.getId());
            ps.setString(2, medecin.getNom());

            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    }

