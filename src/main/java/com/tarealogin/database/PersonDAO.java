package com.tarealogin.database;

import com.tarealogin.model.PersonEntity;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonDAO extends DatabaseConnection{

    PersonEntity person = new PersonEntity();

    public PersonEntity getFullnameById(int person_id) throws SQLException {

        String sql = "SELECT * FROM person WHERE id = ?";

        try {
            PreparedStatement ps = getConnection().prepareStatement(sql);
            ps.setInt(1, person_id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                person.setId(rs.getInt("id"));
                person.setName(rs.getString("name"));
                person.setLast_name(rs.getString("last_name"));
                person.setGender(rs.getString("gender"));
                person.setDni(rs.getInt("dni"));
                person.setPhone(rs.getInt("phone"));
                person.setLandlaine(rs.getString("landline"));
                person.setEmail(rs.getString("email"));
                person.setCreation_date(rs.getTimestamp("creation_date"));
                person.setLast_update(person.getLast_update());
                person.setActive(rs.getBoolean("active"));
                return person;
            } else {
                return null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        } finally {
            this.closeConnection();
        }

    }

}
