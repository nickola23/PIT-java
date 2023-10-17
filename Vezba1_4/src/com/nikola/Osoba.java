package com.nikola;

public class Osoba {
	private String ime, prezime, jmbg = "";

	public Osoba() {
		super();
	}

	public Osoba(String ime, String prezime, String jmbg) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.jmbg = jmbg;
	}

	public String getJmbg() {
		return jmbg;
	}

	public void setJmbg(String jmbg) throws Exception {
		if(jmbg.length() != 13) {
			throw new Exception("JMBG mora imati 13 cifara");
		}
		else
			this.jmbg = jmbg;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}
	public void unosPodataka(String ime, String prezime, String jmbg){
		
		try {
			setIme(ime);
			setPrezime(prezime);
			setJmbg(jmbg);
			} 
		catch (Exception e) {
				e.printStackTrace();
			}
	}
	public void ispis() {
		System.out.println(ime + " " + prezime + ", JMBG: " + jmbg);
	}
}
