package pl.lrozek.szkolenia.wprowadzenie.oop.sample1;

public class Samochod {

	// stan obiektu
	private String vin;

	private int predkosc = 0;

	public Samochod(String vin) {
		this.vin = vin;
	}

	// komunikaty jakie moze obsluzyc obiekt

	public void przyspiesz() {
		predkosc = predkosc + 10;
		komunikuj(" przyspieszyl do " + predkosc + " km/h");
	}

	public void zwolnij() {
		predkosc = predkosc - 10;
		komunikuj(" zwolnij do " + predkosc + " km/h");
	}

	public void zachamuj() {
		predkosc = 0;
		komunikuj(" zahamowal ");
	}

	// komunikat nie dostepny z zewnatrz obiektu
	private void komunikuj(String tekst) {
		System.out.println(" samochod o numerze vin " + vin + tekst);
	}

	// tozsamosc

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((vin == null) ? 0 : vin.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Samochod other = (Samochod) obj;
		if (vin == null) {
			if (other.vin != null)
				return false;
		} else if (!vin.equals(other.vin))
			return false;
		return true;
	}

}
