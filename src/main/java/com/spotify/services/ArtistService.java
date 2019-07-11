package com.spotify.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spotify.dtos.ArtistDto;

@Service
public class ArtistService {

	
	public void saveArtist(ArtistDto artistDto) {
		System.out.println(artistDto.toString());
	}
	
	public List<ArtistDto> getAllArtists(){
		List<ArtistDto> allArtists = new ArrayList<ArtistDto>();
		
		ArtistDto dumm1 = new ArtistDto();
		dumm1.setName("Taylor Swift");
		dumm1.setGenre("pop");
		dumm1.setCountry("sdrr");
		dumm1.setEmail("xtz@gmail.com");
		
		allArtists.add(dumm1);
		
		return allArtists;
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
