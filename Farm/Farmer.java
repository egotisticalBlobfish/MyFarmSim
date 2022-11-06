public class Farmer {
    private String farmerName;
    private int[] farmerSeedsPerCrop;
    private int farmerTotalSeeds;
    private int farmerCoins;
    private double farmerLevel;
    private int[][] farmerField;
    private String[] farmerSeedList;
    int i, j, k;

    int cropType;


    /* Methods */
    // Displays the farmer's profile status
    public void displayFarmerProfileStatus( String farmerName, int[] farmerSeedsPerCrop, int farmerTotalSeeds, int farmerCoins, double farmerLevel ) {
        System.out.println("Farmer's Profile");
        System.out.println("Farmer's Name: " + farmerName);
        System.out.println("Farmer's Seed List:");
        for(k=0; k<8; k++) {
            System.out.println("\t[" + k + "]" + farmerSeedList[k] + "\t: " + farmerSeedsPerCrop[k]);
        }

        System.out.println("Current no. of seeds: " + farmerTotalSeeds);
        System.out.println("Current ObjectCoins: " + farmerCoins);
        System.out.println("Current Level: " + farmerLevel + "\n");
    }

    /*
        This function display the board
    */
    public void displayFarmField( Farm farm ) {
        System.out.println(farmerName + "'s Level: " + farm.getFarmLevel());
        System.out.println(farmerName + "'s Farm Field" + "\n");

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
                else {
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
                
            }
            System.out.println();
        }
    }

    //public void display

    public void displayMarketTransaction( Market market ) {
        System.out.println(farmerName + "'s ObjectCoins: " + farmerCoins);
        System.out.println("You choose: [" + (market.getChoiceIndex() + 1) + "] " + market.getMarketSeeds()[market.getChoiceIndex()] + "!");
        System.out.println("Price: " + market.getMarketPrices()[market.getChoiceIndex()] + "g\n");
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

    // Farmer's level
    public void setFarmerLevel( double farmerLevel ) {
        this.farmerLevel = farmerLevel;
    }

    public double getFarmerLevel( ) {
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
    

}
