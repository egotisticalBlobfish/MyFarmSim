/*Description: the public class farmer provides the computation of the farmer level,
 * display the farmer status,and the farm display
 Parameters:
*farmerName-is the string name for the farmer 
* farmerSeedsPerCrop- the integer array for the specific seed
* farmerTotalSeeds- the integer of total seeds equipped by the farmer
* farmerCoins-the integer of the total coins the farmer has 
* farmerExperience-the double of the experience points of the farmer
* farmerLevel-the integer of the level of the farmer
* farmerField-the double array of the  field of the farm
* farmerSeedList-the string array for the list of seeds
 */
public class Farmer {
    private String farmerName;
    private int[] farmerSeedsPerCrop;
    private int farmerTotalSeeds;
    private int farmerCoins;
    private double farmerExperience;
    private int farmerLevel;
    private int[][] farmerField;
    private String[] farmerSeedList;
    int i, j, k;

    int cropType;


    /* Methods */
    // Compute Farmer's Level
    public void computeFarmerLevel( ) {
        if(farmerExperience >= 0.0 && farmerExperience <= 99.9) {
            farmerLevel = 0;
        }
        else if(farmerExperience >= 100.0 && farmerExperience <= 199.9) {
            farmerLevel = 1;
        }
        else if( farmerExperience >= 200.0 && farmerExperience <= 299.9) {
            farmerLevel = 2;
        }
        else if( farmerExperience >= 300.0 && farmerExperience <= 399.9) {
            farmerLevel = 3;
        }
        else if( farmerExperience >= 400.0 && farmerExperience <= 499.9) {
            farmerLevel = 4;
        }
        else if( farmerExperience >= 500.0 && farmerExperience <= 599.9) {
            farmerLevel = 5;
        }
        else if( farmerExperience >= 600.0 && farmerExperience <= 699.9) {
            farmerLevel = 6;
        }
        else if( farmerExperience >= 700.0 && farmerExperience <= 799.9) {
            farmerLevel = 7;
        }
        else if( farmerExperience >= 800.0 && farmerExperience <= 899.9) {
            farmerLevel = 8;
        }
        else if( farmerExperience >= 900.0 && farmerExperience <= 999.9) {
            farmerLevel = 9;
        }
        else {
            farmerLevel = 10;
        }
    }

    // Displays the farmer's profile status
    public void displayFarmerProfileStatus( ) {
        System.out.println("Farmer's Profile");
        System.out.println("Farmer's Name: " + farmerName);
        System.out.println("Farmer's Seed List:");
        for(k=0; k<8; k++) {
            System.out.println("\t[" + k + "]" + farmerSeedList[k] + "\t: " + farmerSeedsPerCrop[k]);
        }

        System.out.println("Current no. of seeds: " + farmerTotalSeeds);
        System.out.println("Current ObjectCoins: " + farmerCoins);
        System.out.println("Current Experience: " + farmerExperience);
        System.out.println("Current Level: " + farmerLevel + "\n");
    }

    /*
        This function display the board
    */
    public void displayFarmField( Farm farm ) {
        System.out.println(farmerName + "'s Level: " + farmerExperience);
        System.out.println(farmerName + "'s Farm Field and Status" + "\n");

        System.out.println("0\t1\t2\t3\t4\t5\t");

        for( i=0; i<10; i++ ) {
            System.out.print((i + 1) + "\t");
            for( j=0; j<5; j++ ) {
                
                if(farm.getFarmField()[i][j] == 0) {        // Unplowed tile
                    System.out.print("---" + "\t");
                }
                else if(farm.getFarmField()[i][j] == 1){    // Plowed tile 
                    System.out.print("===" + "\t");   
                }
                else if(farm.getFarmField()[i][j] >= 20 && farm.getFarmField()[i][j] <= 27){
                    if(farm.getFarmField()[i][j] == 20) {   // Turnip plant
                        System.out.print("TUR" + "\t");   
                    }
                    else if(farm.getFarmField()[i][j] == 21) {  // Carrot plant
                        System.out.print("CAR" + "\t"); 
                    }
                    else if(farm.getFarmField()[i][j] == 22) {  // Potato plant
                        System.out.print("POT" + "\t"); 
                    }
                    else if(farm.getFarmField()[i][j] == 23) {  // Rose plant
                        System.out.print("ROS" + "\t"); 
                    }
                    else if(farm.getFarmField()[i][j] == 24) {  // Tulip plant
                        System.out.print("TUL" + "\t"); 
                    }
                    else if(farm.getFarmField()[i][j] == 25) {  // Sunflower plant
                        System.out.print("SUN" + "\t"); 
                    }
                    else if(farm.getFarmField()[i][j] == 26) {  // Mango plant
                        System.out.print("MAN" + "\t"); 
                    }
                    else if(farm.getFarmField()[i][j] == 27) {  // Apple plant
                        System.out.print("APP" + "\t"); 
                    }
                }
                else if(farm.getFarmField()[i][j] >= 30 && farm.getFarmField()[i][j] <= 37) {
                    if(farm.getFarmField()[i][j] == 30) {   // Turnip plant
                        System.out.print("TURW" + "\t");   
                    }
                    else if(farm.getFarmField()[i][j] == 31) {  // Carrot plant
                        System.out.print("CARW" + "\t"); 
                    }
                    else if(farm.getFarmField()[i][j] == 32) {  // Potato plant
                        System.out.print("POTW" + "\t"); 
                    }
                    else if(farm.getFarmField()[i][j] == 33) {  // Rose plant
                        System.out.print("ROSW" + "\t"); 
                    }
                    else if(farm.getFarmField()[i][j] == 34) {  // Tulip plant
                        System.out.print("TULW" + "\t"); 
                    }
                    else if(farm.getFarmField()[i][j] == 35) {  // Sunflower plant
                        System.out.print("SUNW" + "\t"); 
                    }
                    else if(farm.getFarmField()[i][j] == 36) {  // Mango plant
                        System.out.print("MANW" + "\t"); 
                    }
                    else if(farm.getFarmField()[i][j] == 37) {  // Apple plant
                        System.out.print("APPW" + "\t"); 
                    }
                }
                
            }
            System.out.println();
        }
    }

