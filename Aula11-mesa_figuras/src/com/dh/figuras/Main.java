package com.dh.figuras;

import java.sql.*;

public class Main {
    private static final String sqlCreateTable = "DROP TABLE IF EXISTS FIGURA; CREATE TABLE FIGURA "
            + "("
            + " ID INT PRIMARY KEY,"
            + " COR VARCHAR(100) NOT NULL, "
            + " TIPO VARCHAR(100) NOT NULL "
            + ")";

    private static final String sqlInsert1 =  "INSERT INTO FIGURA (ID, COR, TIPO) VALUES (1, 'Vermelho', 'Círculo')";
    private static final String sqlInsert2 =  "INSERT INTO FIGURA (ID, COR, TIPO) VALUES (2, 'Verde', 'Quadrado')";
    private static final String sqlInsert3 =  "INSERT INTO FIGURA (ID, COR, TIPO) VALUES (3, 'Azul', 'Quadrado')";
    private static final String sqlInsert4 =  "INSERT INTO FIGURA (ID, COR, TIPO) VALUES (4, 'Vermelho', 'Quadrado')";
    private static final String sqlInsert5 =  "INSERT INTO FIGURA (ID, COR, TIPO) VALUES (5, 'Verde', 'Círculo')";

    private static final String sqlDelete =  "DELETE FROM FIGURA WHERE ID=2";

    public static void main(String[] args) throws Exception {
        Connection connection = null;

        try {

            connection= getConnection();
            Statement statement = connection.createStatement();

            statement.execute(sqlCreateTable);

            statement.execute(sqlInsert1);
            statement.execute(sqlInsert2);
            statement.execute(sqlInsert3);
            statement.execute(sqlInsert4);
            statement.execute(sqlInsert5);

            ShowFigura(connection, "SELECT * FROM FIGURA WHERE COR = 'Vermelho'");

            statement.execute(sqlDelete);

            ShowFigura(connection, "SELECT * FROM FIGURA");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            if (connection == null)
                return;

            connection.close();
        }
    }

    private static void ShowFigura(Connection connection, String sqlQuery) throws SQLException {

        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        while (rs.next()) {
            System.out.println(rs.getInt(1) + " - " + rs.getString(2) + " - " + rs.getString(3));
        }
    }

    public static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver").newInstance();
        //em user e password colocar suas proprias credencias.
        return DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
    }
}
