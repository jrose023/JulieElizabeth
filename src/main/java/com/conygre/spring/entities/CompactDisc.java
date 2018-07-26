// This entity class uses annotations instead of the mapping XML file

package com.conygre.spring.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


// add an annotations specifying the table that this will map to
@Entity @Table(name="compact_discs")

// Adding caching
//@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
//@Cacheable 

// ensure that the class implements Serializable

@NamedQueries(
		{
			@NamedQuery(name="compactdisc.getAll", 
			query="select cd from CompactDisc as cd where cd.price > :price", 
			hints = {@QueryHint(name = "org.hibernate.cacheable", value = "true")})
		})



public class CompactDisc implements Serializable {

	
	// add an attribute specifying a column for the id property
	// add attributes to ensure that the id column is automantically generated
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;

	// add attributes for all the remaining properties
	@Column(name="title") private String title;
	@Column(name="artist") private String artist;
	@Column(name="price") private Double price;

	public CompactDisc() {}

	public CompactDisc(String t, double p,String a, int tr){
	    title=t;
	    price=p;
	    artist=a;

	  }

	public void setId(int id) {
		this.id = id;
	}
	
	public void addTrack(Track t) {
		t.setDisc(this);
		trackTitles.add(t);
	}
	
	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getId() {
		return id;
	}

	// Adding relationships 
	@OneToMany(mappedBy="disc", cascade={CascadeType.MERGE, CascadeType.PERSIST})
	@JsonIgnore
	private List<Track> trackTitles = new ArrayList<Track>();

	public List<Track> getTrackTitles() {
		return trackTitles;
	}

	public void setTrackTitles(List<Track> trackTitles) {
		this.trackTitles = trackTitles;
	}



}
