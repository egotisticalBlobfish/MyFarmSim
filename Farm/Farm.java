public class Farm {
    int[][] farmField;
    double farmLevel;
    int i, j;


    /*
        This function identifies if the one of the tiles in the field is plowed
     */
    public void farmPlowFieldTile( int nRow, int nCol ) {
        if(farmField[nRow-1][nCol-1] == 0) {
            farmLevel = farmLevel + 0.5d;
            farmField[nRow-1][nCol-1] = 1;
            System.out.println("Add Level: 0.5");
            System.out.println("You plowed the tile: [" + nRow + "][" + nCol + "]");
        }
        else {
            System.out.println("This tile is has a plant: [" + nRow + "][" + nCol + "]");
        }
    }

    

    /*Getters and Setters */

    public void setFarmField( int[][] farmField ) {
        this.farmField = farmField;
    }

    public int[][] getFarmField( ) {
        return farmField;
    }

    public void setFarmLevel( double farmLevel ) {
        this.farmLevel = farmLevel;
    }

    public double getFarmLevel( ) {
        return farmLevel;
    }


}
