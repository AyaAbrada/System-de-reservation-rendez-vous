package com.RendezVous.servlet.dao;
import com.RendezVous.servlet.model.Patient;
import java.util.ArrayList;
import java.util.*;
import java.sql.*;

public class PatientDAO {
    public List<Patient> getToutPatient() {
        List<Patient> patients = new ArrayList<>();
        String query = "SELECT * FROM patient";

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rendervous","root","");
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)){

            while (rs.next()) {
                Patient patient = new Patient(
                        rs.getInt("id_patient"),
                        rs.getString("username"),
                        rs.getString("email"),
                        rs.getInt("talaphone"),
                        rs.getString("motif")
                );
                patient.setId(rs.getInt("id"));
                patient.setUsername(rs.getString("username"));
                patient.setEmail(rs.getString("email"));
                patient.setTelephone(rs.getInt("telephone"));
                patient.setTelephone(rs.getInt("motif"));
                patients.add(patient);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return patients;
    }
    public void addPatient(Patient patient) {
        String query = "INSERT INTO patient(id_patient , username , email , telephone , motif  VALUES(? , ? , ? , ? , ?)";

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rendervous","root","");
             PreparedStatement ps = conn.prepareStatement(query)) {

            ps.setInt(1, patient.getId());
            ps.setString(2, patient.getUsername());
            ps.setString(3, patient.getEmail());
            ps.setInt(4, patient.getTelephone());
            ps.setString(5, patient.getMotif());

            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


