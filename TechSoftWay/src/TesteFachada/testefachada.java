package TesteFachada;

import contatoDAO.contatoDAO;
import controladorAgenda.controladoagenda;

public class testefachada {

	private contatoDAO ct = new contatoDAO();
	private controladoagenda contagenda; 
	private static testefachada instacia;
	
	
	private void iniciarcadastro ( ){
	
		contatoDAO dao = new contatoDAO();
		contagenda = new controladoagenda(dao);

		
		
	}
	
	private testefachada(){
		
		
	}
	
	public void salvaAgenda (){
		
		
	}
	
	
	
}
