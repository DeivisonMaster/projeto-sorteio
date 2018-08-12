package controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.sorteio.model.Participante;

import dao.ParticipanteDAO;

@Named
@RequestScoped
public class ControllerCadastroParticipante {
	
	@Inject
	private Participante participante;
	
	@Inject
	private ParticipanteDAO participanteDAO;
	
	
	public void cadastrar(){
		participanteDAO.inserir(participante);
	}
	
	public Participante getParticipante() {
		return participante;
	}
	
	public void setParticipante(Participante participante) {
		this.participante = participante;
	}
}
