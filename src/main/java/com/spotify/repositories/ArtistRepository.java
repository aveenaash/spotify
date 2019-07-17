package com.spotify.repositories;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spotify.entities.ArtistEntity;

@Repository
public class ArtistRepository extends AbstractRepository {
	
	@Transactional
	public void save(ArtistEntity artistEntity) {
		em.persist(artistEntity);
	}
	
	@Transactional
	public List<ArtistEntity> getAllArtist(){
		Query query = em.createQuery("SELECT a from ArtistEntity a");
		List<ArtistEntity> artists = query.getResultList();
		return artists;
		
	}
	
	@Transactional
	public ArtistEntity getArtistById(long id){
		return (ArtistEntity) em.find(ArtistEntity.class, id);
	}

}
