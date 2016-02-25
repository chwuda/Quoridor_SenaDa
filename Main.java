import java.util.Scanner;

class Main{

	//Number of players, +++We can make a new fonction later to ask for players 2 or 4
	private int playerCount;
	//Total walls for the game, which will be divided by the player count
	private static final int total_walls = 20;


	/*Scanner to get data input from user for the amount of players. Will work for later when we need
	to implement the functions to move Pawn and place walls.
	*/
	Scanner sc = new Scanner(System.in);
	//System.out.println("Enter how many players: (Only 2 valid):")
	//players = sc.nextInt();
	//sc.nextLine();


	public Main(){
		//We implement function for 2 players and maybe later for 4.
		while(this.playerCount != 1 || this.player != 2){
			System.out.println("Enter number of players: (1 or 2) ");
			this.playerCount = sc.nextInt();
			sc.nextLine();
		}

	}

}