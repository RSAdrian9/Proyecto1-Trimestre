package Modelo;


/**
 * @author Adrián Ruiz
 * 
 */
public class Enemigo {
	private String nombre;
	private int ataque;
	private int defensa;
	private int vida;
	
	public Enemigo () {
		nombre = "Desconocido";
		ataque = 0;
		defensa = 0;
		vida = 0;
	}
	
	/**
	 * @author Adrián Ruiz
	 * @param nombre
	 * @param ataque
	 * @param defensa
	 * @param vida
	 */
	
	public Enemigo (String nombre, int ataque, int defensa, int vida) {
		this.nombre = nombre;
		this.ataque = ataque;
		this.defensa = defensa;
		this.vida = vida;
	}
	
	/**
	 * @author Adrián Ruiz
	 * @return
	 */
	
	public String getNombre() {
		return nombre;
	}

	/**
	 * @author Adrián Ruiz
	 * @param nombre
	 */
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @author Adrián Ruiz
	 * @return
	 */
	
	public int getAtaque() {
		return ataque;
	}

	/**
	 * @author Adrián Ruiz
	 * @param ataque
	 */
	
	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	/**
	 * @author Adrián Ruiz
	 * @return
	 */
	
	public int getDefensa() {
		return defensa;
	}

	/**
	 * @author Adrián Ruiz
	 * @param defensa
	 */
	
	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}

	/**
	 * @author Adrián Ruiz
	 * @return
	 */
	
	public int getVida() {
		return vida;
	}

	/**
	 * @author Adrián Ruiz
	 * @param vida
	 */
	
	public void setVida(int vida) {
		this.vida = vida;
	}
}
