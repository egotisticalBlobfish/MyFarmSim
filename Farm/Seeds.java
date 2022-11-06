public class Seeds {	
	private int totalday;//day count for the plant
	private Farm farm; //class access method
	private String seedIndex;//seed index for choices
	int i;
	int j;
	private int [][] seedQuantity; //counts the seeds of the specific plant
	private int seedchoice ;// seed index
	private int[] harvesttime; //array for the harvest time for the plant
	private int[] waterneeds;// array for the ample water for the plant
	private int[] waterneedsbonus;//array for extra water for the plant
	private int[] fertilizer;//array for the ample fertilizer for the plant
	private int [] fertilizerbonus;//array for extra fertilizer for the plant
	private int[][] watercount;// water count from the usage of tool
	private int[][] fertilizercount;// fertilizer count from usage of tool
	
	
	public void plantSeeds( ) {
			switch(seedIndex) {
				case "Turnip":
				//check if the land is plowed 
						 for( i=0; i<10; i++ ) {
					            System.out.print((i + 1) + "\t");
					            for( j=0; j<5; j++ ) {
					            		if (farm.getFarmField()[i][j]==1 && farm.getFarmField()[i][j]==20) // if a tile is unplowed or has seeds for the specific plant,it opens opportunities for 
					            		{
					            			seedQuantity[i][j]=seedQuantity[i][j]-1;//decreases the specific seed 
					            			totalday=totalday+1;//adds the total day
									
					            			if (totalday==harvesttime[seedchoice]) {

					            				farm.farmField[i][j]='H';//sets the sign that the plant is ready to harvest
					            				//put some random harvests
										    }
										
										}
										//checks water status
										if (watercount[i][j]>=waterneeds[seedchoice]||watercount[i][j]>=waterneedsbonus[seedchoice]||fertilizercount[i][j]>=fertilizer[seedchoice]||fertilizercount[i][j]>=fertilizerbonus[seedchoice])// checks the farm if the specific tile is watered 
										{
											farm.farmField[i][j]='G';//sets the sign of a growing plant
											System.out.println("The plant is still growing keep up the good work!");
										}
										else if(watercount[i][j]<waterneeds[seedchoice]||fertilizercount[i][j]<fertilizer[seedchoice]) {
											farm.farmField[i][j]='W';//sets the sign to a wilting plant
											System.out.println("The plant has wilted please remove it immediately");
										}
													
									}
					            }
					            System.out.println();
					
					break;
				
				case "Carrot":
					
					 for( i=0; i<10; i++ ) {
				            System.out.print((i + 1) + "\t");
				            for( j=0; j<5; j++ ) {
				            		if (farm.getFarmField()[i][j]==1 && farm.getFarmField()[i][j]==21) // if a tile is unplowed or has seeds for the specific plant,it opens opportunities for 
				            		{
				            			seedQuantity[i][j]=seedQuantity[i][j]-1;//decreases the specific seed 
				            			totalday=totalday+1;//adds the total day
								
				            			if (totalday==harvesttime[seedchoice]) {

				            				farm.farmField[i][j]='H';//sets the sign that the plant is ready to harvest
				            				//put some random harvests
									    }
									
									}
									//checks water status
									if (watercount[i][j]>=waterneeds[seedchoice]||watercount[i][j]>=waterneedsbonus[seedchoice]||fertilizercount[i][j]>=fertilizer[seedchoice]||fertilizercount[i][j]>=fertilizerbonus[seedchoice])// checks the farm if the specific tile is watered 
									{
										farm.farmField[i][j]='G';//sets the sign of a growing plant
										System.out.println("The plant is still growing keep up the good work!");
									}
									else if(watercount[i][j]<waterneeds[seedchoice]||fertilizercount[i][j]<fertilizer[seedchoice]) {
										farm.farmField[i][j]='W';//sets the sign to a wilting plant
										System.out.println("The plant has wilted please remove it immediately");
									}
												
								}
				            }
				            System.out.println();
					
				
							break;
				
				case "Potato":
						
						 for( i=0; i<10; i++ ) {
					            System.out.print((i + 1) + "\t");
					            for( j=0; j<5; j++ ) {
					            		if (farm.getFarmField()[i][j]==1 && farm.getFarmField()[i][j]==22) // if a tile is unplowed or has seeds for the specific plant,it opens opportunities for 
					            		{
					            			seedQuantity[i][j]=seedQuantity[i][j]-1;//decreases the specific seed 
					            			totalday=totalday+1;//adds the total day
									
					            			if (totalday==harvesttime[seedchoice]) {

					            				farm.farmField[i][j]='H';//sets the sign that the plant is ready to harvest
					            				//put some random harvests
										    }
										
										}
										//checks water status
										if (watercount[i][j]>=waterneeds[seedchoice]||watercount[i][j]>=waterneedsbonus[seedchoice]||fertilizercount[i][j]>=fertilizer[seedchoice]||fertilizercount[i][j]>=fertilizerbonus[seedchoice])// checks the farm if the specific tile is watered 
										{
											farm.farmField[i][j]='G';//sets the sign of a growing plant
											System.out.println("The plant is still growing keep up the good work!");
										}
										else if(watercount[i][j]<waterneeds[seedchoice]||fertilizercount[i][j]<fertilizer[seedchoice]) {
											farm.farmField[i][j]='W';//sets the sign to a wilting plant
											System.out.println("The plant has wilted please remove it immediately");
										}
													
									}
					            }
					            System.out.println();
		
							break;
				
				case "Rose":
					
					 for( i=0; i<10; i++ ) {
				            System.out.print((i + 1) + "\t");
				            for( j=0; j<5; j++ ) {
				            		if (farm.getFarmField()[i][j]==1 && farm.getFarmField()[i][j]==23) // if a tile is unplowed or has seeds for the specific plant,it opens opportunities for 
				            		{
				            			seedQuantity[i][j]=seedQuantity[i][j]-1;//decreases the specific seed 
				            			totalday=totalday+1;//adds the total day
								
				            			if (totalday==harvesttime[seedchoice]) {

				            				farm.farmField[i][j]='H';//sets the sign that the plant is ready to harvest
				            				//put some random harvests
									    }
									
									}
									//checks water status
									if (watercount[i][j]>=waterneeds[seedchoice]||watercount[i][j]>=waterneedsbonus[seedchoice]||fertilizercount[i][j]>=fertilizer[seedchoice]||fertilizercount[i][j]>=fertilizerbonus[seedchoice])// checks the farm if the specific tile is watered 
									{
										farm.farmField[i][j]='G';//sets the sign of a growing plant
										System.out.println("The plant is still growing keep up the good work!");
									}
									else if(watercount[i][j]<waterneeds[seedchoice]||fertilizercount[i][j]<fertilizer[seedchoice]) {
										farm.farmField[i][j]='W';//sets the sign to a wilting plant
										System.out.println("The plant has wilted please remove it immediately");
									}
												
								}
				            }
				            System.out.println();
							break;
				
				case "Tulips":
					
					for( i=0; i<10; i++ ) {
			            System.out.print((i + 1) + "\t");
			            for( j=0; j<5; j++ ) {
			            		if (farm.getFarmField()[i][j]==1 && farm.getFarmField()[i][j]==24) // if a tile is unplowed or has seeds for the specific plant,it opens opportunities for 
			            		{
			            			seedQuantity[i][j]=seedQuantity[i][j]-1;//decreases the specific seed 
			            			totalday=totalday+1;//adds the total day
							
			            			if (totalday==harvesttime[seedchoice]) {

			            				farm.farmField[i][j]='H';//sets the sign that the plant is ready to harvest
			            				//put some random harvests
								    }
								
								}
								//checks water status
								if (watercount[i][j]>=waterneeds[seedchoice]||watercount[i][j]>=waterneedsbonus[seedchoice]||fertilizercount[i][j]>=fertilizer[seedchoice]||fertilizercount[i][j]>=fertilizerbonus[seedchoice])// checks the farm if the specific tile is watered 
								{
									farm.farmField[i][j]='G';//sets the sign of a growing plant
									System.out.println("The plant is still growing keep up the good work!");
								}
								else if(watercount[i][j]<waterneeds[seedchoice]||fertilizercount[i][j]<fertilizer[seedchoice]) {
									farm.farmField[i][j]='W';//sets the sign to a wilting plant
									System.out.println("The plant has wilted please remove it immediately");
								}
											
							}
			            }
			            System.out.println();
		

							break;
				
				case "Sunflower":
					
					for( i=0; i<10; i++ ) {
			            System.out.print((i + 1) + "\t");
			            for( j=0; j<5; j++ ) {
			            		if (farm.getFarmField()[i][j]==1 && farm.getFarmField()[i][j]==25) // if a tile is unplowed or has seeds for the specific plant,it opens opportunities for 
			            		{
			            			seedQuantity[i][j]=seedQuantity[i][j]-1;//decreases the specific seed 
			            			totalday=totalday+1;//adds the total day
							
			            			if (totalday==harvesttime[seedchoice]) {

			            				farm.farmField[i][j]='H';//sets the sign that the plant is ready to harvest
			            				//put some random harvests
								    }
								
								}
								//checks water status
								if (watercount[i][j]>=waterneeds[seedchoice]||watercount[i][j]>=waterneedsbonus[seedchoice]||fertilizercount[i][j]>=fertilizer[seedchoice]||fertilizercount[i][j]>=fertilizerbonus[seedchoice])// checks the farm if the specific tile is watered 
								{
									farm.farmField[i][j]='G';//sets the sign of a growing plant
									System.out.println("The plant is still growing keep up the good work!");
								}
								else if(watercount[i][j]<waterneeds[seedchoice]||fertilizercount[i][j]<fertilizer[seedchoice]) {
									farm.farmField[i][j]='W';//sets the sign to a wilting plant
									System.out.println("The plant has wilted please remove it immediately");
								}
											
							}
			            }
			            System.out.println();
		
							break;
				
				case "Mango":
					
					for( i=0; i<10; i++ ) {
			            System.out.print((i + 1) + "\t");
			            for( j=0; j<5; j++ ) {
			            		if (farm.getFarmField()[i][j]==1 && farm.getFarmField()[i][j]==26) // if a tile is unplowed or has seeds for the specific plant,it opens opportunities for 
			            		{
			            			seedQuantity[i][j]=seedQuantity[i][j]-1;//decreases the specific seed 
			            			totalday=totalday+1;//adds the total day
							
			            			if (totalday==harvesttime[seedchoice]) {

			            				farm.farmField[i][j]='H';//sets the sign that the plant is ready to harvest
			            				//put some random harvests
								    }
								
								}
								//checks water status
								if (watercount[i][j]>=waterneeds[seedchoice]||watercount[i][j]>=waterneedsbonus[seedchoice]||fertilizercount[i][j]>=fertilizer[seedchoice]||fertilizercount[i][j]>=fertilizerbonus[seedchoice])// checks the farm if the specific tile is watered 
								{
									farm.farmField[i][j]='G';//sets the sign of a growing plant
									System.out.println("The plant is still growing keep up the good work!");
								}
								else if(watercount[i][j]<waterneeds[seedchoice]||fertilizercount[i][j]<fertilizer[seedchoice]) {
									farm.farmField[i][j]='W';//sets the sign to a wilting plant
									System.out.println("The plant has wilted please remove it immediately");
								}
											
							}
			            }
			            System.out.println();
		

							break;
				
				case "Apple":
					
					for( i=0; i<10; i++ ) {
			            System.out.print((i + 1) + "\t");
			            for( j=0; j<5; j++ ) {
			            		if (farm.getFarmField()[i][j]==1 && farm.getFarmField()[i][j]==27) // if a tile is unplowed or has seeds for the specific plant,it opens opportunities for 
			            		{
			            			seedQuantity[i][j]=seedQuantity[i][j]-1;//decreases the specific seed 
			            			totalday=totalday+1;//adds the total day
							
			            			if (totalday==harvesttime[seedchoice]) {

			            				farm.farmField[i][j]='H';//sets the sign that the plant is ready to harvest
			            				//put some random harvests
								    }
								
								}
								//checks water status
								if (watercount[i][j]>=waterneeds[seedchoice]||watercount[i][j]>=waterneedsbonus[seedchoice]||fertilizercount[i][j]>=fertilizer[seedchoice]||fertilizercount[i][j]>=fertilizerbonus[seedchoice])// checks the farm if the specific tile is watered 
								{
									farm.farmField[i][j]='G';//sets the sign of a growing plant
									System.out.println("The plant is still growing keep up the good work!");
								}
								else if(watercount[i][j]<waterneeds[seedchoice]||fertilizercount[i][j]<fertilizer[seedchoice]) {
									farm.farmField[i][j]='W';//sets the sign to a wilting plant
									System.out.println("The plant has wilted please remove it immediately");
								}
											
							}
			            }
			            System.out.println();
			

			}
		
	}
}
	
			
