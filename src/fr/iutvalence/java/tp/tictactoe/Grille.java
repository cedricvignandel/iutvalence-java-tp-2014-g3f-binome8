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
		int compteurDePionUn = 0;
		int compteurDePionDeux =0;
		while (compteurDePionUn!=TAILLE_CARRE && res==false)
		
			while (compteurDePionDeux !=TAILLE_CARRE)
				
				if (this.grilleDeJeu[compteurDePionUn][compteurDePionDeux]!=pionAPoser)
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
			while(compteurDePionDeux !=TAILLE_CARRE)
				if (this.grilleDeJeu[compteurDePionDeux][compteurDePionUn]!=pionAPoser)
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
		while (compteurDePionUn!=TAILLE_CARRE && res==false)
			if(this.grilleDeJeu[compteurDePionUn][compteurDePionUn]!=pionAPoser)
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
		while(compteurDePionUn!=TAILLE_CARRE && res==false)
			if(this.grilleDeJeu[compteurDePionUn][TAILLE_CARRE-compteurDePionUn-1]!=pionAPoser)
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
	 * 
	 * @param pionAPoser
	 * @param placeDuPion
	 */
	public void poserPion(Pion pionAPoser, Position placeDuPion)
	{
		if(this.grilleDeJeu[placeDuPion.obtenirNumeroDeLigne()]
				[placeDuPion.obtenirNumeroDeColonne()]==Pion.VIDE)
		{
			this.grilleDeJeu[placeDuPion.obtenirNumeroDeLigne()]
					[placeDuPion.obtenirNumeroDeColonne()]=pionAPoser;	
		}
		
	}
}
