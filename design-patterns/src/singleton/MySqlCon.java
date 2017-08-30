/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author a1402072
 */
public class MySqlCon {

    private Connection connection = null;

    private MySqlCon() {
        //previne instanciação de objetos
    }

    public Connection getConnection() throws SQLException {

        if (connection != null) {
            return connection;
        }

        try {

            Class.forName("org.gjt.mm.mysql.Driver");

            this.connection = DriverManager.getConnection("jdbc:mysql://localhost/MedicalClinicManager", "root", "");

            return this.connection;

        } catch (ClassNotFoundException ex) {

            throw new SQLException(ex.getMessage());

        }
    }

    /**
     * Método que encerra uma conexão com o banco de dados
     *
     * @throws java.sql.SQLException
     */
    public void closeConnection() throws SQLException {

        if (this.connection != null && !this.connection.isClosed()) {
            this.connection.close();
        }

    }
}
