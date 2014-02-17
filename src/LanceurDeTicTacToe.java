
public class LanceurDeTicTacToe
{
	public static void main(string[]args)
	{
		System.out.println("creation d'une partie de TicTacToe");
		TicTacToe partieDeTicTacToe = new TicTacToe();
		System.out.println("demarage de la partie");
		partieDeTicTacToe.jouer();
		System.out.println("fin de la partie");
	}
}
