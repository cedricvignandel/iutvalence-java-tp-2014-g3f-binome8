package fr.iutvalence.java.tp.tictactoe;
/**
 * représente une grille de morpion de 3x3
 * @author vignandc
 *
 */
public class Grille
{
	private final static int TAILLECARRE = 3;
	/**
	 * 
	 */
	private int[][] grilleDeJeu ;
	/**
	 * 
	 */
	public Grille()
	{
		this.grilleDeJeu = new int[TAILLECARRE][TAILLECARRE];
	}
	
}
