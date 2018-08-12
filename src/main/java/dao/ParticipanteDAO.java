package dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.sorteio.model.Participante;

@Stateless
public class ParticipanteDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	
	public void inserir(Participante participante){
		em.persist(participante);
	}
	
}
