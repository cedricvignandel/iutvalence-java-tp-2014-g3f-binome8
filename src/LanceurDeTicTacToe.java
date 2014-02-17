/**
 * 
 * @author vignandc
 *
 */
public class LanceurDeTicTacToe
{
	/**
	 * 
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
