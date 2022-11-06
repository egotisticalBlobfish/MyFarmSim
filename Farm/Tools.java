public class Tools {
    String[] toolList;
    int[] toolCostUsageList;
    double[] toolExpGainList;
    int toolChoice;
    int toolFarmerObjectCoins;
    double toolFarmerLevel;

    
    public void toolComputeFarmerLevel( ) {
        switch( toolChoice - 1 ) {
            case 0:     toolFarmerLevel = toolFarmerLevel + toolExpGainList[toolChoice-1];
                        break;
            case 1:     toolFarmerLevel = toolFarmerLevel + toolExpGainList[toolChoice-1];
                        break;
            case 2:     toolFarmerLevel = toolFarmerLevel + toolExpGainList[toolChoice-1];
                        break;
            case 3:     toolFarmerLevel = toolFarmerLevel + toolExpGainList[toolChoice-1];
                        break;
            case 4:     toolFarmerLevel = toolFarmerLevel + toolExpGainList[toolChoice-1];
                        break;
            case 5:     toolFarmerLevel = toolFarmerLevel + toolExpGainList[toolChoice-1];
                        break;
            case 6:     toolFarmerLevel = toolFarmerLevel + toolExpGainList[toolChoice-1];
                        break;
        }
    }

    public void toolComputeFarmerObjectCoins( ) {
        switch( toolChoice - 1 ) {
            case 0:     toolFarmerObjectCoins = toolFarmerObjectCoins - toolCostUsageList[toolChoice-1];
                        break;
            case 1:     toolFarmerObjectCoins = toolFarmerObjectCoins - toolCostUsageList[toolChoice-1];
                        break;
            case 2:     toolFarmerObjectCoins = toolFarmerObjectCoins - toolCostUsageList[toolChoice-1];
                        break;
            case 3:     toolFarmerObjectCoins = toolFarmerObjectCoins - toolCostUsageList[toolChoice-1];
                        break;
            case 4:     toolFarmerObjectCoins = toolFarmerObjectCoins - toolCostUsageList[toolChoice-1];
                        break;
            case 5:     toolFarmerObjectCoins = toolFarmerObjectCoins - toolCostUsageList[toolChoice-1];
                        break;
            case 6:     toolFarmerObjectCoins = toolFarmerObjectCoins - toolCostUsageList[toolChoice-1];
                        break;
        }
    }
    

    public void setToolList( String[] toolList ) {
        this.toolList = toolList;
    }

    public String[] getToolList( ) {
        return toolList;
    }

    public void setToolCostUsageList( int[] toolCostUsageList ) {
        this.toolCostUsageList = toolCostUsageList;
    }

    public int[] getToolCostUsageList( ) {
        return toolCostUsageList;
    }

    public void setToolExpGainList( double[] toolExpGainList ) {
        this.toolExpGainList = toolExpGainList;
    }

    public double[] getToolExpGainList( ) {
        return toolExpGainList;
    }

    public void setToolChoice( int toolChoice ) {
        this.toolChoice = toolChoice;
    }
    
    public int getToolChoice( ) {
        return toolChoice;
    }

    public void setToolFarmerObjectCoins( int toolFarmerObjectCoins ) {
        this.toolFarmerObjectCoins = toolFarmerObjectCoins;
    }

    public int getToolObjectCoins( ) {
        return toolFarmerObjectCoins;
    }

    public void setToolFarmerLevel( double toolFarmerLevel ) {
        this.toolFarmerLevel = toolFarmerLevel;
    }

    public double getToolFarmerLevel( ) {
        return toolFarmerLevel;
    }
}
