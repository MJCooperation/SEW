package TeamDJG;
/**
 * Die Flaechenberechnung
 * @author Michael Jindra
 * @version 02.12.2015
 */
public class Flaechen {
	//Attribute
	private double a;
	private double h;
	private double b;
	private double c;
	private char posH; //Position der angegebenen Höhe (a,b,c)
	private double r;
	private int form;//0 = Kreis, 3 = Dreieck, 4 = Rechteck 
	
	//Konstruktoren
	//Rechteck
	public Flaechen(double a, double b) {
		super();
		this.a = a;
		this.b = b;
		form = 4;
	}

	//Dreieck
	public Flaechen(double a, double h, double b, double c, char posH) {
		super();
		this.a = a;
		this.h = h;
		this.b = b;
		this.c = c;
		this.posH = posH;
		form = 3;
	}

	//Kreis
	public Flaechen(double r) {
		super();
		this.r = r;
		form = 0;
	}
	
	//Methoden
	/**
	 * Der Name sagt alles aus
	 * @since 02.12.2015
	 * @return der flaecheninhalt
	 */
	public double flaechenInhalt(){
		switch(form){
		case 0: return r*r*Math.PI;
		case 3:{
				if(posH == 'a')return a*h;
				else if(posH == 'b')return b*h;
				else if(posH == 'c')return c*h;
			}
		case 4: return a*b;
		}
		return 0;
	}
	
	/**
	 * Wiedereinmal ein eindeutiger Name
	 * @since 02.12.2015
	 * @return der umfang
	 */
	public double umfang(){
		switch(form){
		case 0: return 2*r*Math.PI;
		case 3: return a+b+c;
		case 4: return (a+b)*2;
		}
		return 0;
	}

	
}
