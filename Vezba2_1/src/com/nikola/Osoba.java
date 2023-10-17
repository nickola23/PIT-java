package com.nikola;

public class Osoba {
	private String ime, prezime;

	public Osoba() {
		super();
	}
	
	public Osoba(String ime, String prezime) {
		super();
		this.ime = ime;
		this.prezime = prezime;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	
	public void prikazi() {
		System.out.println(ime + " " + prezime);
	}

}
