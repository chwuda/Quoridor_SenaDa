
public class Location{

    /**
    *
    */
    private int row, col;


    /**
     * Construit un object Location a partir du numero de la colonne et de la ligne
     * 
     * @param row
     *           numero de la ligne
     * @param col
     *           numero de la colonne
     */
    public Location(int row, int col) {
		this.row = row;
		this.col = col;
    }

    /**
     * Obternir la ligne 
     * @return la ligne 
     */
    public int getRow() {
		return row;
    }

    /**
     * Définir la ligne
     * 
     * @param row
     *            numero de la ligne
     */
    public void setRow(int row) {
		this.row = row;
    }

     /**
     * Obternir la colonne 
     * @return la colonne 
     */
    public int getCol() {
		return col;
    }

    /**
     * Définir la colonce
     * 
     * @param col
     *            numero de la colonne
     */
    public void setCol(int col) {
		this.col = col;
    }


    public String toString() {
		return "Ligne: " + getRow() + ", Collone: " + getCol();
    }

    /**
     * Vérifie si deux positions sont égales
     * 
     * @param obj
     *            object de type Location qu'on veut comparer
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

}
