package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import static com.opensymphony.xwork2.Action.ERROR;
import static com.opensymphony.xwork2.Action.SUCCESS;

/**
 * Model class fir Authentication
 * Acts as logic for data access and authentication through MYSQL
 */
public class Authentication implements AuthenticationInterface {

    /**
     * Use this method provided to connect to localhost:3306 MySQL database
     * @return connection
     * @throws Exception no connection
     */
    private Connection conn() throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");

        return DriverManager
            .getConnection(
                "jdbc:mysql://localhost:3306/UserPasswordTable?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                "eric", 
                "xxxx");
    }

    /**
     * Query database and check if login credentials is valid
     * @param userName username
     * @param password password
     * @return validity of login credentials
     */
    public boolean isLoginValid(String userName, String password) {
        String validCredential = ERROR;

        try (Connection conn = conn()) {
            String sqlCommand = "SELECT userName FROM users WHERE";
            sqlCommand += " userName = ? AND password = ?";
            PreparedStatement preparedStatement = conn.prepareStatement(sqlCommand);
            preparedStatement.setString(1, userName);
            preparedStatement.setString(2, password);
            System.out.println("query: " + preparedStatement);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                // SQL returns correct credential
                validCredential = SUCCESS;
            }

        } catch (Exception e) {
            validCredential = ERROR;
            System.out.println("SQL not connected");
        }
        return validCredential.equals(SUCCESS);
    }
}
