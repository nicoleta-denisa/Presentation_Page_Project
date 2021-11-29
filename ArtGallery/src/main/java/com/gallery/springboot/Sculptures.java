package com.gallery.springboot;

public class Sculptures {
	public int id;
	public String artist;
	public double weight;
	public double price;
	public String currency;

	public Sculptures(int id, String artist, double weight, double price, String currency) {
		super();
		this.id = id;
		this.artist = artist;
		this.weight = weight;
		this.price = price;
		this.currency = currency;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
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
		return "Sculptures [id=" + id + ", artist=" + artist + ", weight=" + weight + ", price=" + price + ", currency="
				+ currency + "]";
	}

}
