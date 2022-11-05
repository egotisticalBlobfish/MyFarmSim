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
        System.out.println("\nWhat to do: ");
        System.out.println("\t[1] Check Farmer's Status");
        System.out.println("\t[2] View and Equip Tools");
        System.out.println("\t[3] Work on Farm");
        System.out.println("\t[4] Go To Market");
        System.out.println("\t[5] Sleep");
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
        
    }

    public static void displayMarketFlag( ) {
        System.out.println("\nMarket Transaction: ");
        System.out.println("\t[1] Buy Seeds");
        System.out.println("\t[2] Sell Crops");
    }


    public static void main(String[] args) {

        /***** Variable declaration and initialization ******/ 
        Scanner sc = new Scanner(System.in);     //open scanner function
        
        String strUserName;     // holds the user input name

        // Default values when starting the game
        int nDay = 0;
        int nSeeds = 0;
        int nObjectCoins = 100;
        double dFarmerLevel = 0.0d;
        int[][] arrFarmField = new int[10][5];
        int i, j;

        for( i=9; i>=0; i-- ) {
            for( j=0; j<5; j++ ) {
                arrFarmField[i][j] = 0;
            }
        }

        String[] arrSeeds= {"Turnip","Carrot","Potato","Rose","Tulips","Sunflower","Mango","Apple"};
		int[] arrPrices= {5, 10, 20, 5, 10, 20, 100, 200};


        // Non-default values
        int nChoiceWork;
        int nChoiceFarm;
        int nChoiceMarket;
        int nChoiceSeed;
        int nChoiceSell;

        int nPlowFieldRow;
        int nPlowFieldCol;

        int nBuySeeds;


        /***** Game Play ******/
        // Display Header
        Driver.displayHeader( );

        System.out.println("Enter you name: ");
        strUserName = sc.nextLine();    // get the player's name as farmer's name
        //sc.close();

        // Farmer
        Farmer farmerUser = new Farmer( );
        farmerUser.setFarmerName(strUserName); 
        farmerUser.setFarmerSeeds(nSeeds);
        farmerUser.setFarmerCoins(nObjectCoins);
        farmerUser.setFarmerLevel(dFarmerLevel);
        farmerUser.setFarmerField(arrFarmField);
        farmerUser.displayFarmerProfileStatus(farmerUser.getFarmerName(), farmerUser.getFarmerSeeds(), farmerUser.getFarmerCoins(), farmerUser.getFarmerLevel());

        // Farm
        Farm farmerField = new Farm( );
        farmerField.setFarmField(arrFarmField);
        
        farmerUser.displayFarmField(farmerField);

        // Market
        Market market = new Market( );

        


        do {
            // Ask user what to do:
            do {
                displayWorkFlag();
                nChoiceWork = sc.nextInt();
                //sc.close();

                switch(nChoiceWork) {
                    case 1:     System.out.println("You choose: [1] Check Farmer's Status");
                                farmerUser.displayFarmerProfileStatus(farmerUser.getFarmerName(), farmerUser.getFarmerSeeds(), farmerUser.getFarmerCoins(), farmerUser.getFarmerLevel());
                                break;
                    case 2:     System.out.println("You choose: [2] View and Equip Tools");
                                break;
                    case 3:     System.out.println("You choose: [3] Work on Farm");

                                do{
                                    displayFarmingFlag();
                                    nChoiceFarm = sc.nextInt();

                                    switch(nChoiceFarm) {
                                        case 1:     // Ask the user which tile to plow
                                                    System.out.println("You choose: [1] Plow a tile");
                                                    System.out.println("Choose a tile to plow: ");
                                                    System.out.println("Row (1 to 10): ");      // get the row
                                                    nPlowFieldRow = sc.nextInt();                   
                                                    System.out.println("Column (1 to 5): ");    // get the column
                                                    nPlowFieldCol = sc.nextInt();

                                                    // Set the farmer's level
                                                    dFarmerLevel = farmerUser.getFarmerLevel();
                                                    farmerField.setFarmLevel(dFarmerLevel);

                                                    // Set the farmer's fiel
                                                    arrFarmField = farmerUser.getFarmerField();
                                                    farmerField.setFarmField(arrFarmField);

                                                    // Call the farm class to plow a tile
                                                    farmerField.farmPlowFieldTile(nPlowFieldRow, nPlowFieldCol);
                                                    dFarmerLevel = farmerField.getFarmLevel();  // Get the new farmer's level after plowing
                                                    arrFarmField = farmerField.getFarmField();  // Get the new farmer's field after plowing

                                                    farmerUser.setFarmerLevel(dFarmerLevel);    // Set the new farmer's level after plowing
                                                    farmerUser.setFarmerField(arrFarmField);    // Set the new farmer's level after plowing
                                                    farmerUser.displayFarmField(farmerField);   // Display
                                                    break;
                                        case 2:     System.out.println("You choose: [2] Plant a seed in a tile");
                                                    break;
                                        case 3:     System.out.println("You choose: [3] Water a seed in a tile");
                                                    break;
                                        case 4:     System.out.println("You choose: [4] Fertilize a seed in a tile");
                                                    break;
                                        case 5:     System.out.println("You choose: [5] Harvest a crop in a tile");
                                                    break;
                                        case 6:     System.out.println("You choose: [6] Pickaxe a rock in a tile");
                                                    break;
                                        case 7:     System.out.println("You choose: [7] Shovel a withered crop in a tile");
                                                    break;
                                    }
                                    
                                }while(nChoiceFarm <= 0 || nChoiceFarm >= 8);

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
                                                System.out.println("\t[" + (i + 1) + "]" + arrSeeds[i] + "\tPrice: " + arrPrices[i] + "g");
                                            }
                                            
                                            nChoiceSeed = sc.nextInt();

                                        } while(nChoiceSeed <= 0 || nChoiceSeed >= 9);

                                        System.out.println("How many seeds would you like to buy?");
                                        System.out.println("No. of seeds: ");
                                        nBuySeeds = sc.nextInt();

                                        // Compute gold coins
                                        nObjectCoins = farmerUser.getFarmerCoins();
                                        nSeeds = farmerUser.getFarmerSeeds();
                                        market.setNTotalGoldCoins(nObjectCoins);
                                        market.setNTotalSeeds(nSeeds);
                                        market.setMarketSeeds(arrSeeds);
                                        market.setMarketPrices(arrPrices);
                                        market.setChoiceIndex(nChoiceSeed - 1);

                                        farmerUser.displayMarketTransaction(market);
                                        market.transactionBuySeeds( arrSeeds, arrPrices, nChoiceSeed - 1, nBuySeeds);
                                        
                                        nObjectCoins = market.getNTotalGoldCoins();
                                        farmerUser.setFarmerCoins(nObjectCoins);
                                        nSeeds = market.getNTotalSeeds();
                                        farmerUser.setFarmerSeeds(nSeeds);
                                        
                                        System.out.println("Current ObjectCoins: " + nObjectCoins + "g");
                                        System.out.println("Current no. of seeds: " + nSeeds);
                                    }
                                    else {
                                        System.out.println("You choose: [2] Sell Crops");
                                        nChoiceSell = 0;

                                        market.transactionSellCrops(arrSeeds, arrPrices, nChoiceSell);
                                    }
                                }while(nChoiceMarket != 1 && nChoiceMarket != 2);

                                break;
                    case 5:     System.out.println("You choose: [5] Sleep");
                                nDay++;
                                break;
                }
            }while(nChoiceWork <= 0 && nChoiceWork >= 6);

            
        } while( nDay != 2);

        sc.close();
    } // End of Main method

} // End of Driver class
