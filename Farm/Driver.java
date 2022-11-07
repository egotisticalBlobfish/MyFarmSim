/*
    Introductory Comment
*/

import java.util.Scanner;


public class Driver {
    
    public static void displayHeader( ) {
        System.out.println("Welcome to the game: My Farm!");
    }

    public static void displayWorkFlag( ) {
        // Ask user what to do:
        System.out.println("\nMain Menu: ");
        System.out.println("\t[1] Check Farmer's Status");
        System.out.println("\t[2] Display Farmer's Field");
        System.out.println("\t[3] Work on Farm");
        System.out.println("\t[4] Go To Market");
        System.out.println("\t[5] Advance to the Next Day: Sleep Now");
        //System.out.println("\t[6] Display Farmer's Field Status");
        System.out.println("\n\t[PRESS ANY KEY] Exit the Game");
    }

    public static void displayFarmingFlag() {
        //Ask user what to do in farm:
        System.out.println("\nWhat to do in Farm Field: ");
        System.out.println("\t[1] Plow a tile");
        System.out.println("\t[2] Plant a seed in a tile");
        System.out.println("\t[3] Water a seed in a tile");
        System.out.println("\t[4] Fertilize a seed in a tile");
        System.out.println("\t[5] Harvest a crop in a tile");
        System.out.println("\t[6] Pickaxe a rock in a tile");
        System.out.println("\t[7] Shovel a withered crop in a tile");
        System.out.println("\n\t[0] Back to Main Menu");
        
    }

    public static void displayMarketFlag( ) {
        System.out.println("\nMarket Transaction: ");
        System.out.println("\t[1] Buy Seeds");
        System.out.println("\t[2] Sell Crops");
        System.out.println("\n\t[0] Back to Main Menu");
    }


