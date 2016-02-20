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
     * La position Location du joueur
     */
    private Location playerLocation;

    /**
     * Nombre de murs qu'il reste au joueur
     */
    private int numWalls;

    /**
     * La positon initiale en haut
     */
    private static final Location TOP = new Location(0, 5);

     /**
     * la position initiale en bas
     */
    private static final Location BOT = new Location(9, 5);

    /**
     * la position initiale à gauche
     */
    private static final Location LEFT = new Location(5, 0);

    /**
     * la position initiale à droites
     */
    private static final Location RIGHT = new Location(5, 9);

    /**
     * Nombre de joueurs
     */
    private int numPlayers;

    /**
     * Tableau contenant toutes les les cases qu'un joueur peut atteindre à partir de la position où il se trouve
     */
    private Location[] availableLocations;

     /**
     * tableau des joueurs
     */
    //private Player[] playersArray;


    /**
     * Position initial en fonction du numéro du jouer
     */
    private static final Location[] INITIAL_LOCATIONS = { TOP, BOT, RIGHT, LEFT };


    /**
     * Construit un Player a partir du nombre de joueurs et du numéro du joueur
     * 
     * @param numPlayers
     *           nombre de joueurs
     * @param index
     *            numéro du joueur
     */
    public Player(int numPlayers, int index) {
        this.playerId = index;
    	this.setplayerLoc(INITIAL_LOCATIONS[index]);
        this.setNumWalls(TOTAL_WALLS / numPlayers);
    	
    }

    /**
     * Obtenir le nombre de murs qu'il reste au joueur
     * @return le nombre de murs qu'il reste au joueur
     */
    public int getNumWalls() {
	   return numWalls;
    }

    /**
     * Définir le nombre de murs qu'il reste au joueur
     * 
     * @param numWalls
     *            le nombre de murs qu'on veut donner au joueur
     */
    public void setNumWalls(int numWalls) {
	   this.numWalls = numWalls;
    }

    /**
     * Obtenir la position (Location) du joueur qui appartient a ce jouer.
     * 
     * @return L’objet Location (position) du joueur de ce jouer
     */
    public Location getplayerLoc() {
	   return playerLocation;
    }

    /**
     * Définir la position du joueur de ce joueur
     * 
     * @param playerLoc
     *            La nouvelle position (Location )
     */
    public void setplayerLoc(Location playerLoc) {
	   this.playerLocation = playerLoc;
    }


    /**
     *
     *
     *
     */
    private void setAvailableLocations(){
        for (int i = this.playerLocation.getRow()-2; i < this.playerLocation.getRow()+3; i++) {
            for (int j = this.playerLocation.getCol()-2; j <this.playerLocation.getCol()+3; j++) {
                
            }
        }
    }


    /**
     * Permet de savoir si ce joueur a gagné 
     *
     * @return true 
     *            si le joueur est le gagnant
     * @return false 
     *            sinon
     *
     */
    public boolean isWinner(){
        switch (INITIAL_LOCATIONS[this.playerId]) {
            case BOT:
                return this.playerLocation.rowEquals(TOP);
                break;
            case TOP:
                return this.playerLocation.rowEquals(BOT);
                break;
            case LEFT:
                return this.playerLocation.colEquals(RIGHT);
                break;
            case RIGHT:
                return this.playerLocation.colEquals(LEFT);
                break;   
        }
    }

    /**
    * Permet de connaître les case où ce joueur peut aller.
    *
    * @return un tableau d’objets Position dans les-quelles ce joueur peut se rendre. 
    */
    public boolean canMoveTo(Location loc) {
        return Arrays.asList(this.availableLocations).contains(loc);
    }

   /**
     * Déplacer le joueur vers une une nouvelle position si possible
     * 
     * @param loc
     *            La position dans laquelle le joueur doit être déplacé
     */
    public void movePwanTo(Location loc){
        if this.canMoveTo(loc){
            if (loc.getRow() != 0)
                loc.setRow(loc.getRow()+1);
            if (loc.getCol() != 0)
                loc.setCol(loc.getCol()+1);
            this.playerLocation = new Location(loc.getRow(),loc.getCol);
            this.setAvailableLocations();
        }
    }


}