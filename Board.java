class Board {

	/**
	* Nombre total de cases qui composent le tableau. (murs compris)
	*/
	private int width;

	/**
	* Grille du jeu
	*/
	private Objet[][] boardArray;

	/**
     * Construit un objet Board a partir du nombre de lignes (cases uniquement) et du nombre de colonnes (cases uniquement)
     * 
     * @param numRows
     *           nombre de lignes
     * @param numCols
     *           nombre de colonnes
     */
	public void Board(int numRows, int numCols){

		this.width = 2*numRows -1;
		this.boardArray = new Objet[this.width][this.width];
	}

	public Object getObjectOnTile(Location loc){
		return this.boardArray[loc.getRow()][loc.getCol()];
	}

	public boolean putWall(Location loc, boolean isHorizontal){
		int row = col.getRow();
		int col = col.getCol();
		if (isHorizontal) {
			if (this.getObjectOnTile(loc).isInactive() && this.getObjectOnTile(new Location(row,col+2)).isInactive()) {
				this.getObjectOnTile(loc).setActive();
				this.getObjectOnTile(new Location(row,col+2)).setActive();

				return true;
			}
		}else{
			if (this.getObjectOnTile(loc).isInactive() && this.getObjectOnTile(new Location(row+2,col)).isInactive()) {
				this.getObjectOnTile(loc).setActive();
				this.getObjectOnTile(new Location(row+2,col)).setActive();

				return true;
			}
		}
		return false;
	}

	public int getWidth(){
		return this.width;
	}


	public Object getObjectOnTile(Location loc){
		return this.boardArray[loc.getRow()][loc.getCol()];
	}

	public boolean putWall(Location loc, boolean isHorizontal){
		int row = col.getRow();
		int col = col.getCol();
		if (isHorizontal) {
			if (this.getObjectOnTile(loc).isInactive() && this.getObjectOnTile(new Location(row,col+2)).isInactive()) {
				this.getObjectOnTile(loc).setActive();
				this.getObjectOnTile(new Location(row,col+2)).setActive();

				return true;
			}
		}else{
			if (this.getObjectOnTile(loc).isInactive() && this.getObjectOnTile(new Location(row+2,col)).isInactive()) {
				this.getObjectOnTile(loc).setActive();
				this.getObjectOnTile(new Location(row+2,col)).setActive();

				return true;
			}
		}
		return false;
	}

	public int getWidth(){
		return this.width;
	}


}