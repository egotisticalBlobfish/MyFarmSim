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
        int nFarmerLevel = 0;
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
        int nChoiceMarket;
        int nChoiceSeed;


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
        farmerUser.setFarmerLevel(nFarmerLevel);
        farmerUser.displayFarmerProfileStatus(farmerUser.getFarmerName(), farmerUser.getFarmerSeeds(), farmerUser.getFarmerCoins(), farmerUser.geFarmerLevel());

        // Farm
        Farm farmerField = new Farm( );
        farmerField.setFarmName(strUserName);
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
                                farmerUser.displayFarmerProfileStatus(farmerUser.getFarmerName(), farmerUser.getFarmerSeeds(), farmerUser.getFarmerCoins(), farmerUser.geFarmerLevel());
                                break;
                    case 2:     System.out.println("You choose: [2] View and Equip Tools");
                                break;
                    case 3:     System.out.println("You choose: [3] Work on Farm");
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

                                            // Compute gold coins
                                            nObjectCoins = farmerUser.getFarmerCoins();
                                            market.setNTotalGoldCoins(nObjectCoins);
                                            market.setMarketSeeds(arrSeeds);
                                            market.setMarketPrices(arrPrices);
                                            market.setChoiceIndex(nChoiceSeed - 1);

                                            farmerUser.displayMarketTransaction(market);
                                            market.transactionBuySeeds( arrSeeds, arrPrices, nChoiceSeed - 1);
                                            
                                            nObjectCoins = market.getNTotalGoldCoins();
                                            farmerUser.setFarmerCoins(nObjectCoins);
                                            
                                            System.out.println("Current ObjectCoins: " + nObjectCoins);

                                        } while(nChoiceSeed <= 0 || nChoiceSeed >= 9);
                                    }
                                    else {
                                        System.out.println("You choose: [2] Sell Crops");
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
