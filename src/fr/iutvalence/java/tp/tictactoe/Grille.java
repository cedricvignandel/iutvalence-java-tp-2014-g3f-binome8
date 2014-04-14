package fr.iutvalence.java.tp.tictactoe;
/**
 * représente une grille de morpion de 3x3
 * @author vignandc
 *
 */
public class Grille
{
	/**
	 * taille de la grille en nombre de cases
	 */
	public final static int TAILLE_GRILLE = 3;	
	
	/**
	 * la grille où les pions sont posés
	 */
	private Pion[][] grille ;
	
	// TODO écrire un commentaire
	/**
	 * constructeur et initialisation des cases à VIDE
	 */
	public Grille()
	{
		this.grille = new Pion[TAILLE_GRILLE][TAILLE_GRILLE];
		for (int numeroDeLigne=0 ; numeroDeLigne < TAILLE_GRILLE ; numeroDeLigne++)
			for (int numeroDeColonne = 0 ; numeroDeColonne < TAILLE_GRILLE ; numeroDeColonne++)
				this.grille[numeroDeLigne][numeroDeColonne] = Pion.VIDE;
	}
	/**
	 * @return renvoi true en cas de victoire
	 */
	public boolean testerVictoire(Pion dernierPionPose)
	{
		boolean res = false;
		int compteurDePionUn = 0;
		int compteurDePionDeux =0;
		while (compteurDePionUn!=TAILLE_GRILLE && res==false)
		
			while (compteurDePionDeux !=TAILLE_GRILLE)
				
				if (this.grille[compteurDePionUn][compteurDePionDeux]!=dernierPionPose)
				{
					res=false;
					break;
				}
				else
				{
					res=true;
				}
				compteurDePionDeux++;
			compteurDePionDeux=0;
			while(compteurDePionDeux !=TAILLE_GRILLE)
				if (this.grille[compteurDePionDeux][compteurDePionUn]!=dernierPionPose)
				{
					res=false;
					break;
				}
				else
				{
					res=true;
				}
				compteurDePionDeux++;
			compteurDePionUn++;
		compteurDePionUn=0;
		while (compteurDePionUn!=TAILLE_GRILLE && res==false)
			if(this.grille[compteurDePionUn][compteurDePionUn]!=dernierPionPose)
			{
				res=false;
				break;
			}
			else
			{
				res=true;
			}
			compteurDePionUn++;
		compteurDePionUn=0;
		while(compteurDePionUn!=TAILLE_GRILLE && res==false)
			if(this.grille[compteurDePionUn][TAILLE_GRILLE-compteurDePionUn-1]!=dernierPionPose)
			{
				res=false;
				break;
			}
			else
			{
				res=true;
			}
			compteurDePionUn++;
		return res;
		
	}
	/**
	 * 			fonction qui affecte un pion à une case
	 * @param pion    Soit un ROND soit une CROIX
	 * @param position   designe une case de la grille [ligne][colonne]
	 */
	public void poserPion(Pion pion, Position position)
	{
		if(this.grille[position.obtenirNumeroDeLigne()]
				[position.obtenirNumeroDeColonne()] == Pion.VIDE)
			this.grille[position.obtenirNumeroDeLigne()]
					[position.obtenirNumeroDeColonne()] = pion;	
		
	}
}
