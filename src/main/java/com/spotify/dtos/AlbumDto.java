package com.spotify.dtos;

import java.util.List;

public class AlbumDto {

	private Long id;
	private String name;
	private Integer year;
	private String albumCover;
	
	private List<SongDto> songs;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getAlbumCover() {
		return albumCover;
	}

	public void setAlbumCover(String albumCover) {
		this.albumCover = albumCover;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<SongDto> getSongs() {
		return songs;
	}

	public void setSongs(List<SongDto> songs) {
		this.songs = songs;
	}
	
	

}
