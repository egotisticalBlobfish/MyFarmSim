import java.util.Random;

public class Farm {
    String[] farmSeedList;
    int[] farmSeedsPerCrop;
    int farmTotalSeeds;
    int farmObjectCoins;
    int[][] farmField;
    double farmExperience;
    double[] farmHarvestingExpGain;

    int[][] farmWateredCropsField;
    int[][] farmFertilizedCropsField;

    Random randGen = new Random();
    int farmNumProducts;
    int[] farmHarvestedCropList;      // stores the number of crops harvest per crop
    int i, j;


    /*
        This function identifies if the one of the tiles in the field is plowed
     */
    // Plowing
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

    // Planting
    public void farmPlantFieldTile( int nRow, int nCol, int choiceIndex ) {
        if(farmField[nRow-1][nCol-1] == 1) {    // (== 1) -- means the tile is plowed
            System.out.println("This tile is PLOWED: [" + (nRow) + "][" + (nCol)  + "]");
            System.out.println("Ready for planting!");

            if(farmTotalSeeds != 0) {
                System.out.println("Seed [" + choiceIndex + "]: " + farmSeedList[choiceIndex - 1] + "\tNo. of seed: " + farmSeedsPerCrop[choiceIndex - 1]);

                if(farmSeedsPerCrop[choiceIndex - 1] == 0) {
                    System.out.println("You have insufficient number of seeds!");
                }
                else {
                    System.out.println("You have sufficient number of seeds!");

                    farmSeedsPerCrop[choiceIndex - 1] = farmSeedsPerCrop[choiceIndex - 1] - 1;  // remove a seed
                    farmTotalSeeds = farmTotalSeeds - 1;
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

    // Watering
    public void farmWaterFieldTile( int nRow, int nCol, int nSeedIndex ) {
        System.out.println("A seed is planted here!");
        System.out.println("Planted Seed: " + farmSeedList[nSeedIndex-1] + "\n");

        switch( nSeedIndex - 1) {
            case 0:     farmField[nRow-1][nCol-1] = 30; // Turnip
                        break;
            case 1:     farmField[nRow-1][nCol-1] = 31; // Carrot
                        break; 
            case 2:     farmField[nRow-1][nCol-1] = 32; // Potato
                        break;
            case 3:     farmField[nRow-1][nCol-1] = 33; // Rose
                        break;
            case 4:     farmField[nRow-1][nCol-1] = 34; // Tulip
                        break;
            case 5:     farmField[nRow-1][nCol-1] = 35; // Sunflower
                        break;
            case 6:     farmField[nRow-1][nCol-1] = 36; // Mango
                        break;
            case 7:     farmField[nRow-1][nCol-1] = 37; // Apple
                        break;
        }
    }

    // Fertilizing
    public void farmFertilizeFieldTile( ) {
        System.out.println("A seed is planted here!");
    }
    
    // Harvesting
    public void farmHarvestFieldTile( int nSellIndex ) {
        System.out.println("A mature plant is ready to harvest here!");
        System.out.println("Mature crop: " + farmSeedList[nSellIndex]);

        switch( nSellIndex ) {
            case 0:     farmNumProducts = (1 + randGen.nextInt(2));
                        farmHarvestedCropList[nSellIndex] = farmHarvestedCropList[nSellIndex] + farmNumProducts; // Turnip
                        break;
            case 1:     farmNumProducts = (1 + randGen.nextInt(2));
                        farmHarvestedCropList[nSellIndex] = farmHarvestedCropList[nSellIndex] + farmNumProducts; // Carrot
                        break; 
            case 2:     farmNumProducts = (1 + randGen.nextInt(10));
                        farmHarvestedCropList[nSellIndex] = farmHarvestedCropList[nSellIndex] + farmNumProducts; // Potato
                        break;
            case 3:     farmNumProducts = 1;
                        farmHarvestedCropList[nSellIndex] = farmHarvestedCropList[nSellIndex] + farmNumProducts; // Rose
                        break;
            case 4:     farmNumProducts = 1;
                        farmHarvestedCropList[nSellIndex] = farmHarvestedCropList[nSellIndex] + farmNumProducts; // Tulip
                        break;
            case 5:     farmNumProducts = 1;
                        farmHarvestedCropList[nSellIndex] = farmHarvestedCropList[nSellIndex] + farmNumProducts; // Sunflower
                        break;
            case 6:     farmNumProducts = (5 + randGen.nextInt(15));           // tentative
                        farmHarvestedCropList[nSellIndex] = farmHarvestedCropList[nSellIndex] + farmNumProducts; // Mango
                        break;
            case 7:     farmNumProducts = (10 + randGen.nextInt(15));            // tentative
                        farmHarvestedCropList[nSellIndex] = farmHarvestedCropList[nSellIndex] + farmNumProducts; // Apple
                        break;
        }

        System.out.println("No. of Produced Crops: " + farmNumProducts);
    }

    // EXP in Harvesting
    public void computeHarvestingExperienceGain( int choiceIndex ) {
        farmExperience = farmExperience + farmHarvestingExpGain[choiceIndex];
    }

    // Set the harvested tile into a unplowed tile
    public void convertHarvestedTileToUnplowedTile( int nRow, int nCol ) {
        farmField[nRow-1][nCol-1] = 0;
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

    public void setFarmExperience( double farmExperience ) {
        this.farmExperience = farmExperience;
    }

    public double getFarmExperience( ) {
        return farmExperience;
    }

    public void setFarmHarvestingExpGain( double[] farmHarvestingExpGain ) {
        this.farmHarvestingExpGain = farmHarvestingExpGain;
    }

    public double[] getFarmHarvestingExpGain( ) {
        return farmHarvestingExpGain;
    }

    public void setFarmHarvestedCropList( int[] farmHarvestCropList ) {
        this.farmHarvestedCropList = farmHarvestCropList;
    }

    public int[] getFarmHarvestedCropList( ) {
        return farmHarvestedCropList;
    }
}
