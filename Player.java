public class Player {

    /**
    * Id du joueur
    */
    private int playerId;
    /**
     * Nombre total de murs
     */
    private static final int TOTAL_WALLS = 20;

    /**
     * La position Location du pion
     */
    private Location pawnLocation;

    /**
     * Nombre de murs qu'il reste au joueur
     */
    private int numWalls;

    /**
     * La positon initilae en haut
     */
    private static final Location TOP = new Location(0, 4);

     /**
     * la position initiale en bas
     */
    private static final Location BOT = new Location(8, 4);

    /**
     * la position initiale à gauche
     */
    private static final Location LEFT = new Location(4, 0);

    /**
     * la position initiale à droites
     */
    private static final Location RIGHT = new Location(4, 8);

    /**
     * Nombre de joueurs
     */
    private int numPlayers;

     /**
     * tableau des joueurs
     */
    //private Player[] playersArray;


    /**
     * Position initial en fontion du numero du jouer
     */
    private static final Location[] INITIAL_LOCATIONS = { TOP, BOT, RIGHT, LEFT };


    /**
     * Construit un Pawn a partir du nombre de joueurs et du numero du joueur
     * 
     * @param numPlayers
     *           nombre de joueurs
     * @param index
     *            numero du joueur
     */
    public winCondition(Location location){}

    public Player(int numPlayers, int index) {
        this.playerId = index;
    	this.setPawnLoc(INITIAL_LOCATIONS[index]);
        this.setNumWalls(TOTAL_WALLS / numPlayers);
    	
    }

    /**
     * Obternir le nombre de murs qu'il reste au joueur
     * @return le nombre de murs qu'il reste au joueur
     */
    public int getNumWalls() {
	   return numWalls;
    }

    /**
     * Définir le nombre de murs qu'il reste au joeur
     * 
     * @param numWalls
     *            le nombre de murs qu'on veut donner au joueur
     */
    public void setNumWalls(int numWalls) {
	   this.numWalls = numWalls;
    }

    /**
     * Obternir la ligne ou colonne gagante de ce joueur.
     * @return la ligne ou colonne gagante de ce joueur
     */
    public int getTargetEdge() {
	   return targetEdge;
    }

    /**
     * Obtenir la position (Location) du pion qui appartient a ce joeur.
     * 
     * @return L'object Location (postion) du pion de ce joeur
     */
    public Location getPawnLoc() {
	   return pawnLocation;
    }

    /**
     * Definir la position du pion de ce joeur
     * 
     * @param pawnLoc
     *            La nouvelle position (Location )
     */
    public void setPawnLoc(Location pawnLoc) {
	   this.pawnLocation = pawnLoc;
    }



    /**
    * 
    *
    *
    */
    public boolean isWinner(){
        switch (INITIAL_LOCATIONS[this.playerId]) {
            case BOT:
                return this.pawnLocation.rowEquals(TOP);
                break;
            case TOP:
                return this.pawnLocation.rowEquals(BOT);
                break;
            case LEFT:
                return this.pawnLocation.colEquals(RIGHT);
                break;
            case RIGHT:
                return this.pawnLocation.colEquals(LEFT);
                break;   
        }
    }


}