package br.com.facricadeprogramador.persistencia.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.facricadeprogramador.persistencia.entidade.Usuario;

public class UsuarioDao {
	private Connection con = ConexaoFactory.getConnection(); 
	public void cadastrar(Usuario usu) {
		String sql = "INSERT INTO USUARIO (NOME,LOGIN,SENHA) VALUES (?,?,?)";
		try (PreparedStatement preparador = con.prepareStatement(sql)){
			preparador.setString(1, usu.getNome());
			preparador.setString(2, usu.getLogin());;
			preparador.setString(3, usu.getSenha());
			preparador.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void alterar(Usuario usu) {
		String sql = "UPDATE USUARIO SET NOME=?,LOGIN =?,SENHA=? WHERE ID=?";
		try (PreparedStatement preparador = con.prepareStatement(sql)){
			preparador.setString(1, usu.getNome());
			preparador.setString(2, usu.getLogin());;
			preparador.setString(3, usu.getSenha());
			preparador.setInt(4, usu.getId());
			preparador.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	public void excluir(Usuario usu) {
		String sql = "DELETE FROM USUARIO WHERE ID=?";
		try (PreparedStatement preparador = con.prepareStatement(sql)){
			preparador.setInt(1, usu.getId());
			preparador.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
	}

}
