
public class Farm {
    String[] farmSeedList;
    int[] farmSeedsPerCrop;
    int farmTotalSeeds;
    int[][] farmField;
    double farmLevel;
    int i, j;


    /*
        This function identifies if the one of the tiles in the field is plowed
     */
    public void farmPlowFieldTile( int nRow, int nCol ) {
        if(farmField[nRow-1][nCol-1] == 0) {
            farmLevel = farmLevel + 0.5d;
            farmField[nRow-1][nCol-1] = 1;  // (== 1) -- means the tile is plowed
            System.out.println("Add Level: 0.5");
            System.out.println("You plowed the tile: [" + nRow + "][" + nCol + "]");
        }
        else if( farmField[nRow-1][nCol-1] == 1) {
            System.out.println("Tile: [" + nRow + "][" + nCol + "]");
            System.out.println("This tile is already plowed!\n");
        }
        else if(farmField[nRow-1][nCol-1] >= 21 && farmField[nRow-1][nCol-1] <= 27) {
            System.out.println("This tile is has a plant: [" + nRow + "][" + nCol + "]");
        }
    }

    
    public void farmPlantFieldTile( int nRow, int nCol, int choiceIndex ) {
        if(farmField[nRow-1][nCol-1] == 1) {    // (== 1) -- means the tile is plowed
            System.out.println("This tile is PLOWED: [" + (nRow) + "][" + (nCol)  + "]");
            System.out.println("This is ready for planting!");

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
                        case 0:     farmField[nRow-1][nCol-1] = 20;
                                    break;
                        case 1:     farmField[nRow-1][nCol-1] = 21;
                                    break;
                        case 2:     farmField[nRow-1][nCol-1] = 22;
                                    break;
                        case 3:     farmField[nRow-1][nCol-1] = 23;
                                    break;
                        case 4:     farmField[nRow-1][nCol-1] = 24;
                                    break;
                        case 5:     farmField[nRow-1][nCol-1] = 25;
                                    break;
                        case 6:     farmField[nRow-1][nCol-1] = 26;
                                    break;
                        case 7:     farmField[nRow-1][nCol-1] = 27;
                                    break;
                    }
                    
                } 
            }
            else {
                System.out.println("You have insuffient seed!\n");
            }
        }
        else {
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
