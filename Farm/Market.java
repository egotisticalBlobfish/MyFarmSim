import java.util.Scanner;

public class Market {
    private int nTotalGoldCoins;
    private String[] marketSeeds;
    private int[] marketPrices;
    private int choiceIndex;

    Scanner sc = new Scanner(System.in);

    /* Methods */

    public void transactionBuySeeds( String[] marketSeeds, int[] marketPrices, int choiceIndex ) {
        switch( choiceIndex ) {
            case 0:     System.out.println(marketSeeds[choiceIndex] + " is bought!");
                        nTotalGoldCoins = nTotalGoldCoins - marketPrices[choiceIndex];
                        break;

        }

    }

    /*Getters and Setters */
    public void setNTotalGoldCoins( int nTotalGoldCoins ) {
        this.nTotalGoldCoins = nTotalGoldCoins;
    }

    public int getNTotalGoldCoins() {
        return this.nTotalGoldCoins;
    }

    public void setMarketSeeds( String[] marketSeeds ) {
        this.marketSeeds = marketSeeds;
    }

    public String[] getMarketSeeds( ) {
        return marketSeeds;
    }

    public void setMarketPrices( int[] marketPrices ) {
        this.marketPrices = marketPrices;
    }

    public int[] getMarketPrices( ) {
        return marketPrices;
    }

    public void setChoiceIndex( int choiceIndex ) {
        this.choiceIndex = choiceIndex;
    }

    public int getChoiceIndex( ) {
        return choiceIndex;
    }
}
