package fr.iutvalence.java.tp.tictactoe;
/**
 * représente une grille de morpion de 3x3
 * @author vignandc
 *
 */
public class Grille
{
	// TODO écrire un commentaire
	private final static int TAILLE_CARRE = 3;
	
	// TODO écrire un commentaire
	private Pion[][] grilleDeJeu ;
	
	// TODO écrire un commentaire
	public Grille()
	{
		this.grilleDeJeu = new Pion[TAILLE_CARRE][TAILLE_CARRE];
		for (int x=1 ; x == TAILLE_CARRE ; x++)
		{
			for (int y=1 ; y == TAILLE_CARRE ; y++)
			{
				this.grilleDeJeu[x][y]=Pion.vide;
			}
		}
	}	
	
}
