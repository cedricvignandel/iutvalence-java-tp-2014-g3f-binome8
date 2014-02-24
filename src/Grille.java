/**
 * représente une grille de morpion de 3x3
 * @author vignandc
 *
 */
public class Grille
{
	/**
	 * Dans la grille le 0 sera une case vide
	 */
	private final int CASE_VIDE=0;
	/**
	 * Dans la grille le 1 sera une croix
	 */
	private final int CROIX=1;
	/**
	 * Dans la grille le 2 sera un rond
	 */
	private final int ROND=2;
	/**
	 * ligne de la grille
	 */
	private int ligne;
	/**
	 * colonne de la grille
	 */
	private int colonne;
	/**
	 * déclaration de la grille
	 */
	private int [][] grille ;
	/**
	 * 
	 */
	public void position (int l,int c)
	{
		ligne=l;
		colonne=c;
		grille = new int [][];
	}
	
}
