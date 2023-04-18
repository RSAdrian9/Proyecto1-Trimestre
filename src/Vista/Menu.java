package Vista;

import java.util.Scanner;
import Modelo.Enemigo;
import Modelo.Jugador;
import Modelo.Salas;
import Utils.Pausa;
import Utils.TotalVida;

/**
 * @author Adrián Ruiz
 * Programa que inicia en una sala de entrada y pide que el usuario elija una opción entre seis opciones.
 * Hay 4 salas que se generan de forma aleatoria.
 */

public class Menu {
	
	static Pausa pausa;
	/**
	 * @author Adrián Ruiz
	 * @param args
	 * Menú para elegir entre 6 opciones.
	 */
	
	public static void main(String[] args) {
		
		Jugador j1 = new Jugador ("Usuario", 1, 0, 3);
		Enemigo e1 = new Enemigo ("IA", 1, 0, 9999);
		
		Scanner teclado = new Scanner(System.in);
		Salas miSala = new Salas ("salaCuracion" , "salaCombate" , "salaNormal" , "salaTrampa" );
		pausa = new Pausa();
		boolean salir = false;
		int opcion; //Guardaremos la opción del usuario.
		
		System.out.println("Apareces en una sala con 4 puertas y no sabes donde estas , ¿que haces?\n");
			while(!salir){
		        
		        System.out.println("*-------------------------------------------------*");
		        System.out.println("*--						--*");
				System.out.println("*--	[1] Moverte a la sala de arriba.	--*");Pausa.miniPausa();
		        System.out.println("*--	[2] Moverte a la sala de abajo.		--*");Pausa.miniPausa();
		        System.out.println("*--	[3] Moverte a la sala de la izquierda.	--*");Pausa.miniPausa();
		        System.out.println("*--	[4] Moverte a la sala de la derecha.	--*");Pausa.miniPausa();
		        System.out.println("*--	[5] Mirar puntos de vida.		--*");Pausa.miniPausa();
		        System.out.println("*--	[6] Rendirse.				--*");Pausa.miniPausa();
		        System.out.println("*--						--*");
		        System.out.println("*-------------------------------------------------*");
		        	opcion = teclado.nextInt();
		               
		        	switch(opcion){
		            	case 1:
		                    System.out.println("Atraviesas la puerta de arriba.\n");
		                    //class aleatorio para elegir la proxima sala
		                    
		                    String salaAleatoria = miSala.salaAleatoria();
		                    
		                    if (salaAleatoria.equals("salaCombate")) {   
		                    	Salas.salaCombate(j1, e1);
		                    }else if (salaAleatoria.equals("salaCuracion")) {
		                    	Salas.salaCuracion(j1);
		                    }else if (salaAleatoria.equals("salaNormal")) {
		                    	Salas.salaNormal(j1);
		                    }else if (salaAleatoria.equals("salaTrampa")) {
		                    	Salas.salaTrampa(j1);
		                    }
		                    		                    
		                break;
		                case 2:
		                    System.out.println("Atraviesas la puerta de abajo.\n");
		                    //class aleatorio para elegir la proxima sala
		                    
		                    String salaAleatoria1 = miSala.salaAleatoria();
		                    if (salaAleatoria1.equals("salaCombate")) {   
		                    	Salas.salaCombate(j1, e1);
		                    }else if (salaAleatoria1.equals("salaCuracion")) {
		                    	Salas.salaCuracion(j1);
		                    }else if (salaAleatoria1.equals("salaNormal")) {
		                    	Salas.salaNormal(j1);
		                    }else if (salaAleatoria1.equals("salaTrampa")) {
		                    	Salas.salaTrampa(j1);
		                    }

		                break;
		                case 3:
		                    System.out.println("Atraviesas la puerta de la izquierda.\n");
		                    //class aleatorio para elegir la proxima sala
		                    
		                    String salaAleatoria11 = miSala.salaAleatoria();
		                    if (salaAleatoria11.equals("salaCombate")) {   
		                    	Salas.salaCombate(j1, e1);
		                    }else if (salaAleatoria11.equals("salaCuracion")) {
		                    	Salas.salaCuracion(j1);
		                    }else if (salaAleatoria11.equals("salaNormal")) {
		                    	Salas.salaNormal(j1);
		                    }else if (salaAleatoria11.equals("salaTrampa")) {
		                    	Salas.salaTrampa(j1);
		                    }
		            		
		                break;
		                case 4:
		                    System.out.println("Atraviesas la puerta de la derecha.\n");
		                    //class aleatorio para elegir la proxima sala
		                    
		                    String salaAleatoria111 = miSala.salaAleatoria();
		                    if (salaAleatoria111.equals("salaCombate")) {   
		                    	Salas.salaCombate(j1, e1);
		                    }else if (salaAleatoria111.equals("salaCuracion")) {
		                    	Salas.salaCuracion(j1);
		                    }else if (salaAleatoria111.equals("salaNormal")) {
		                    	Salas.salaNormal(j1);
		                    }else if (salaAleatoria111.equals("salaTrampa")) {
		                    	Salas.salaTrampa(j1);
		                    }
		                    

			                	   
		                    
		                break;
		                case 5:
		                    System.out.println("Consultando vidas restantes...\n");
		                    
		            		System.out.println("Tienes " +j1.getVida()+ " vida/s.\n");Pausa.miniPausa();
		                    
		                    break;
		                    
		                case 6:
		                    System.out.println("Decides rendirte y esperar tu muerte en la mazmorra.\n");
		                    salir=true;
		                                      
		                    break;

		                default:
		                    System.out.println("Por alguna razon decides estrellarte contra una pared, buena esa.  ");
		                
		                    break;
		                
		            }
		        			        			        			        	
			}
			
	}
	
}
