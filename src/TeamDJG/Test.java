package TeamDJG;

public class Test {

	public static void main(String[] args) {
		//Jun Jie Gao hat die Angabe nicht ganz verstanden und hat einen Rechner programmiert 
		Zahlen.main(new String[0]);
		
		//Methoden zum Berechnen von Volumen
		System.out.println(Rauminhalt.pyramidVol(5, 5, 3));
		System.out.println(Rauminhalt.coneVol(8, 2));
		System.out.println(Rauminhalt.quaderVol(2, 3, 4));
		
		//Berechnung der Flächen mit Objekten
		//Kreis
		Flaechen f = new Flaechen(5);
		System.out.println(f.flaechenInhalt());
		System.out.println(f.umfang());
		//Rechteck
		f = new Flaechen(4, 2);
		System.out.println(f.flaechenInhalt());
		System.out.println(f.umfang());
		//Dreieck
		f = new Flaechen(5, 2, 4, 6, 'a');
		System.out.println(f.flaechenInhalt());
		System.out.println(f.umfang());		
	}

}
