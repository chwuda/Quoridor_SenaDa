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
    private static final Location TOP = new Location(0, 8);//REMPLACER LES 0 ET LES 8 PAR DES VALEURS VARIABLES

     /**
     * la position initiale en bas
     */
    private static final Location BOT = new Location(16, 8);//REMPLACER LES 0 ET LES 8 PAR DES VALEURS VARIABLES

    /**
     * la position initiale à gauche
     */
    private static final Location LEFT = new Location(8, 0);//REMPLACER LES 0 ET LES 8 PAR DES VALEURS VARIABLES

    /**
     * la position initiale à droites
     */
    private static final Location RIGHT = new Location(8, 16);//REMPLACER LES 0 ET LES 8 PAR DES VALEURS VARIABLES

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
        int currentRow = this.playerLocation.getRow();
        int currentCol = this.playerLocation.getCol();
  
        List<Location> access = new ArrayList<Location>;
        
        Map<String, Location> neighbours = this.getAvailableNeighbours();

        for (map.entry<String, Location> entry: neighbours.entrySet()){
            String key = entry.hetKey();
            Location loc = entry.getValue();
            int row = loc.getRow();
            int col = loc.getCol();
            switch (key) {
                case "up" :

                    //ERREUR CAR BOARD N EXISTE PAS ENCORE. ON VERA QUAND ON AURA DECIDE DE L ORGANISATION
                    if (Board.getObjectOnTile(new Location(row-2,col)) instanceOf Player) {
                        if(Board.getObjectOnTile(new Location(row-3,col)).isActive()){
                            if (col < 16 && !(Board.getObjectOnTile(new Location(row-2,col+1)).isActive())) 
                                access.add(new Location(row-2,col+2)); //case à droite + REMPLACER 16 PAR UNE VALEUR VARIABLE
                            if (col > 0 && !(Board.getObjectOnTile(new Location(row-2,col-1)).isActive())) 
                                access.add(new Location(row-2,col-2)); //case à gauche
                        }else
                            access.add(new Location(row-3,col)));
                    }else
                        acces.add(loc);
                    break;
                case "right" :

                    break;
                case "down" :

                    break;
                case "left" :

                    break;
            }
        }
    }

  
    public Map<String, Location> getAvailableNeighbours(){
        int col = this.playerLocation.getCol();
        int row = this.playerLocation.getRow();

        Map<String, Location> neighbours = new HashMap<String, Location>(); 

        
        if (!this.isTopWallActive()) 
            neighbours.put("up", new Location(row-2,col)); // case au dessus

        if (!this.isRightWallActive()) 
            neighbours.put("right", new Location(row,col+2)); //case à droite + REMPLACER 16 PAR UNE VALEUR VARIABLE

        if (!this.isBotWallActive()) 
            neighbours.put("down", new Location(row+2,col));  //case en dessous + REMPLACER 16 PAR UNE VALEUR VARIABLE

        if (!this.isLeftWallActive()) 
            neighbours.put("left", new Location(row,col-2)); //case à gauche
        
        return neighbours;
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
     *          La position dans laquelle le joueur doit être déplacé
     */
    public boolean movePwanTo(Location loc){
        if this.canMoveTo(loc){

            if (loc.getRow() != 0)
                loc.setRow(loc.getRow()+1);
            if (loc.getCol() != 0)
                loc.setCol(loc.getCol()+1);
            this.playerLocation = new Location(loc.getRow(),loc.getCol);
            this.setAvailableLocations();

            return true;
        }
        return false;
    }


    //ICI PROBLEME CAR BOARD N EXISTE PAS ENCORE. ON VERA QUAND ON AURA DECIDE D UNE ORGANISATION
    public boolean isLeftWallActive(){
        int col = this.playerLocation.getCol();
        int row = this.playerLocation.getRow();

        if(col = 0) 
            return true;
        if(col > 0)
            return Board.getObjectOnTile(new Location(row,col-1)).isActive();

        return false;
    }

    public boolean isRightWallActive(){
        int col = this.playerLocation.getCol();
        int row = this.playerLocation.getRow();

        if(col = 16) 
            return true;
        if(col < 16)
            return Board.getObjectOnTile(new Location(row,col+1)).isActive();
        
        return false;
    }

    public boolean isTopWallActive(){
        int col = this.playerLocation.getCol();
        int row = this.playerLocation.getRow();

        if(row = 0) 
            return true;
        if(row > 0)
            return Board.getObjectOnTile(new Location(row-1,col)).isActive();
        
        return false;
    }

    public boolean isBotWallActive(){
        int col = this.playerLocation.getCol();
        int row = this.playerLocation.getRow();

        if(row = 16) 
            return true;
        if(row < 16)
            return Board.getObjectOnTile(new Location(row+1,col)).isActive();
        
        return false;
    }


}