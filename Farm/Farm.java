
public class Farm {
    String[] farmSeedList;
    int[] farmSeedsPerCrop;
    int farmTotalSeeds;
    int farmObjectCoins;
    int[][] farmField;
    double farmLevel;
    int i, j;


    /*
        This function identifies if the one of the tiles in the field is plowed
     */
    public void farmPlowFieldTile( int nRow, int nCol ) {
        if(farmField[nRow-1][nCol-1] == 0) {
            farmField[nRow-1][nCol-1] = 1;  // (== 1) -- means the tile is done plowing

            System.out.println("You plowed the tile: [" + nRow + "][" + nCol + "]\n");
        }
        else if( farmField[nRow-1][nCol-1] == 1) {  // tile is already plowed
            System.out.println("Tile: [" + nRow + "][" + nCol + "]");
            System.out.println("This tile is already plowed!\n");
        }
        else if(farmField[nRow-1][nCol-1] >= 21 && farmField[nRow-1][nCol-1] <= 27) {
            System.out.println("This tile is has a plant: [" + nRow + "][" + nCol + "]\n");
        }
    }

    
    public void farmPlantFieldTile( int nRow, int nCol, int choiceIndex ) {
        if(farmField[nRow-1][nCol-1] == 1) {    // (== 1) -- means the tile is plowed
            System.out.println("This tile is PLOWED: [" + (nRow) + "][" + (nCol)  + "]");
            System.out.println("Ready for planting!");

            if(farmTotalSeeds != 0) {

                if(farmSeedsPerCrop[choiceIndex - 1] == 0) {
                    System.out.println("Seed [" + choiceIndex + "]: " + farmSeedList[choiceIndex - 1] + "\tNo. of seed: " + farmSeedsPerCrop[choiceIndex - 1]);
                    System.out.println("You have insufficient number of seeds!");
                }
                else {
                    System.out.println("Seed [" + choiceIndex + "]: " + farmSeedList[choiceIndex - 1] + "\tNo. of seed: " + farmSeedsPerCrop[choiceIndex - 1]);
                    System.out.println("You have sufficient number of seeds!");

                    farmSeedsPerCrop[choiceIndex - 1] = farmSeedsPerCrop[choiceIndex - 1] - 1;
                    System.out.println("You planted a " + farmSeedList[choiceIndex - 1] + "!");
                    System.out.println("Remaining " + farmSeedList[choiceIndex - 1] + " seed: " + farmSeedsPerCrop[choiceIndex - 1]);

                    
                    switch(choiceIndex - 1) {
                        case 0:     farmField[nRow-1][nCol-1] = 20; // Turnip
                                    break;
                        case 1:     farmField[nRow-1][nCol-1] = 21; // Carrot
                                    break; 
                        case 2:     farmField[nRow-1][nCol-1] = 22; // Potato
                                    break;
                        case 3:     farmField[nRow-1][nCol-1] = 23; // Rose
                                    break;
                        case 4:     farmField[nRow-1][nCol-1] = 24; // Tulip
                                    break;
                        case 5:     farmField[nRow-1][nCol-1] = 25; // Sunflower
                                    break;
                        case 6:     farmField[nRow-1][nCol-1] = 26; // Mango
                                    break;
                        case 7:     farmField[nRow-1][nCol-1] = 27; // Apple
                                    break;
                    }
                    
                } 
            }
            else {  // Insufficient number of chosen seed
                System.out.println("You have insuffient seed!\n");
            }
        }
        else {  // Tile unplowed
            System.out.println("This tile is NOT READY for planting: [" + nRow + "][" + nCol + "]\n");
        }
    }
    

    

    /*Getters and Setters */
    public void setFarmSeedList( String[] farmSeedList ) {
        this.farmSeedList = farmSeedList;
    }

    public void setFarmSeedsPerCrop( int[] farmSeedsPerCrop ) {
        this.farmSeedsPerCrop = farmSeedsPerCrop;
    }

    public int[] getFarmSeedsPerCrop( ) {
        return farmSeedsPerCrop;
    }

    public void setFarmTotalSeeds( int farmTotalSeeds ) {
        this.farmTotalSeeds = farmTotalSeeds;
    }

    public int getFarmTotalSeeds( ) {
        return farmTotalSeeds;
    }
    

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
