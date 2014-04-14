package fr.iutvalence.java.tp.tictactoe;
/**
 * 
 * @author vignandc
 *
 */
public abstract class Joueur
{
	/**
	 * 
	 */
	private Pion pion;
	/**
	 * 
	 * @return position du pion à placer
	 */
	public abstract Position obtenirPosition();
	/**
	 * 
	 */
	public Joueur(Pion pion)
	{
		this.pion = pion;
	}

}
