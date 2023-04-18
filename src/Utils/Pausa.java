package Utils;


/**
 * @author Adrián Ruiz
 *
 */
public class Pausa {
		
    /**
     * @author Adrián Ruiz
     * Método que hace que al imprimir por pantalla, vaya más despacio.
     */
	
    public static void miniPausa(){
        try{ Thread.sleep(200); 
        }catch(InterruptedException e ){}
    }
}
