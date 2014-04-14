package fr.iutvalence.java.tp.tictactoe;

import java.util.Random;

/**
 * 
 * @author vignandc
 * 
 */
public class JoueurIA extends Joueur
{
	/**
 * 
 */
	public JoueurIA(Pion pion)
	{
		super(pion);
	}

	@Override
	public Position obtenirPosition()
	{
		Random generateurDeNombresAleatoires = new Random();
		int numeroDeLigne = generateurDeNombresAleatoires.nextInt(Grille.TAILLE_GRILLE);
		int numeroDeColonne = generateurDeNombresAleatoires.nextInt(Grille.TAILLE_GRILLE);

		return new Position(numeroDeLigne, numeroDeColonne);
	}

}
