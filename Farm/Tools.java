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

   
    /*func toolComputeFarmerExperience serve as a computation for the farmer experience  */
    public void toolComputeFarmerExperience( ) {
        toolFarmerExperience = toolFarmerExperience + toolExpGainList[toolChoice-1];
    }

    /*func toolComputeFarmerObjectCoins serves a computation for the total coins of the farmer*/
    public void toolComputeFarmerObjectCoins( ) {
        toolFarmerObjectCoins = toolFarmerObjectCoins - toolCostUsageList[toolChoice-1];
    }
    
    /* Getters and Setters */
    /*func setToolList sets the specific String[] tool list
    @param toolList[]- String array containing the list of tools */
    public void setToolList( String[] toolList ) {
        this.toolList = toolList;
    }

     /*func getToolList string function that returns to the specified toolist
    */
    public String[] getToolList( ) {
        return toolList;
    }
    
    /*func setToolCostUsageList sets the specific int[] tool cost usage list
    @param *toolCostUsageList[]-integer for the string array of the cost usage of tools*/
    public void setToolCostUsageList( int[] toolCostUsageList ) {
        this.toolCostUsageList = toolCostUsageList;
    }

    /*func getToolCostUsageList is a int array function that returns to the specified tool cost usage*/
    public int[] getToolCostUsageList( ) {
        return toolCostUsageList;
    }

     /*func setToolExpGainList sets the specific double[] tool experience points 
     * @param toolExpGainList[]-a double array for the experience points gained when using the tool*/
    public void setToolExpGainList( double[] toolExpGainList ) {
        this.toolExpGainList = toolExpGainList;
    }
    
    /*func getToolExpGainList is an double array function returns to the specified tool experience gain list*/

    public double[] getToolExpGainList( ) {
        return toolExpGainList;
    }
    
    /*func setToolChoice sets the specific integer of the tool choice 
     * @param toolChoice- integer for the choice of a specified tool*/
    public void setToolChoice( int toolChoice ) {
        this.toolChoice = toolChoice;
    }
    
    /*func getToolChoice returns to a specified tool choice*/
    public int getToolChoice( ) {
        return toolChoice;
    }
    
    /*func setToolFarmerObjectCoins sets the specific integer for the total coins of the farmer
     * @param toolFarmerObjectCoins- integer for the total coins of the farmer*/
    public void setToolFarmerObjectCoins( int toolFarmerObjectCoins ) {
        this.toolFarmerObjectCoins = toolFarmerObjectCoins;
    }

    /*func getToolObjecttions returns to a specified farmer object coins*/
    public int getToolObjectCoins( ) {
        return toolFarmerObjectCoins;
    }
    
    /*func setToolFarmerExperience sets the specific double for the farmer experience 
     * @param toolFarmerExperience- a double serves as the total experience of the farmer */
    public void setToolFarmerExperience( double toolFarmerExperience ) {
        this.toolFarmerExperience = toolFarmerExperience;
    }

    /*func getToolFarmerExperience returns to the double of the tool experience*/
    public double getToolFarmerExperience( ) {
        return toolFarmerExperience;
    }
}
