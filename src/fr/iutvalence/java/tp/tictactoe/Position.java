package fr.iutvalence.java.tp.tictactoe;
/**
 * 
 * @author vignandc
 *(copie du code de td)
 */
public class Position
{
	/**
	 * Le numéro de ligne
	 */
	private final int numeroDeLigne;
	/**
	 * Le numéro de colonne		
	 */
	private final int numeroDeColonne;
	/**
	 * Construit une nouvelle position, à l'intersection ligne/colonne donnée
	 * @param numeroDeLigne le nuémro de ligne
	 * @param numeroDeColonne le numéro de colonne
	 */
	public Position(int numeroDeLigne, int numeroDeColonne)
	{
		this.numeroDeLigne = numeroDeLigne;
		this.numeroDeColonne = numeroDeColonne;
	}
	/**
	 * Obtenir le numéro de ligne
	 * @return le numéro de ligne
	 */
	public int obtenirNumeroDeLigne()
	{
		return this.numeroDeLigne;
	}
	/**
	 * Obtenir le numéro de colonne
	 * @return le numéro de colonne
	 */
	public int obtenirNumeroDeColonne()
	{
		return this.numeroDeColonne;
	}
}