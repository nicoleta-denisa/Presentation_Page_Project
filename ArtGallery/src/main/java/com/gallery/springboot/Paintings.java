package com.gallery.springboot;

public class Paintings {
	public int id;
	public int year;
	public String artist;
	public String dimensions;
	public double price;
	public String currency;
	

	public Paintings(int id,int year, String artist, String dimensions, double price, String currency) {
		super();
		this.id = id;
		this.year = year;
		this.artist = artist;
		this.dimensions = dimensions;
		this.price = price;
		this.currency = currency;
	}

	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getDimensions() {
		return dimensions;
	}

	public void setDimensions(String dimensions) {
		this.dimensions = dimensions;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}


	@Override
	public String toString() {
		return "Paintings [id=" + id + ", year=" + year + ", artist=" + artist + ", dimensions=" + dimensions
				+ ", price=" + price + ", currency=" + currency + "]";
	}

	

	
	
	
}
