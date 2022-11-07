/*Description: the public class offers for the calculation for the usage of tools for the driver
 Parameters:
 * toolList[]- String array containing the list of tools
 *toolCostUsageList[]-integer for the string array of the cost usage of tools
 *toolExpGainList[]-a double array for the experience points gained when using the tool
 *toolChoice- integer for the choice of a specified tool
 *toolFarmerObjectCoins- integer for the total coins of the farmer
 *toolFarmerExperience- a double serves as the total experience of the farmer 
 */

public class Tools {
    String[] toolList;
    int[] toolCostUsageList;
    double[] toolExpGainList;
    int toolChoice;
    int toolFarmerObjectCoins;
    double toolFarmerExperience;

    
    public void toolComputeFarmerExperience( ) {
        toolFarmerExperience = toolFarmerExperience + toolExpGainList[toolChoice-1];
    }

    public void toolComputeFarmerObjectCoins( ) {
        toolFarmerObjectCoins = toolFarmerObjectCoins - toolCostUsageList[toolChoice-1];
    }
    
    /* Getters and Setters */
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

    public void setToolFarmerExperience( double toolFarmerExperience ) {
        this.toolFarmerExperience = toolFarmerExperience;
    }

    public double getToolFarmerExperience( ) {
        return toolFarmerExperience;
    }
}
