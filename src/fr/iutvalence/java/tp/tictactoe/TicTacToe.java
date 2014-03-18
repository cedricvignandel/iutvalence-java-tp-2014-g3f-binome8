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
	private int tour=0;
	/**
	 * 
	 */
	private boolean finPartie;
	/**
	 * 
	 */
	public Grille nouvelleGrille;
	/**
	 * 
	 */
	public TicTacToe()
	{
		this.nouvelleGrille= new Grille();
		this.finPartie=false;
	}
	/**
	 * 
	 */
	public void jouer()
	{
		
		for(tour=0;(! finPartie||tour<9);tour++)
		{
			nouvelleGrille.poserPion();
			if(nouvelleGrille.testerVictoire())
			{
				break;
			}
		}
	}
}