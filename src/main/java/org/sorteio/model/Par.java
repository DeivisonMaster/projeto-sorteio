package org.sorteio.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "par")
public class Par {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Participante amigo;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Participante amigoOculto;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Sorteio sorteio;

	public Par(Participante amigo, Participante amigoOculto, Sorteio sorteio) {
		this.amigo = amigo;
		this.amigoOculto = amigoOculto;
		this.sorteio = sorteio;
	}
	
	public Par() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Participante getAmigo() {
		return amigo;
	}

	public void setAmigo(Participante amigo) {
		this.amigo = amigo;
	}

	public Participante getAmigoOculto() {
		return amigoOculto;
	}

	public void setAmigoOculto(Participante amigoOculto) {
		this.amigoOculto = amigoOculto;
	}

	public Sorteio getSorteio() {
		return sorteio;
	}

	public void setSorteio(Sorteio sorteio) {
		this.sorteio = sorteio;
	}
	
	
	
}
