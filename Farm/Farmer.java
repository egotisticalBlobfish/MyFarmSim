import java.util.Scanner;

public class Farmer {
    private String farmerName;
    private int farmerSeeds;
    private int farmerCoins;
    private int farmerLevel;
    //private int[][] farmerField;
    int i, j;

    int cropType;
    Scanner in = new Scanner(System.in);


    /* Methods */
    // Displays the farmer's profile status
    public void displayFarmerProfileStatus( String farmerName, int farmerSeeds, int farmerCoins, int farmerLevel ) {
        System.out.println("Farmer's Profile");
        System.out.println("Farmer's Name: " + farmerName);
        System.out.println("Current no. of seeds:" + farmerSeeds);
        System.out.println("Current ObjectCoins: " + farmerCoins);
        System.out.println("Current Level: " + farmerLevel);
    }

    /*
        This function display the board
    */
    public void displayFarmField( Farm farm ) {
        System.out.println(farm.getFarmName(farmerName) + "'s Farm Field"+ "\n");

        System.out.println("0\t1\t2\t3\t4\t5\t");

        for( i=0; i<10; i++ ) {
            System.out.print(i+1 + "\t");
            for( j=0; j<5; j++ ) {
                if(farm.getFarmField()[i][j] == 0) {   // if getArr[][] is false, print(-)
                    System.out.print(farm.getFarmField()[i][j] + "\t");
                }
            }
            System.out.println();
        }
    }

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

    // Farmer's number of Seeds
    public void setFarmerSeeds( int farmerSeeds ) {
        this.farmerSeeds = farmerSeeds;
    }

    public int getFarmerSeeds( ) {
        return farmerSeeds;
    }

    // Farmer's coins
    public void setFarmerCoins( int farmerCoins ) {
        this.farmerCoins = farmerCoins;
    }

    public int getFarmerCoins( ) {
        return farmerCoins;
    }

    // Farmer's level
    public void setFarmerLevel( int farmerLevel ) {
        this.farmerLevel = farmerLevel;
    }

    public int geFarmerLevel( ) {
        return farmerLevel;
    }

    /*
    // Farmer's field
    public void setFarmerField( int[][] farmerField) {
        this.farmerField = farmerField;
    }

    public int[][] getFarmerField( ) {
        return this.farmerField;
    }
    */

}
