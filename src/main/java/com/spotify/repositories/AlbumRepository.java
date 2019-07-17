package com.spotify.repositories;


import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spotify.entities.AlbumEntity;

@Repository
public class AlbumRepository extends AbstractRepository {

	@Transactional
	public void save(AlbumEntity albumEntity) {
		em.persist(albumEntity);
	}
	
	@Transactional
	public void update(AlbumEntity albumEntity) {
		em.merge(albumEntity);
	}
	
	@Transactional
	public AlbumEntity findById(Long id) {
		return em.find(AlbumEntity.class, id);
	}
}
