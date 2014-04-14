package fr.iutvalence.java.tp.tictactoe;

/**
 * C'est le jeu du morpion, alors il doit y avoir une grille de jeu puis deux
 * joueurs ainsi que des ronds et des croix.
 * classe qui doit contenir le modèle du jeu
 * @author vignandc
 */
public class TicTacToe
{	
	/**
	 * 
	 */
	private  Grille grille;
	/**
	 * 
	 */
	public TicTacToe()
	{
		this.grille= new Grille();
	}
	
	/**
	 * 
	 */
	public void jouer()
	{
		Pion gagnant = Pion.VIDE;
		
		for(int numeroDuTour=0; numeroDuTour< Grille.TAILLE_GRILLE * Grille.TAILLE_GRILLE);numeroDuTour++)
		{
			grille.poserPion(pionAPoser,placeDuPion);
			if(grille.testerVictoire(dernierPionPose))
			{
				break;
			}
		}
	}
}