/*
 * checkSeedExist			-- check if there's a plant or seed on a tile
 * seedsWatering			-- water the plant on a tile
 * seedsFertilizing			-- put a fertilizer on a tile
 * seedIdentifyStatus		-- checks the status of a plant
 */

public class Seeds {
	// Values are from driver class
	private int[] seedsCropHarvestTime;					// Array for the harvest time for the plant

	// Must met this amount every day depending on a crop type
	private int[] seedsWaterNeedsMin = {1, 1, 3, 1, 2, 3, 10, 10};
	private int[] seedsFertlizerNeedsMin = {0, 0, 1, 0, 0, 1, 4, 5};
	
	// Maximum limit
	//private int[] seedsWaterNeedsBonusLimitMax = { 2, 2, 4, 2, 3, 3, 7, 7};
	//private int[] seedsFertilizerNeedsBonusLimitMax = { 1, 1, 2, 1, 1, 2, 4, 5};

	// Changes
	private int[][] seedsFarmField;						// Get the updated farm field -- to store the water and fertilizer amount
	private int[][] seedsWaterCount;					// Initialized in Driver class as = 0 | Stores the amount how many times a crops was watered
	private int[][] seedsFertilizerCount;				// Initialized in Driver class as = 0 | Stores the amount how many time a crop was fertilized
	private int[][] seedsDaysGrowth;					// Initialized in Driver class as = 0 | Stores the days counts of a crop before the harvest
	private char[][] seedsCropStatus;					// Holds the value if a crop is healthy or not

	
	/* Methods */
	public void resetWaterFertilizerGrowthCount( int nRow, int nCol ) {
		seedsWaterCount[nRow][nCol] = 0;
		seedsFertilizerCount[nRow][nCol] = 0;
		seedsDaysGrowth[nRow][nCol] = 0;
	}

	public int checkSeedExist( int nRow, int nCol ) {
		int seedExist;

		if(seedsFarmField[nRow][nCol] <= 19 &&  seedsFarmField[nRow][nCol] >= 28) {
			seedExist = 0;	// no seed exist in a tile
		}
		else {
			seedExist = 1;	// there exist a seed in a tile
		}
		
		return seedExist;
	}


	public int seedIdentifyCrop( Farmer farmerUser, int nRow, int nCol ) {
		int nIndexCropType;

		nIndexCropType = farmerUser.getFarmerField()[nRow-1][nCol-1] % 10;

		return nIndexCropType;
	}

	public void seedIdentifyCropStatus( Farmer farmerUSer, int nRow, int nCol, int nSeedType ) {

		System.out.println("Crop Status Legends: ");
		System.out.println("\t[G] - Growing");
		System.out.println("\t[H] - Time to Harvest");
		System.out.println("\t[W] - Withered");

		if(seedsDaysGrowth[nRow-1][nCol-1] < seedsCropHarvestTime[nSeedType]) {		// Growing
			if((seedsWaterCount[nRow-1][nCol-1] >= (seedsWaterNeedsMin[nSeedType] - 1)) || (seedsFertilizerCount[nRow-1][nCol-1] >= (seedsFertlizerNeedsMin[nSeedType] - 1))) {
				seedsCropStatus[nRow-1][nCol-1] = 'G';
				System.out.println("Plant: " + farmerUSer.getFarmerSeedList()[nSeedType]);
				System.out.println("Status: Growing");
				System.out.println("The plant is still growing keep up the good work!\n");
			}
		}
		else if(seedsDaysGrowth[nRow-1][nCol-1] == seedsCropHarvestTime[nSeedType]){	// Time to harvest
			if((seedsWaterCount[nRow-1][nCol-1] >= seedsWaterNeedsMin[nSeedType]) && (seedsFertilizerCount[nRow-1][nCol-1] >= seedsFertlizerNeedsMin[nSeedType])) {
				seedsCropStatus[nRow-1][nCol-1] = 'H';
				System.out.println("Plant: " + farmerUSer.getFarmerSeedList()[nSeedType]);
				System.out.println("Status: Time to Harvest");
				System.out.println("The plant is ready to harvest! Congrats!\n");
			}
			else if((seedsWaterCount[nRow-1][nCol-1] < seedsWaterNeedsMin[nSeedType]) || (seedsFertilizerCount[nRow-1][nCol-1] < seedsFertlizerNeedsMin[nSeedType])) {
				seedsCropStatus[nRow-1][nCol-1] = 'W';
				System.out.println("Plant: " + farmerUSer.getFarmerSeedList()[nSeedType]);
				System.out.println("Status: Withered");
				System.out.println("The plant has wilted please remove it immediately\n");
			}
		}
		else {
			seedsCropStatus[nRow-1][nCol-1] = 'H';
			System.out.println("Plant: " + farmerUSer.getFarmerSeedList()[nSeedType]);
			System.out.println("Withered");
			System.out.println("The plant has wilted please remove it immediately\n");
		}

		//return cStatus; 
	}
	
	
	public void seedsWatering( int nRow, int nCol ) {
		seedsWaterCount[nRow-1][nCol-1] = seedsWaterCount[nRow-1][nCol-1] + 1;
	}

	public void seedsFertilizing( int nRow, int nCol ) {
		seedsFertilizerCount[nRow-1][nCol-1] = seedsFertilizerCount[nRow-1][nCol-1] + 1;
	}

	

	/* Getters and Setters */
	public void setSeedsCropHarvestTime( int[] seedsCropHarvestTime ) {
		this.seedsCropHarvestTime = seedsCropHarvestTime;
	}

	public void setSeedsFarmField( int[][] seedsFarmField ) {
		this.seedsFarmField = seedsFarmField;
	}

	public int[][] getSeedsFarmField( ) {
		return seedsFarmField;
	}

	
	public void setSeedsWaterCount( int[][] seedsWaterCount ) {
		this.seedsWaterCount = seedsWaterCount;
	}
	

	public int[][] getSeedsWaterCount( ) {
		return seedsWaterCount;
	}

	
	public void setSeedsFertilizerCount( int[][] seedsFertilizerCount ) {
		this.seedsFertilizerCount = seedsFertilizerCount;
	}
	

	public int[][] getSeedsFertilizerCount( ) {
		return seedsFertilizerCount;
	}

	
	public void setSeedsDayGrowth( int[][] seedsDaysGrowth ) {
		this.seedsDaysGrowth = seedsDaysGrowth;
	}
	
	
	public int[][] getSeedsDaysGrowth( ) {
		return seedsDaysGrowth;
	}
	

	
	public void setSeedsCropStatus( char[][] seedsCropStatus ) {
		this.seedsCropStatus = seedsCropStatus;
	}
	

	public char[][] getSeedsCropStatus( ) {
		return seedsCropStatus;
	}


}
