package com.spotify.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spotify.dtos.ArtistDto;
import com.spotify.entities.ArtistEntity;
import com.spotify.repositories.ArtistRepository;

@Service
public class ArtistService {

	@Autowired
	private ArtistRepository artistRepository;
	
	public void saveArtist(ArtistDto artistDto) {
		ArtistEntity artistEntity = new ArtistEntity();
		artistEntity.setName(artistDto.getName());
		artistEntity.setGenre(artistDto.getGenre());
		artistEntity.setEmail(artistDto.getEmail());
		artistEntity.setCountry(artistDto.getCountry());
			
		artistRepository.save(artistEntity);
		
		
		
	}
	
	public List<ArtistDto> getAllArtists(){
		List<ArtistEntity> artistEntities = artistRepository.getAllArtist();
		
		List<ArtistDto> artistDtos = new ArrayList<ArtistDto>();
		for(ArtistEntity artist : artistEntities) {
			ArtistDto artistDto = new ArtistDto();
			artistDto.setName(artist.getName());
			artistDto.setGenre(artist.getGenre());
			artistDto.setCountry(artist.getCountry());
			artistDto.setEmail(artist.getEmail());
			
			artistDtos.add(artistDto);
		}
		
		return artistDtos;
	}
	
	public ArtistDto getAllArtistById(int id){
		
		ArtistDto dumm1 = new ArtistDto();
		dumm1.setName("twatatta tatat");
		dumm1.setGenre("tata");
		dumm1.setCountry("tata");
		dumm1.setEmail("trata@gmail.com");
		return dumm1;
	}
}
