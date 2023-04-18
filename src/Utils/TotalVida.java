package Utils;

import Modelo.Jugador;


/**
 * @author Adrián Ruiz
 *
 */
public class TotalVida {
	
	
	static Jugador j = new Jugador();
	
	
	/**
	 * @author Adrián Ruiz
	 * @param vida
	 */
	
	public static void vidas (int vida) {
		if (j.getVida()==0) {
        	
			System.exit(0);
		}
		
	}
} 
