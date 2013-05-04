package pl.lrozek.szkolenia.wprowadzenie.oop.sample1;

public class SamochodMain1 {

	public static void main(String[] args) {
		Samochod samochod = new Samochod("abc123");
		samochod.przyspiesz();
		samochod.przyspiesz();
		samochod.zwolnij();
		samochod.zachamuj();
	}

}
