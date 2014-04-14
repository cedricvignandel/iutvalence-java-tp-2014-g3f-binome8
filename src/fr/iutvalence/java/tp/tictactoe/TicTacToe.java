package fr.iutvalence.java.tp.tictactoe;

/**
 * C'est le jeu du morpion, alors il doit y avoir une grille de jeu puis deux
 * joueurs ainsi que des ronds et des croix.
 * classe qui doit contenir le modèle du jeu
 * @author vignandc
 */
public class TicTacToe
{	
	
	public final static int NOMBRE_DE_JOUEURS = 2;
	/**
	 * 
	 */
	private  Grille grille;
	
	private Joueur[] joueurs;
	
	
	/**
	 * 
	 */
	public TicTacToe()
	{
		this.grille= new Grille();
		this.joueurs = new Joueur[NOMBRE_DE_JOUEURS];
		this.joueurs[0] = new JoueurIA(Pion.CROIX);
		this.joueurs[1] = new JoueurIA(Pion.ROND);
	}
	
	/**
	 * 
	 */
	public void jouer()
	{
		Pion gagnant = Pion.VIDE;		
		for(int numeroDuTour=0; numeroDuTour< Grille.TAILLE_GRILLE * Grille.TAILLE_GRILLE;numeroDuTour++)
		{
			Position position = joueur.obtenirPosition();
			Joueur joueur = this.joueurs[numeroDuTour % 2];
			while(true)
			{
				boolean erreur = this.grille.poserPion(joueur.obtenirPion(), position);
				if (!erreur)
					break;
			}

			// TODO redefinir toString dans Grille
			System.out.println(this.grille);
			
			if (this.grille.testerVictoire(position))
			{
				break;
			}
		}
	}
}