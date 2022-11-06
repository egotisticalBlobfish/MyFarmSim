

public class Market {
    private int nTotalGoldCoins;
    private int[] nSeedPerCrop;
    private int nTotalNumSeeds;
    private String[] marketSeeds;
    private int[] marketPrices;
    private int choiceIndex;

    
    /* Methods */

    public void transactionBuySeeds( String[] marketSeeds, int[] marketPrices, int choiceIndex, int nPurchaseSeeds) {
        switch( choiceIndex ) {
            case 0:     nTotalGoldCoins = nTotalGoldCoins - (marketPrices[choiceIndex] * nPurchaseSeeds);
                        if(nTotalGoldCoins > 0) {
                            System.out.println(marketSeeds[choiceIndex] + " is bought!");
                            System.out.println("Total purchase price: " + (marketPrices[choiceIndex] * nPurchaseSeeds) + "g");
                        }
                        else {
                            System.out.println("Insuffifient Objectcoins!\n");
                        }

                        nSeedPerCrop[choiceIndex] = nSeedPerCrop[choiceIndex] + nPurchaseSeeds;
                                                
                        break;
            case 1:     nTotalGoldCoins = nTotalGoldCoins - (marketPrices[choiceIndex] * nPurchaseSeeds);
                        System.out.println(marketSeeds[choiceIndex] + " is bought!");
                        System.out.println("Total purchase price: " + (marketPrices[choiceIndex] * nPurchaseSeeds) + "g");
                        nSeedPerCrop[choiceIndex] = nSeedPerCrop[choiceIndex] + nPurchaseSeeds;
                        break;
            case 2:     nTotalGoldCoins = nTotalGoldCoins - (marketPrices[choiceIndex] * nPurchaseSeeds);
                        System.out.println(marketSeeds[choiceIndex] + " is bought!");
                        System.out.println("Total purchase price: " + (marketPrices[choiceIndex] * nPurchaseSeeds) + "g");
                        nSeedPerCrop[choiceIndex] = nSeedPerCrop[choiceIndex] + nPurchaseSeeds;
                        break;
            case 3:     nTotalGoldCoins = nTotalGoldCoins - (marketPrices[choiceIndex] * nPurchaseSeeds);
                        System.out.println(marketSeeds[choiceIndex] + " is bought!");
                        System.out.println("Total purchase price: " + (marketPrices[choiceIndex] * nPurchaseSeeds) + "g");
                        nSeedPerCrop[choiceIndex] = nSeedPerCrop[choiceIndex] + nPurchaseSeeds;
                        break;
            case 4:     nTotalGoldCoins = nTotalGoldCoins - (marketPrices[choiceIndex] * nPurchaseSeeds);
                        System.out.println(marketSeeds[choiceIndex] + " is bought!");
                        System.out.println("Total purchase price: " + (marketPrices[choiceIndex] * nPurchaseSeeds) + "g");
                        nSeedPerCrop[choiceIndex] = nSeedPerCrop[choiceIndex] + nPurchaseSeeds;
                        break;
            case 5:     nTotalGoldCoins = nTotalGoldCoins - (marketPrices[choiceIndex] * nPurchaseSeeds);
                        System.out.println(marketSeeds[choiceIndex] + " is bought!");
                        System.out.println("Total purchase price: " + (marketPrices[choiceIndex] * nPurchaseSeeds) + "g");
                        nSeedPerCrop[choiceIndex] = nSeedPerCrop[choiceIndex] + nPurchaseSeeds;
                        break;
            case 6:     nTotalGoldCoins = nTotalGoldCoins - (marketPrices[choiceIndex] * nPurchaseSeeds);
                        System.out.println(marketSeeds[choiceIndex] + " is bought!");
                        System.out.println("Total purchase price: " + (marketPrices[choiceIndex] * nPurchaseSeeds) + "g");
                        nSeedPerCrop[choiceIndex] = nSeedPerCrop[choiceIndex] + nPurchaseSeeds;
                        break;
            case 7:     nTotalGoldCoins = nTotalGoldCoins - (marketPrices[choiceIndex] * nPurchaseSeeds);
                        System.out.println(marketSeeds[choiceIndex] + " is bought!");
                        System.out.println("Total purchase price: " + (marketPrices[choiceIndex] * nPurchaseSeeds) + "g");
                        nSeedPerCrop[choiceIndex] = nSeedPerCrop[choiceIndex] + nPurchaseSeeds;
                        break;

        }

        nTotalNumSeeds = nTotalNumSeeds + nPurchaseSeeds;

    } // End of transactionBuySeeds method

    public void transactionSellCrops( String[] marketSeeds, int[] marketPrices, int choiceIndex ) {
        System.out.println("Sell crops!\n");

    } // End of transactionSellCrops

    /*Getters and Setters */
    public void setNTotalGoldCoins( int nTotalGoldCoins ) {
        this.nTotalGoldCoins = nTotalGoldCoins;
    }

    public int getNTotalGoldCoins() {
        return this.nTotalGoldCoins;
    }

    public void setNSeedPerCrop( int[] nSeedPerCrop ) {
        this.nSeedPerCrop = nSeedPerCrop;
    }

    public int[] getNSeedPerCrop( ) {
        return nSeedPerCrop;
    }

    public void setMarketSeeds( String[] marketSeeds ) {
        this.marketSeeds = marketSeeds;
    }

    public String[] getMarketSeeds( ) {
        return marketSeeds;
    }

    public void setNTotalNumSeeds( int nTotalNumSeeds ) {
        this.nTotalNumSeeds = nTotalNumSeeds;
    }

    public int getNTotalNumSeeds( ) {
        return nTotalNumSeeds;
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
