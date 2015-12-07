package TeamDJG;

/**
 * Berechnet Rauminhalt
 * @author DJG
 * @version 07-12-2015
 */
public class Rauminhalt {
	
	/**
	 * Berechnet Rauminhalt von einer Pyramide
	 * @since 07-12-2015
	 * @param a erste Seite
	 * @param b zweite Seite
	 * @param h Höhe
	 * @return Volumen der Pyramide
	 */
	public static double pyramidVol(double a, double b, double h){
		return a*b*h*1/3;
	}
	
	/**
	 * Berechnet Rauminhalt von einem Kegel
	 * @since 07-12-2015
	 * @param r Radius
	 * @param h Höhe
	 * @return Volumen des Kegels
	 */
	public static double coneVol(double r, double h){
		return r*r*Math.PI*h*1/3;
	}
	
	/**
	 * Berechnet Rauminhalt von einem Quader
	 * @since 07-12-2015
	 * @param a erste
	 * @param b zweite
	 * @param c dritte Seite
	 * @return Volumen des Quaders
	 */
	public static double quaderVol(double a,double b, double c){
		return a*b*c;
	}
}
