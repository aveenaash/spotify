package com.spotify.controllers;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spotify.dtos.ArtistDto;

@RestController
@RequestMapping(value = "/artist")
public class ArtistController {

	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public void hello(@RequestBody ArtistDto artistDto) {
		System.out.println(artistDto.toString());
	}
}
