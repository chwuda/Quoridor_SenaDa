
public class Location{

    /**
    *
    */
    private int row, col;


    /**
     * Construit un objet Location a partir du numéro de la colonne et de la ligne
     * 
     * @param row
     *           numéro de la ligne
     * @param col
     *           numéro de la colonne
     */
    public Location(int row, int col) {
		this.row = row;
		this.col = col;
    }

    /**
     * Obtenir la ligne 
     * @return la ligne 
     */
    public int getRow() {
		return row;
    }

    /**
     * Définir la ligne
     * 
     * @param row
     *            numéro de la ligne
     */
    public void setRow(int row) {
		this.row = row;
    }

     /**
     * Obtenir la colonne 
     * @return la colonne 
     */
    public int getCol() {
		return col;
    }

    /**
     * Définir la colonne
     * 
     * @param col
     *            numéro de la colonne
     */
    public void setCol(int col) {
		this.col = col;
    }


    public String toString() {
		return "Ligne: " + getRow() + ", Colonne: " + getCol();
    }

    /**
     * Vérifie si deux positions sont égales
     * 
     * @param obj
     *            objet de type Location qu'on veut comparer
     * @return true 
     *            si les deux positions sont les mêmes
     * @return false 
     *            si les deux positions sont différentes
     */
    public boolean equals(Location loc) {
		return loc.getRow() == getRow() && loc.getCol() == getCol();
    }


    public boolean rowEquals(Location loc){
        return loc.row() == this.row();
    }


    public boolean colEquals(Location loc){
        return loc.col() == this.col();
    }

    // public Location above(){
    //     if(this.row > 0) 
    //          return new Location(this.row +1, this.col);
    //     else
    //          return this;
    // }

    // public Location below(){
    //     if(this.row < 16) 
    //          return new Location(this.row -1, this.col);
    //     else
    //          return this;
    // }

    // public Location toTheLeft(){
    //     if(this.col > 0) 
    //          return new Location(this.row, this.col+1);
    //     else
    //          return this;
    // }

    // public Location toTheRight(){
    //     if(this.col < 16) 
    //          return new Location(this.row, this.col-1);
    //     else
    //          return this;
    // }
}