    /*
    public void displayFarmFieldStatus( Seeds seed ) {
        System.out.println("Crop Status Legends: ");
		System.out.println("\t[G] - Growing");
		System.out.println("\t[H] - Time to Harvest");
		System.out.println("\t[W] - Withered");

        System.out.println(farmerName + "'s Farm Field Status" + "\n");
        System.out.println("0\t1\t2\t3\t4\t5\t");

        for( i=0; i<10; i++ ) {
            System.out.print((i + 1) + "\t");
            for( j=0; j<5; j++ ) {
                if(seed.getSeedsCropStatus()[i][j] == 'x') {
                    System.out.println("x \t");
                }
                else if(seed.getSeedsCropStatus()[i][j] == 'G'){
                    System.out.println("G \t");
                }
                else if(seed.getSeedsCropStatus()[i][j] == 'H'){
                    System.out.println("H \t");
                }
                else if(seed.getSeedsCropStatus()[i][j] == 'T'){
                    System.out.println("T \t");
                }
            }
            System.out.println();
        }
    }
    */

    public void displayMarketTransaction( Market market ) {
        System.out.println(farmerName + "'s ObjectCoins: " + farmerCoins);
        System.out.println("You choose: [" + (market.getChoiceIndex() + 1) + "] " + market.getMarketSeeds()[market.getChoiceIndex()] + "!");
        System.out.println("Price: " + market.getMarketPrices()[market.getChoiceIndex()] + "g\n");
    }
 
    public void displayFarmWork( Tools tool ) {
        System.out.println("Equipment: \t" + tool.getToolList()[tool.getToolChoice()-1]);
        System.out.println("Cost of Usage: \t" + tool.getToolCostUsageList()[tool.getToolChoice()-1]);
        System.out.println("Experience Gain: \t" + tool.getToolExpGainList()[tool.getToolChoice()-1]);
        System.out.println("Current Object coins before work: " + tool.getToolObjectCoins() + "\n");
    }

    

    /* Getters and Setters */
    // Farmer's Name
    public void setFarmerName( String farmerName) {
        this.farmerName = farmerName;
    }

    public String getFarmerName( ) {
        return this.farmerName;
    }

    // Farmer's number of Seeds per Crop type
    public void setFarmerSeedsPerCrop( int[] farmerSeedsPerCrop ) {
        this.farmerSeedsPerCrop = farmerSeedsPerCrop;
    }

    public int[] getFarmerSeedsPerCrop( ) {
        return farmerSeedsPerCrop;
    }

    // Farmer's total number of seeds
    public void setFarmerTotalSeeds( int farmerTotalSeeds ) {
        this.farmerTotalSeeds = farmerTotalSeeds;
    }

    public int getFarmerTotalSeeds( ) {
        return farmerTotalSeeds;
    }

    // Farmer's coins
    public void setFarmerCoins( int farmerCoins ) {
        this.farmerCoins = farmerCoins;
    }

    public int getFarmerCoins( ) {
        return farmerCoins;
    }

    // Farmer's Experience
    public void setFarmerExperience( double farmerExperience ) {
        this.farmerExperience = farmerExperience;
    }

    public double getFarmerExperience( ) {
        return farmerExperience;
    }

    // Farmer's Level
    public void setFarmerLevel( int farmerLevel ) {
        this.farmerLevel = farmerLevel;
    }

    public int getFarmerLevel( ) {
        return farmerLevel;
    }

    // Farmer's field
    public void setFarmerField( int[][] farmerField) {
        this.farmerField = farmerField;
    }

    public int[][] getFarmerField( ) {
        return this.farmerField;
    }

    public void setFarmerSeedList( String[] farmerSeedList ) {
        this.farmerSeedList = farmerSeedList;
    }

    public String[] getFarmerSeedList( ) {
        return farmerSeedList;
    }

    

}
