package com.dh.funcionario;

import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Main {
    // Instrução para apagar a tabela Funcionario, caso já exista e criar a tabela Funcionario
    private static final String sqlCreateTable = "DROP TABLE IF EXISTS Funcionario; CREATE TABLE Funcionario "
            + "("
            + " ID INT PRIMARY KEY,"
            + " Nome VARCHAR(100) NOT NULL, "
            + " Idade INT NOT NULL, "
            + " Apelido VARCHAR(100) NOT NULL, "
            + " Funcao VARCHAR(100) "
            + ")";

    // Instruções para inserir dados na tabela Funcionario
    private static final String sqlInsert1 =  "INSERT INTO Funcionario (ID, Nome, Idade, Apelido, Funcao) VALUES (1, 'Jaime', 18, 'Jaime', 'Trainee')";
    private static final String sqlInsert2 =  "INSERT INTO Funcionario (ID, Nome, Idade, Apelido, Funcao) VALUES (1, 'Lucas', 19, 'Lucas', 'Programador')";
    private static final String sqlInsert3 =  "INSERT INTO Funcionario (ID, Nome, Idade, Apelido, Funcao) VALUES (2, 'Laura', 28, 'Laura', 'Coordenadora')";

    // Instrução para atualizar registro da tabela Funcionario
    private static final String sqlUpdate =  "UPDATE Funcionario SET Idade = 27 WHERE ID = 2";

    // Instruções para excluir registros da tabela Funcionario
    private static final String sqlDelete1 =  "DELETE FROM Funcionario WHERE ID=2";
    private static final String sqlDelete2 =  "DELETE FROM Funcionario WHERE Nome='Jaime'";

    private static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) throws Exception {
        Connection connection = null;

        try {
            connection= getConnection();
            Statement statement = connection.createStatement();

            // Executa a instrução de criação de tabela no banco de dados
            statement.execute(sqlCreateTable);

            // Executa as instruções para inserir os dados na tabela
            statement.execute(sqlInsert1);

            try {
                statement.execute(sqlInsert2);
            }catch(org.h2.jdbc.JdbcSQLIntegrityConstraintViolationException e) {
                logger.error("Erro ao tentar inserir o funcionário: ", e);
            }

            statement.execute(sqlInsert3);

            // Executa a instrução para atualizar os dados na tabela
            statement.execute(sqlUpdate);
            logger.debug("Atualizado os dados do funcionário.");

            // Executa as instruções para excluir os registros na tabela
            statement.execute(sqlDelete1);
            logger.info("Excluído o funcionário com o ID 2");

            statement.execute(sqlDelete2);
            logger.info("Excluído o funcionário com nome Jaime");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (connection == null)
                return;

            connection.close();
        }
    }

    public static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "");
    }
}
