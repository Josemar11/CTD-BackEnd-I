package com.dh.medicamentos.dao.impl;

import com.dh.medicamentos.dao.ConfiguracaoJDBC;
import com.dh.medicamentos.dao.IDao;
import com.dh.medicamentos.model.Medicamento;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MedicamentoDaoH2 implements IDao<Medicamento> {

    private ConfiguracaoJDBC configuracaoJDBC;
    final static Logger log = Logger.getLogger(MedicamentoDaoH2.class);
    public MedicamentoDaoH2(ConfiguracaoJDBC configuracaoJDBC) {
        this.configuracaoJDBC = configuracaoJDBC;
    }

    @Override
    public Medicamento salvar(Medicamento medicamento) {
        log.debug("Registrando um novo medicamento : " + medicamento.toString());
        Connection connection = configuracaoJDBC.conectarComBancoDeDados();
        Statement statement = null;
        String query = String.format("INSERT INTO medicamentos(nome,laboratorio,quantidade,preco) VALUES('%s','%s','%s','%s')",
                medicamento.getNome(),medicamento.getLaboratorio(),medicamento.getQuantidade(),medicamento.getPreco());
        try {
            statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet keys = statement.getGeneratedKeys();
            if (keys.next())
                medicamento.setId(keys.getInt(1));
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return medicamento;
    }

    @Override
    public Medicamento buscar(Integer id) {
        log.debug("Buscando medicamento com id : "+id);
        Connection connection = configuracaoJDBC.conectarComBancoDeDados();
        Statement stmt = null;
        String query = String.format("SELECT id,nome,laboratorio,quantidade,preco FROM medicamentos where id = '%s'", id);
        Medicamento medicamento = null;
        try {
            stmt = connection.createStatement();
            ResultSet result = stmt.executeQuery(query);
            while (result.next()) {

                medicamento = new Medicamento(result.getInt("id"),
                        result.getString("nome"),result.getString("laboratorio"),result.getInt("quantidade"),result.getDouble("preco"));
            }

            stmt.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return medicamento;
    }
}
