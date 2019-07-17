package com.spotify.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "album")
public class AlbumEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "year")
	private Integer year;

	@Column(name = "cover_image_url")
	private String coverImageUrl;

	@ManyToOne
	@JoinColumn(name = "artist_id", referencedColumnName = "id")
	private ArtistEntity artist;
	
	@OneToMany(mappedBy = "album", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<SongEntity> songs;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public String getCoverImageUrl() {
		return coverImageUrl;
	}

	public void setCoverImageUrl(String coverImageUrl) {
		this.coverImageUrl = coverImageUrl;
	}

	public ArtistEntity getArtist() {
		return artist;
	}

	public void setArtist(ArtistEntity artist) {
		this.artist = artist;
	}

	public List<SongEntity> getSongs() {
		return songs;
	}

	public void setSongs(List<SongEntity> songs) {
		this.songs = songs;
	}
	
}
