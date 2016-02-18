class Board {

	/**
	* Nombre total de cases qui conposent le tablau. (murs compris)
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


}