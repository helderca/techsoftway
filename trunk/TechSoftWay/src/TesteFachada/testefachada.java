package TesteFachada;

import javax.swing.JButton;

import RepositorioAgenda.repositorioAgenda;

import controladorAgenda.controladoagenda;

public class testefachada {

	
	private controladoagenda contagenda; 
	private static testefachada instacia;
	
	
	private void iniciarcadastro ( ){
	
		repositorioAgenda rpagenda = new repositorioAgenda();
		contagenda = new controladoagenda(rpagenda);
		

		
		
	}
	
	private testefachada(){
		iniciarcadastro();
		
	}
	
	public void salvaAgenda (JButton confirmaConsulta){
		
		
	}
	
	
	
}
