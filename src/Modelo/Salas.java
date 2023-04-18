package Modelo;
import java.util.Scanner;
import java.util.Set;
import java.util.Random;

import Utils.Imprimir;
import Utils.Pausa;
import Utils.TotalVida;

/**
 * @author Adrián Ruiz
 *
 */

public class Salas {
	
	static TotalVida vidas;
	private String [] salas = new String [4];
	
	/**
	 * @author Adrián Ruiz
	 * @param s0
	 * @param s1
	 * @param s2
	 * @param s3
	 */
	
	public Salas(String s0, String s1, String s2, String s3) {
		salas[0]=s0;
		salas[1]=s1;
		salas[2]=s2;
		salas[3]=s3;
		
	}

	/**
	 * @author Adrián Ruiz
	 * @return
	 */
	
	public  String salaAleatoria () {
		int indice = (int) (Math.random()*4);
		return salas[indice];
	}
		
	/**
	 * @author Adrián Ruiz
	 * @param j
	 * Método que hace que el jugador entre en la sala normal.
	 * Sala normal: no hace nada, solo imprime un syso.
	 */
	
	public static void salaNormal (Jugador j) {
		System.out.println("Entraste en una sala vacia, ¡enhorabuena campeon!\n");
	}
	
	/**
	 * @author Adrián Ruiz
	 * @param j
	 * Método que hace que el jugador entre en la sala trampa.
	 * Sala trampa: automáticamente nada más entrar, resta una vida al jugador.
	 */
	
	public static void salaTrampa (Jugador j) {
		System.out.println("Entraste en una sala trampa, caiste.\n");
		
		if (j.getVida() > 0) {
			System.out.println("Se te restara 1 vida.\n");
			j.setVida(j.getVida()-1);
			System.out.println("Te quedan: " +j.getVida()+ " vidas.\n");
			
		} else if (j.getVida()==0) {
			System.out.println("**************************************************");
        	System.out.println("Mueres acuchillado por no tener suficientes vidas.");
        	System.out.println("**************************************************");
        	
        	System.exit(0);
		}
	}
	
	/**
	 * @author Adrián Ruiz
	 * @param j
	 * @param e
	 * Método que hace que el jugador entre en la sala combate.
	 * Sala combate: el jugador elige entre atacar, defender y rendirse.
	 */
	
	public static void salaCombate (Jugador j, Enemigo e) {
		
		Scanner s = new Scanner(System.in);
		boolean retirada = false;
		int op = -1;
			System.out.println("Llegas a la sala de combate y te encuentras con un caballero que quiere matarte, elige:\n ");
		
        	while (!retirada) {

                System.out.println("*********************************");
                System.out.println("*				*");
                System.out.println("*	[1] Atacar.		*");Pausa.miniPausa();
                System.out.println("*	[2] Defenderte.		*");Pausa.miniPausa();
                System.out.println("*	[3] Rendirse.		*");Pausa.miniPausa();
                System.out.println("*				*");
                System.out.println("*********************************");
				op = s.nextInt();
				
                   
                switch(op){
                
                    case 1:
                    	
                        System.out.println("Has elegido atacar.\n");Pausa.miniPausa();
                        if (j.getAtaque() > e.getDefensa() ) {
                    	   System.out.println("Sacas tu espada y acuchillas a tu enemigo de una forma muy sangrienta, enhorabuena.\n");Pausa.miniPausa();
                    	   
                        	retirada = true;
                        }
                        
                       	break;
                        
                    case 2:
                    	
                        System.out.println("Has elegido defenderte.\n");
                        		j.getVida();
                        
                        if (j.getVida() > 0 && j.getVida() <= 3 ) { 
                        	j.setVida(j.getVida()-1);
                        System.out.println("El enemigo es más poderoso que tu y te quita una vida.\n");
                        
                        } else if (j.getVida()==0) {
                			System.out.println("**************************************************");
                        	System.out.println("Mueres acuchillado por no tener suficientes vidas.");
                        	System.out.println("**************************************************");
                        	
                        	System.exit(0);
                        } 
                        
                        retirada = true;
                        
                        break;
                                                
                    case 3: 
                        System.out.println("Has elegido rendirte, eres un cobarde.\n");
                                                
                        System.out.println("Tu aventura ha terminado");
                        System.exit(0); //si quieres salir completamente del programa.
                        break;

                }
             
                
            }
        	        	
      	   
        }
		

	/**
	 * @author Adrián Ruiz
	 * @param j
	 * Método que hace que el jugador entre en la sala curacion.
	 * Sala curacion: el jugador al entrar se cura si su vida es menor a 3.
	 */
	
	public static void salaCuracion (Jugador j) {
		System.out.println("Felicidades, has llegado a la sala de curacion.\n");
		if (j.getVida() >= 0 && j.getVida() < 3 ) {
			j.setVida(j.getVida()+1);
			
			System.out.println("Has recuperado una vida.\n");
		} else {
			System.out.println("No es posible curarte, tienes el maximo de vidas.\n");
		}
	}
	
}
