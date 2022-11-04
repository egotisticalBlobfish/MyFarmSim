public class Farm {
    String farmName;
    int[][] farmField;
    int i, j;


    /*
        This function identifies if the one of the tiles in the field is plowed
     */
    //public int[][] isPlowedField( int [][] arrFarmField ) {

    //}

    

    /*Getters and Setters */
    public void setFarmName( String farmName ) {
        this.farmName = farmName;
    }

    public String getFarmName( String farmName ) {
        return farmName;
    }

    public void setFarmField( int[][] farField ) {
        this.farmField = farField;
    }

    public int[][] getFarmField( ) {
        return farmField;
    }


}
