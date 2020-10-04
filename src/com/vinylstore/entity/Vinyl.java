package com.vinylstore.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "vinyl")
public class Vinyl {

	@Column(name = "id")
	private int id;

	@Column(name = "title")
	private String title;

	@Column(name = "artist")
	private String artist;

	@Column(name = "price")
	private double price;

	public Vinyl() {
	}

	public Vinyl(String title, String artist, double price) {
		this.title = title;
		this.artist = artist;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Vinyl [id=" + id + ", title=" + title + ", artist=" + artist + ", price=" + price + "]";
	}

}
