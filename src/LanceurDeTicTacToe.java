
// TODO compléter le commentaire
/**
 * classe principale qui va lancer l'instance d'une partie de morpion 
 * @author vignandc
 */
public class LanceurDeTicTacToe
{
	
	// TODO compléter le commentaire
	/**
	 * constructeur
	 * @param args
	 */
	public static void main(String[]args)
	{
		System.out.println("creation d'une partie de TicTacToe");
		TicTacToe partieDeTicTacToe = new TicTacToe();
		System.out.println("demarage de la partie");
		partieDeTicTacToe.jouer();
		System.out.println("fin de la partie");
	}
}