    public static void main(String[] args) {

        /***** Variable declaration and initialization ******/ 
        Scanner sc; 
        
        String strUserName;     // holds the user input name

        // Default values when starting the game
        int nDay = 1;
        int[] arrSeedsPerCrop = new int[8];
        int nTotalSeeds = 0;
        int nObjectCoins = 100;
        double dFarmerExperience = 0.0d;
        int nFarmerLevel = 0;
        int[][] arrFarmField = new int[10][5];
        int i, j, k;

        int[][] arrSeedsWaterCount = new int[10][5];				// Stores the amount how many times a crops was watered
	    int[][] arrSeedsFertilizerCount = new int[10][5];			// Stores the amount how many time a crop was fertilized
	    int[][] arrSeedsDaysGrowth = new int[10][5];				// Stores the days counts of a crop before the harvest
        char[][] arrSeedCropStatus = new char[10][5];

        double[] arrHarvestCropsList = new double[8];


        for( k=0; k<8; k++ ) {
            arrSeedsPerCrop[k] = 0;
            arrHarvestCropsList[k] = 0;
        }

        for( i=9; i>=0; i-- ) {
            for( j=0; j<5; j++ ) {
                arrFarmField[i][j] = 0;
                arrSeedsWaterCount[i][j] = 0;
                arrSeedsFertilizerCount[i][j] = 0;
                arrSeedsDaysGrowth[i][j] = 0;
                arrSeedCropStatus[i][j] = 'x';
            }
        }

        String[] arrSeedList = {"Turnip","Carrot","Potato","Rose","Tulips","Sunflower","Mango","Apple"};
		int[] arrPriceList = {5, 10, 20, 5, 10, 20, 100, 200};
        

        String[] arrToolList = {"Plow", "Plant", "Watering Can", "Fertilizer", "Harvest", "Pickaxe", "Shovel"};
        int[] arrToolCostUsage = {0, 0, 0, 10, 0, 50, 7};
        double[] arrToolExpGain = {0.5, 0.0, 0.5, 4.0, 0.0, 15.0, 2.0};

        double[] arrHarvestingExpGain = {5.0, 7.5, 12.5, 2.5, 5.0, 7.5, 25.0, 25.0};
        int[] arrHarvestTime = {2, 3, 5, 1, 2, 3, 10, 10};

        double[] arrSellingPrice = {6, 9, 3, 5, 9, 19, 8, 5};
        


        // Non-default values
        int nChoiceConfirmExit;
        int nChoiceWork;

        int nChoiceFarm;
        int nChoicePlow;
        int nChoiceWater;

        int nChoiceMarket;
        int nChoiceSeed;
        int nChoiceSell;

        int nPlowFieldRow;
        int nPlowFieldCol;

        int nPlantFieldRow;
        int nPlantFieldCol;
        int nChoicePlantSeed;

        int nSeedExist;
        int nSeedType;
        int nWaterFieldRow;
        int nWaterFieldCol;



        int nBuySeeds;
        sc = new Scanner(System.in);     //open scanner function


        /***** Game Play ******/
        // Display Header
        Driver.displayHeader( );

        System.out.println("Enter you name: ");
        strUserName = sc.nextLine();    // get the player's name as farmer's name
        

        // Farmer
        Farmer farmerUser = new Farmer( );
        farmerUser.setFarmerName(strUserName); 
        farmerUser.setFarmerSeedsPerCrop(arrSeedsPerCrop);
        farmerUser.setFarmerCoins(nObjectCoins);
        farmerUser.setFarmerExperience(dFarmerExperience);
        farmerUser.setFarmerLevel(nFarmerLevel);
        farmerUser.setFarmerField(arrFarmField);
        farmerUser.setFarmerSeedList(arrSeedList);
        

        // Farm
        Farm farmerField = new Farm( );
        farmerField.setFarmField(arrFarmField);
        farmerField.setFarmHarvestingExpGain(arrHarvestingExpGain);

        // Market
        Market market = new Market( );
        market.setMarketSeeds(arrSeedList);
        market.setMarketPrices(arrPriceList);

        // Tool
        Tools tool = new Tools( );
        tool.setToolList(arrToolList);
        tool.setToolCostUsageList(arrToolCostUsage);
        tool.setToolExpGainList(arrToolExpGain);

        // Seeds
        Seeds seed = new Seeds( );
        seed.setSeedsCropHarvestTime(arrHarvestTime);
        seed.setSeedsWaterCount(arrSeedsWaterCount);
        seed.setSeedsFertilizerCount(arrSeedsFertilizerCount);
        seed.setSeedsDayGrowth(arrSeedsDaysGrowth);
        seed.setSeedsCropStatus(arrSeedCropStatus);

        // Display
        farmerUser.displayFarmerProfileStatus( );
        farmerUser.displayFarmField(farmerField);


        do{ // loop for the whole game
            do{ // loop to ask the user what to do per day
                System.out.println("\n===== Day: " + nDay + " =====");

                displayWorkFlag();
                nChoiceWork = sc.nextInt();

                switch(nChoiceWork) {
                    case 1:     System.out.println("You choose: [1] Check Farmer's Status");
                                farmerUser.displayFarmerProfileStatus();
                                break;
                    case 2:     System.out.println("You choose: [2] Display Farmer's Field");
                                farmerUser.displayFarmField(farmerField);
                    case 3:     System.out.println("You choose: [3] Work on Farm");

                                do{
                                    displayFarmingFlag();
                                    nChoiceFarm = sc.nextInt();

                                    switch(nChoiceFarm) {
                                        case 1:     // Ask the user which tile to plow
                                                    System.out.println("You choose: [1] Plow a tile");

                                                    // Set the values
                                                    tool.setToolChoice(nChoiceFarm);
                                                    nObjectCoins = farmerUser.getFarmerCoins();
                                                    tool.setToolFarmerObjectCoins(nObjectCoins);

                                                    // Display
                                                    farmerUser.displayFarmWork(tool);

                                                    do{
                                                        System.out.println("Do you still want to proceed? ");
                                                        System.out.println("\t[1] YES" + "\t[0] NO\n");
                                                        nChoicePlow = sc.nextInt();

                                                    }while(nChoicePlow < 0 || nChoicePlow >= 2);
                                                    

                                                    if(nChoicePlow == 1) {
                                                        do{
                                                            System.out.println("Choose a tile to plow: ");
                                                            System.out.println("Row (1 to 10): ");      // get the row
                                                            nPlowFieldRow = sc.nextInt();                   
                                                            System.out.println("Column (1 to 5): ");    // get the column
                                                            nPlowFieldCol = sc.nextInt();

                                                        }while(nPlowFieldRow <= 0 || nPlowFieldRow >= 11 || nPlowFieldCol <= 0 || nPlowFieldCol >= 6);
                                                    

                                                        // Set the farmer's experience and level
                                                        dFarmerExperience = farmerUser.getFarmerExperience();
                                                        nFarmerLevel = farmerUser.getFarmerLevel();
                                                        tool.setToolFarmerExperience(dFarmerExperience);

                                                        // Set the farmer's field
                                                        arrFarmField = farmerUser.getFarmerField();
                                                        farmerField.setFarmField(arrFarmField);

                                                        // Call the farm class to plow a tile
                                                        farmerField.farmPlowFieldTile(nPlowFieldRow, nPlowFieldCol);
                                                        tool.toolComputeFarmerExperience();
                                                        tool.toolComputeFarmerObjectCoins();
                                                        farmerUser.computeFarmerLevel();

                                                        dFarmerExperience = tool.getToolFarmerExperience();   // Get the new farmer's level after plowing
                                                        nFarmerLevel = farmerUser.getFarmerLevel();
                                                        nObjectCoins = tool.getToolObjectCoins();
                                                        arrFarmField = farmerField.getFarmField();  // Get the new farmer's field after plowing
                                                    
                                                        // Set the new updated values
                                                        farmerUser.setFarmerExperience(dFarmerExperience);    // Set the new farmer's level after plowing
                                                        farmerUser.setFarmerLevel(nFarmerLevel);
                                                        farmerUser.setFarmerCoins(nObjectCoins);
                                                        farmerUser.setFarmerField(arrFarmField);    // Set the new farmer's level after plowing
                                                    
                                                        // Display farmer's updated profile
                                                        farmerUser.displayFarmField(farmerField);
                                                    }
                                                    else {
                                                        System.out.println("Back to Main Menu\n");
                                                    }
                                                    break;
                                        case 2:     System.out.println("You choose: [2] Plant a seed in a tile");
                                                    
                                                    // Start
                                                    do{ 
                                                        System.out.println("Choose a tile to plant: ");
                                                        System.out.println("Row (1 to 10): ");      // get the row
                                                        nPlantFieldRow = sc.nextInt();                   
                                                        System.out.println("Column (1 to 5): ");    // get the column
                                                        nPlantFieldCol = sc.nextInt();
                                                    }while(nPlantFieldRow <= 0 || nPlantFieldRow >= 11 || nPlantFieldCol <= 0 || nPlantFieldCol >= 6);

                                                    // Set the farmer's experience
                                                    dFarmerExperience = farmerUser.getFarmerExperience();
                                                    farmerField.setFarmExperience(dFarmerExperience);


                                                    // Set the farmer's field
                                                    arrFarmField = farmerUser.getFarmerField();
                                                    farmerField.setFarmField(arrFarmField);

                                                    // Set the farmer's seeds per crop
                                                    arrSeedsPerCrop = farmerUser.getFarmerSeedsPerCrop();
                                                    farmerField.setFarmSeedsPerCrop(arrSeedsPerCrop);

                                                    // Set total number of farmer's seeds
                                                    nTotalSeeds = farmerUser.getFarmerTotalSeeds();
                                                    farmerField.setFarmTotalSeeds(nTotalSeeds);

                                                    // Set the seeds list
                                                    farmerField.setFarmSeedList(arrSeedList);
                                                    
                                                    do {
                                                        System.out.println("Which seed would you like to plant?");
                                                        System.out.println("Seed Inventory: ");

                                                        for(i=0; i<8; i++) {
                                                            System.out.println("\t[" + (i + 1) + "]" + arrSeedList[i] + "\t: " + arrSeedsPerCrop[i]);
                                                        }
                                                    
                                                        nChoicePlantSeed = sc.nextInt();
                                                    }while( nChoicePlantSeed <= 0 && nChoicePlantSeed >= 9);
                                                    
                                                    // Call the farm class to plant a crop in a tile
                                                    farmerField.farmPlantFieldTile(nPlantFieldRow, nPlantFieldCol, nChoicePlantSeed);
                                                    
                                                    
                                                    // Get the new updated values
                                                    arrSeedsPerCrop = farmerField.getFarmSeedsPerCrop();
                                                    farmerUser.setFarmerSeedsPerCrop(arrSeedsPerCrop);

                                                    nTotalSeeds = farmerField.getFarmTotalSeeds();
                                                    farmerUser.setFarmerTotalSeeds(nTotalSeeds);

                                                    arrFarmField = farmerField.getFarmField();
                                                    farmerUser.setFarmerField(arrFarmField);
                                                    
                                                    // Display Farmer's updated profile
                                                    farmerUser.displayFarmField(farmerField);
                                                    break;
                                        case 3:     System.out.println("You choose: [3] Water a seed in a tile");
                                                    
                                                    // Set the values
                                                    tool.setToolChoice(nChoiceFarm);
                                                    nObjectCoins = farmerUser.getFarmerCoins();
                                                    tool.setToolFarmerObjectCoins(nObjectCoins);

                                                    // Display
                                                    farmerUser.displayFarmWork(tool);

                                                    do{
                                                        System.out.println("Do you still want to proceed? ");
                                                        System.out.println("\t[1] YES" + "\t[0] NO\n");
                                                        nChoiceWater = sc.nextInt();

                                                    }while(nChoiceWater < 0 || nChoiceWater >= 2);

                                                    if(nChoiceWater == 1) {
                                                        
                                                        // Display field
                                                        farmerUser.displayFarmField(farmerField);

                                                        do{ 
                                                            System.out.println("Choose a tile with seed/crop to water: ");
                                                            System.out.println("Row (1 to 10): ");      // get the row
                                                            nWaterFieldRow = sc.nextInt();                   
                                                            System.out.println("Column (1 to 5): ");    // get the column
                                                            nWaterFieldCol = sc.nextInt();
                                                        }while(nWaterFieldRow <= 0 || nWaterFieldRow >= 11 || nWaterFieldCol <= 0 || nWaterFieldCol >= 6);

                                                        // Set the farmer's field
                                                        arrFarmField = farmerUser.getFarmerField();
                                                        seed.setSeedsFarmField(arrFarmField);
                                                        
                                                        // Call the seed class to identify if there's a seed planted
                                                        nSeedExist = seed.checkSeedExist(nWaterFieldRow, nWaterFieldCol);

                                                        if( nSeedExist == 1 ) {     // A Seed exist
                                                            // Call the seed class to identify 
                                                            nSeedType = seed.seedIdentifyCrop(farmerUser, nWaterFieldRow, nWaterFieldCol);
                                                            farmerField.farmWaterFieldTile(nWaterFieldRow, nWaterFieldCol, nSeedExist);


                                                            // Set the farmer's experience and level
                                                            dFarmerExperience = farmerUser.getFarmerExperience();
                                                            nFarmerLevel = farmerUser.getFarmerLevel();
                                                            tool.setToolFarmerExperience(dFarmerExperience);
                                                            

                                                            // Set the values
                                                            arrSeedsWaterCount = seed.getSeedsWaterCount();     // water count only changes in seed class
                                                            seed.setSeedsWaterCount(arrSeedsWaterCount);
                                                            seed.setSeedsDayGrowth(arrSeedsDaysGrowth);         // seed growth only changes in driver class

                                                            // Call the seed class to water the seed in a tile
                                                            seed.seedsWatering(nWaterFieldRow, nWaterFieldCol);
                                                            seed.seedIdentifyCropStatus(farmerUser, nWaterFieldRow, nWaterFieldCol, nSeedType);

                                                            // insert here
                                                            tool.toolComputeFarmerExperience();
                                                            tool.toolComputeFarmerObjectCoins();
                                                            farmerUser.computeFarmerLevel();

                                                            dFarmerExperience = tool.getToolFarmerExperience();   // Get the new farmer's level after watering
                                                            nFarmerLevel = farmerUser.getFarmerLevel();
                                                            nObjectCoins = tool.getToolObjectCoins();
                                                            arrFarmField = farmerField.getFarmField();  // Get the new farmer's field after watering

                                                            // Set the new updated values
                                                            farmerUser.setFarmerExperience(dFarmerExperience);    // Set the new farmer's level after plowing
                                                            farmerUser.setFarmerLevel(nFarmerLevel);
                                                            farmerUser.setFarmerCoins(nObjectCoins);
                                                            farmerUser.setFarmerField(arrFarmField);    // Set the new farmer's level after plowing
                                                    
                                                            // Display farmer's updated profile
                                                            farmerUser.displayFarmField(farmerField);
                                                        }
                                                        else {
                                                            System.out.println("Back to Main Menu\n");
                                                        }

                                                    }
                                                    else {      // No seed exist
                                                        System.out.println("No seed is planted here!\n");
                                                    }
                                                    break;
                                        case 4:     System.out.println("You choose: [4] Fertilize a seed in a tile");

                                                    // call the Seeds.java class
                                                    break;
                                        case 5:     System.out.println("You choose: [5] Harvest a crop in a tile");

                                                    // call the Seeds.java class
                                                    break;
                                        case 6:     System.out.println("You choose: [6] Pickaxe a rock in a tile");
                                                    // Call the Farm.java class
                                                    break;
                                        case 7:     System.out.println("You choose: [7] Shovel a withered crop in a tile");
                                                    // Call the Seeds.java class
                                                    break;
                                        case 0:     System.out.println("You choose: [0] Back to Main Menu");
                                                    break;
                                    }
                                    
                                }while(nChoiceFarm < 0 || nChoiceFarm >= 8);

                                break;
                    case 4:     System.out.println("You choose: [4] Go To Market");
                                
                                do{ 
                                    displayMarketFlag();
                                    nChoiceMarket = sc.nextInt();

                                    if(nChoiceMarket == 1) {
                                        System.out.println("You choose: [1] Buy Seeds");

                                        do {
                                            System.out.println("\nChoose a seed: ");

                                            // Display seeds and prices
                                            for(i=0; i<8; i++) {
                                                System.out.println("\t[" + (i + 1) + "]" + arrSeedList[i] + "\tPrice: " + arrPriceList[i] + "g");
                                            }
                                            
                                            nChoiceSeed = sc.nextInt();

                                        } while(nChoiceSeed <= 0 || nChoiceSeed >= 9);

                                        System.out.println("How many seeds would you like to buy?");
                                        System.out.println("No. of seeds: ");
                                        nBuySeeds = sc.nextInt();

                                        // Compute gold coins
                                        nObjectCoins = farmerUser.getFarmerCoins();
                                        arrSeedsPerCrop = farmerUser.getFarmerSeedsPerCrop();
                                        market.setNTotalGoldCoins(nObjectCoins);
                                        market.setNTotalNumSeeds(nTotalSeeds);
                                        market.setNSeedPerCrop(arrSeedsPerCrop);
                                        market.setChoiceIndex(nChoiceSeed - 1);

                                        farmerUser.displayMarketTransaction(market);
                                        market.transactionBuySeeds( arrSeedList, arrPriceList, nChoiceSeed - 1, nBuySeeds);
                                        
                                        nObjectCoins = market.getNTotalGoldCoins();
                                        farmerUser.setFarmerCoins(nObjectCoins);

                                        nTotalSeeds = market.getNTotalNumSeeds();
                                        farmerUser.setFarmerTotalSeeds(nTotalSeeds);
                                        
                                        arrSeedsPerCrop = market.getNSeedPerCrop();
                                        farmerUser.setFarmerSeedsPerCrop(arrSeedsPerCrop);
                                        
                                        nTotalSeeds = farmerUser.getFarmerTotalSeeds();
                                        
                                        System.out.println("Current ObjectCoins: " + nObjectCoins + "g");
                                        System.out.println("Current no. of seeds: " + nTotalSeeds);
                                    }
                                    else if(nChoiceMarket == 2) {
                                        System.out.println("You choose: [2] Sell Crops");
                                        nChoiceSell = 0;

                                        market.transactionSellCrops(arrSeedList, arrPriceList, nChoiceSell);
                                    }
                                    else if(nChoiceMarket == 0) {
                                        System.out.println("You choose: [0] Back to Main Menu");
                                    }
                                }while(nChoiceMarket < 0 || nChoiceMarket >= 3);

                                break;
                    case 5:     System.out.println("You choose: [5] Advance to the Next Day: Sleep Now");
                                nDay++;
                                arrFarmField = farmerUser.getFarmerField();
                                arrSeedsDaysGrowth = seed.getSeedsDaysGrowth();

                                for( i=9; i>=0; i-- ) {
                                    for( j=0; j<5; j++ ) {
                                        if(arrFarmField[i][j] >= 20 && arrFarmField[i][j] <= 37) {
                                            arrSeedsDaysGrowth[i][j]++;
                                        }
                                    }
                                }

                                seed.setSeedsDayGrowth(arrSeedsDaysGrowth);

                                break;
                    /*
                    case 6:     System.out.println("You choose: [6] Display Farmer's Field Status");
                                arrSeedCropStatus = seed.getSeedsCropStatus();
                                farmerUser.displayFarmFieldStatus(seed);
                                break;
                    */
                    default:    System.out.println("You choose: [ANY KEY] Exit the Game");
                                break;            
                }   

            }while(nChoiceWork >=1 && nChoiceWork <= 5);

            System.out.println("\nAre you sure you want to 'EXIT' the game?");
            System.out.println("WARNING: Exiting the Game DOESN'T SAVE the game progress!");
            System.out.println("\n\t[0] - Exit the Game \t[1] - Resume the Game");
            nChoiceConfirmExit = sc.nextInt();
            
        } while(nChoiceConfirmExit != 0);

        System.out.println("Hope you enjoyed the game: MyFarm!");
        System.out.println("Thank you!");

        sc.close();
    } // End of Main method

} // End of Driver class
