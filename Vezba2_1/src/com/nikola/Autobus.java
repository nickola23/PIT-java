package com.nikola;

public class Autobus {
	private String relacija;
	private int brojSedista, brojProdatihKarata;
	private Osoba[] listaPutnika;
	public Autobus() {
		super();
		relacija = "";
		brojSedista = brojProdatihKarata = 0;
		listaPutnika = new Osoba[0];
	}
	public Autobus(String relacija, int brojSedista, int brojProdatihKarata, Osoba[] listaPutnika) {
		super();
		this.relacija = relacija;
		this.brojSedista = brojSedista;
		this.brojProdatihKarata = brojProdatihKarata;
		this.listaPutnika = listaPutnika;
	}
	public String getRelacija() {
		return relacija;
	}
	public void setRelacija(String relacija) {
		this.relacija = relacija;
	}
	public int getBrojSedista() {
		return brojSedista;
	}
	public void setBrojSedista(int brojSedista) {
		this.brojSedista = brojSedista;
	}
	public int getBrojProdatihKarata() {
		return brojProdatihKarata;
	}
	public void setBrojProdatihKarata(int brojProdatihKarata) {
		this.brojProdatihKarata = brojProdatihKarata;
	}
	public Osoba[] getListaPutnika() {
		return listaPutnika;
	}
	public void setListaPutnika(Osoba[] listaPutnika) {
		this.listaPutnika = listaPutnika;
	}
	public boolean imaMesta() {
		if(brojSedista > brojProdatihKarata)
			return true;
		else
			return false;
	}
	public void prodajKartu(Osoba putnik) {
		listaPutnika[brojProdatihKarata] = putnik;
		System.out.println("Prodato sediste broj: " + brojProdatihKarata);
		brojProdatihKarata++;
	}
	public void putnaLista() {
		System.out.println("Putnici: ");
		for(int i = 0; i < listaPutnika.length; i++) {
			System.out.println("Sediste" + i + ": " + listaPutnika[i].getIme() + " " + listaPutnika[i].getPrezime());
		}
	}
}
