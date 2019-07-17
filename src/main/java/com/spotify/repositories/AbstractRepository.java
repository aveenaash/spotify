package com.spotify.repositories;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class AbstractRepository {

	protected EntityManager em;

	public EntityManager getEm() {
		return em;
	}

	@PersistenceContext
	public void setEm(EntityManager em) {
		this.em = em;
	}
}
