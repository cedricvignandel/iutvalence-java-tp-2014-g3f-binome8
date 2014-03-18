package fr.iutvalence.java.tp.tictactoe;
/**
 * représente une grille de morpion de 3x3
 * @author vignandc
 *
 */
public class Grille
{
	// TODO écrire un commentaire
	/**
	 * taille du carré en nombre de case
	 */
	private final static int TAILLE_CARRE = 3;	
	// TODO écrire un commentaire
	/**
	 * allocation tableau grille de jeu
	 */
	private Pion[][] grilleDeJeu ;
	
	// TODO écrire un commentaire
	/**
	 * constructeur et initialisation des cases à VIDE
	 */
	public Grille()
	{
		this.grilleDeJeu = new Pion[TAILLE_CARRE][TAILLE_CARRE];
		for (int x=1 ; x == TAILLE_CARRE ; x++)
		{
			for (int y=1 ; y == TAILLE_CARRE ; y++)
			{
				this.grilleDeJeu[x][y]=Pion.VIDE;
			}
		}
	}
	/**
	 * 
	 * @return
	 */
	public boolean testerVictoire()
	{
		boolean res = false;
		//algo à faire 
		return res;
	}
	/**
	 * 
	 * @param pionAPoser
	 * @param placeDuPion
	 */
	public void poserPion(Pion pionAPoser, Position placeDuPion)
	{
		//faire la condition
		this.grilleDeJeu[placeDuPion.obtenirNumeroDeLigne()][placeDuPion.obtenirNumeroDeColonne()]=pionAPoser;
	}
}
