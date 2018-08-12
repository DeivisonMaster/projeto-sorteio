package dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.sorteio.model.Participante;

@Stateless
public class ParticipanteDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	
	public void inserir(Participante participante){
		em.persist(participante);
	}


	public List<Participante> getParticipantes() {
		TypedQuery<Participante> query = em.createQuery("SELECT p FROM Participante p", Participante.class);
		return query.getResultList();
	}


}
