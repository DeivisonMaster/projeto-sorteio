package org.sorteio.model;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "sorteio")
public class Sorteio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String nome;
	
	/* 1 sorteio é composto de pares e cada par possui 2 participantes */
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy="sorteio")
	private Set<Par> pares;
	
	public Sorteio() {
		pares = new LinkedHashSet<>(); // a ordem importa neste dominio
	}
	
	public void adicionaPar(Par par){
		this.pares.add(par);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Set<Par> getPares() {
		return Collections.unmodifiableSet(pares);
	}
	
	public void setPares(Set<Par> pares) {
		this.pares = pares;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sorteio other = (Sorteio) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
