package controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.sorteio.model.Sorteio;

@Named
@RequestScoped
public class ControllerCadastroSorteio {
	
	@Inject
	private Sorteio sorteio;
	
	
	public void sortear(){
		System.out.println("sorteio: " + sorteio.getNome());
	}
	
	public Sorteio getSorteio() {
		return sorteio;
	}
	
}	
