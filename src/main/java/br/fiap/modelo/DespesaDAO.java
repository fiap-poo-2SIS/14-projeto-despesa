package br.fiap.modelo;

import br.fiap.conexao.Conexao;

import java.sql.*;

public class DespesaDAO {
    private PreparedStatement ps;
    private ResultSet rs;
    private String sql;

    public void inserir(Despesa despesa) {
        sql = "insert into java_despesa values (?, ?, ?, ?, ?)";
        try(Connection connection = Conexao.conectar()) {
            ps = connection.prepareStatement(sql);
            ps.setLong(1, despesa.getId());
            ps.setString(2, despesa.getDescricao());
            ps.setDate(3, Date.valueOf(despesa.getData()));
            ps.setDouble(4, despesa.getValor());
            ps.setLong(5, despesa.getCategoria().getId());
            ps.execute();
        }
        catch(SQLException e) {
            System.out.println("Erro ao inserir despesa\n" + e);
        }
    }

}
