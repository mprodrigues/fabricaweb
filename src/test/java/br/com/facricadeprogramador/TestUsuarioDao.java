package br.com.facricadeprogramador;

import br.com.facricadeprogramador.persistencia.entidade.Usuario;
import br.com.facricadeprogramador.persistencia.jdbc.UsuarioDao;

public class TestUsuarioDao {

	public static void main(String[] args) {
		testExcluir();
	}
	
	public static void testCadastrar(){
		//Criando o usuario
		Usuario usu = new Usuario();
		usu.setNome("Marlon");
		usu.setLogin("Pablo");
		usu.setSenha("123");
		//Cadastrando usuario
		UsuarioDao usuDAO = new UsuarioDao();
		usuDAO.cadastrar(usu);
		
		System.out.println("Cadastrado com sucesso");	
	}
	
	public static void testAlterar(){
		
		Usuario usu = new Usuario();
		usu.setId(3);
		usu.setNome("Marlon Pablo");
		usu.setLogin("Pablo");
		usu.setSenha("321");
		
		UsuarioDao usuDAO = new UsuarioDao();
		usuDAO.alterar(usu);
		
		System.out.println("Alterado com sucesso");	
	}
	
	public static void testExcluir(){
		Usuario usu = new Usuario();
		usu.setId(1);
		
		UsuarioDao usuDAO = new UsuarioDao();
		usuDAO.excluir(usu);
		
		System.out.println("Excluido com sucesso");	
	}

}
