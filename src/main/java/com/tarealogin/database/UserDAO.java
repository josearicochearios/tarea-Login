package com.tarealogin.database;

import com.tarealogin.model.UserEntity;

import java.sql.*;

public class UserDAO extends DatabaseConnection {

    UserEntity user = new UserEntity();

    public UserEntity verifyCredentials(String username, String password) throws Exception {
        String sql = "SELECT * FROM user_app WHERE username = ?";

        try {

            PreparedStatement ps = getConnection().prepareStatement(sql);
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                String dbPassword = rs.getString("PASSWORD");
                if (dbPassword.equals(password)) {
                    user.setId(rs.getInt("ID"));
                    user.setUsername(rs.getString("USERNAME"));
                    user.setPassword(rs.getString("PASSWORD"));
                    user.setRole(rs.getString("ROLE"));
                    user.setId_person(rs.getInt("ID_person"));
                    user.setCreation_date(rs.getTimestamp("CREATION_DATE"));
                    user.setLast_update(rs.getTimestamp("LAST_UPDATE"));
                    user.setActive(rs.getBoolean("ACTIVE"));
                    return user;
                }
            }
            return null;

        } catch ( Exception e ) {
            e.printStackTrace();
            return null;
        } finally {
            this.closeConnection();
        }
    }

}
