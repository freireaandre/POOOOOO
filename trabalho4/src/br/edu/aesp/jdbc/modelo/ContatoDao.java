
package br.edu.aesp.jdbc.modelo;

import java.util.logging.Logger;
import java.util.logging.Level;
import java.sql.*;
public class ContatoDao {
    private Connection connection;
    
    public ContatoDao() throws ClassNotFoundException {
        this.connection = new ConnectionFactory().getConnection();
    }



public void adiciona (Contato contato){
String sql = "insert into contato"
+"(nome,email,endereco,telefone)"
+"values (?,?,?,?)";

    try(PreparedStatement stmt = connection.prepareStatement(sql)){
    stmt.setString(1,contato.getNome());
    stmt.setString(2,contato.getEmail());
    stmt.setString(3,contato.getEndereco());
    stmt.setString(4,contato.getTelefone());
    stmt.execute();
    }
    catch(SQLException ex){
        Logger.getLogger(ContatoDao.class.getName())
                .log(Level.SEVERE, null, ex);
    

}









}
}
