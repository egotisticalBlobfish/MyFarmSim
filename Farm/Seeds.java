public class Seeds {
	
	public void plantSeeds(int totalday,farm farm,String seedIndex,int i, int j,int seedQuantity,int seedchoice,int[] harvesttime, int [] waterneeds, int[] waterneedsbonus,int[] fertilizer,int [] fertilizerbonus ) {
			switch(seedIndex) {
				case "Turnip":
				//check if the land is plowed 
					do {
						
						 for( i=0; i<10; i++ ) {
					            System.out.print((i + 1) + "\t");
					            for( j=0; j<5; j++ ) {
					            		if (farm.farmField[i][j]==1|| seedQuantity>0) // if a tile is unplowed or has seeds for the specific plant,it opens opportunities for 
					            		{
					            			seedQuantity=seedQuantity-1;//decreases the specific seed 
					            			totalday=totalday+1;//adds the total day
					            			farm.farmField[i][j]=farm.farmField[i][1];// sets a sign for the turnip
									
					            			if (totalday==harvesttime[seedchoice]) {

					            				farm.farmField[i][j]='H';//sets the sign that the plant is ready to harvest
										    }
										
										}
										//checks water status
										if (farm.farmField[i][j]==waterneeds[seedchoice]||farm.farmField[i][j]==waterneedsbonus[seedchoice])// checks the farm if the specific tile is watered 
										{
											farm.farmField[i][j]='G';//sets the sign of a growing plant
										}
										else if(farm.farmField[i][j]<waterneeds[seedchoice]||farm.farmField[i][j]<fertilizer[seedchoice]) {
											farm.farmField[i][j]='W';//sets the sign to a wilting plant
										}
													
									}
					            }
					            System.out.println();
					        }while(seedQuantity<0);
					
					break;
				
				case "Carrot":
					
					do {
						
						 for( i=0; i<10; i++ ) {
					            System.out.print((i + 1) + "\t");
					            for( j=0; j<5; j++ ) {
					            		if (farm.farmField[i][j]==1|| seedQuantity>0) // if a tile is unplowed or has seeds for the specific plant,it opens opportunities for 
					            		{
					            			seedQuantity=seedQuantity-1;//decreases the specific seed 
					            			totalday=totalday+1;//adds the total day
					            			farm.farmField[i][j]=farm.farmField[i][2];// sets a sign for the turnip
									
					            			if (totalday==harvesttime[seedchoice]) {

					            				farm.farmField[i][j]='H';//sets the sign that the plant is ready to harvest
										    }
										
										}
										//checks water status
										if (farm.farmField[i][j]==waterneeds[seedchoice]||farm.farmField[i][j]==waterneedsbonus[seedchoice])// checks the farm if the specific tile is watered 
										{
											farm.farmField[i][j]='G';//sets the sign of a growing plant
										}
										else if(farm.farmField[i][j]<waterneeds[seedchoice]||farm.farmField[i][j]<fertilizer[seedchoice]) {
											farm.farmField[i][j]='W';//sets the sign to a wilting plant
										}
													
									}
					            }
					            System.out.println();
					        }while(seedQuantity<0);
					
				
							break;
				
				case "Potato":
					
					do {
						
						 for( i=0; i<10; i++ ) {
					            System.out.print((i + 1) + "\t");
					            for( j=0; j<5; j++ ) {
					            		if (farm.farmField[i][j]==1|| seedQuantity>0) // if a tile is unplowed or has seeds for the specific plant,it opens opportunities for 
					            		{
					            			seedQuantity=seedQuantity-1;//decreases the specific seed 
					            			totalday=totalday+1;//adds the total day
					            			farm.farmField[i][j]=farm.farmField[i][3];// sets a sign for the turnip
									
					            			if (totalday==harvesttime[seedchoice]) {

					            				farm.farmField[i][j]='H';//sets the sign that the plant is ready to harvest
										    }
										
										}
										//checks water status
										if (farm.farmField[i][j]==waterneeds[seedchoice]||farm.farmField[i][j]==waterneedsbonus[seedchoice])// checks the farm if the specific tile is watered 
										{
											farm.farmField[i][j]='G';//sets the sign of a growing plant
										}
										else if(farm.farmField[i][j]<waterneeds[seedchoice]||farm.farmField[i][j]<fertilizer[seedchoice]) {
											farm.farmField[i][j]='W';//sets the sign to a wilting plant
										}
													
									}
					            }
					            System.out.println();
					        }while(seedQuantity<0);
		
							break;
				
				case "Rose":
					
					do {
						
						 for( i=0; i<10; i++ ) {
					            System.out.print((i + 1) + "\t");
					            for( j=0; j<5; j++ ) {
					            		if (farm.farmField[i][j]==1|| seedQuantity>0) // if a tile is unplowed or has seeds for the specific plant,it opens opportunities for 
					            		{
					            			seedQuantity=seedQuantity-1;//decreases the specific seed 
					            			totalday=totalday+1;//adds the total day
					            			farm.farmField[i][j]=farm.farmField[i][4];// sets a sign for the turnip
									
					            			if (totalday==harvesttime[seedchoice]) {

					            				farm.farmField[i][j]='H';//sets the sign that the plant is ready to harvest
										    }
										
										}
										//checks water status
										if (farm.farmField[i][j]==waterneeds[seedchoice]||farm.farmField[i][j]==waterneedsbonus[seedchoice])// checks the farm if the specific tile is watered 
										{
											farm.farmField[i][j]='G';//sets the sign of a growing plant
										}
										else if(farm.farmField[i][j]<waterneeds[seedchoice]||farm.farmField[i][j]<fertilizer[seedchoice]) {
											farm.farmField[i][j]='W';//sets the sign to a wilting plant
										}
													
									}
					            }
					            System.out.println();
					        }while(seedQuantity<0);
		

							break;
				
				case "Tulips":
					
					do {
						
						 for( i=0; i<10; i++ ) {
					            System.out.print((i + 1) + "\t");
					            for( j=0; j<5; j++ ) {
					            		if (farm.farmField[i][j]==1|| seedQuantity>0) // if a tile is unplowed or has seeds for the specific plant,it opens opportunities for 
					            		{
					            			seedQuantity=seedQuantity-1;//decreases the specific seed 
					            			totalday=totalday+1;//adds the total day
					            			farm.farmField[i][j]=farm.farmField[i][5];// sets a sign for the turnip
									
					            			if (totalday==harvesttime[seedchoice]) {

					            				farm.farmField[i][j]='H';//sets the sign that the plant is ready to harvest
										    }
										
										}
										//checks water status
										if (farm.farmField[i][j]==waterneeds[seedchoice]||farm.farmField[i][j]==waterneedsbonus[seedchoice])// checks the farm if the specific tile is watered 
										{
											farm.farmField[i][j]='G';//sets the sign of a growing plant
										}
										else if(farm.farmField[i][j]<waterneeds[seedchoice]||farm.farmField[i][j]<fertilizer[seedchoice]) {
											farm.farmField[i][j]='W';//sets the sign to a wilting plant
										}
													
									}
					            }
					            System.out.println();
					        }while(seedQuantity<0);
		

							break;
				
				case "Sunflower":
					
					do {
						
						 for( i=0; i<10; i++ ) {
					            System.out.print((i + 1) + "\t");
					            for( j=0; j<5; j++ ) {
					            		if (farm.farmField[i][j]==1|| seedQuantity>0) // if a tile is unplowed or has seeds for the specific plant,it opens opportunities for 
					            		{
					            			seedQuantity=seedQuantity-1;//decreases the specific seed 
					            			totalday=totalday+1;//adds the total day
					            			farm.farmField[i][j]=farm.farmField[i][6];// sets a sign for the turnip
									
					            			if (totalday==harvesttime[seedchoice]) {

					            				farm.farmField[i][j]='H';//sets the sign that the plant is ready to harvest
										    }
										
										}
										//checks water status
										if (farm.farmField[i][j]==waterneeds[seedchoice]||farm.farmField[i][j]==waterneedsbonus[seedchoice])// checks the farm if the specific tile is watered 
										{
											farm.farmField[i][j]='G';//sets the sign of a growing plant
										}
										else if(farm.farmField[i][j]<waterneeds[seedchoice]||farm.farmField[i][j]<fertilizer[seedchoice]) {
											farm.farmField[i][j]='W';//sets the sign to a wilting plant
										}
													
									}
					            }
					            System.out.println();
					        }while(seedQuantity<0);
		
		
							break;
				
				case "Mango":
					
					do {
						
						 for( i=0; i<10; i++ ) {
					            System.out.print((i + 1) + "\t");
					            for( j=0; j<5; j++ ) {
					            		if (farm.farmField[i][j]==1|| seedQuantity>0) // if a tile is unplowed or has seeds for the specific plant,it opens opportunities for 
					            		{
					            			seedQuantity=seedQuantity-1;//decreases the specific seed 
					            			totalday=totalday+1;//adds the total day
					            			farm.farmField[i][j]=farm.farmField[i][6];// sets a sign for the turnip
									
					            			if (totalday==harvesttime[seedchoice]) {

					            				farm.farmField[i][j]='H';//sets the sign that the plant is ready to harvest
										    }
										
										}
										//checks water status
										if (farm.farmField[i][j]==waterneeds[seedchoice]||farm.farmField[i][j]==waterneedsbonus[seedchoice])// checks the farm if the specific tile is watered 
										{
											farm.farmField[i][j]='G';//sets the sign of a growing plant
										}
										else if(farm.farmField[i][j]<waterneeds[seedchoice]||farm.farmField[i][j]<fertilizer[seedchoice]) {
											farm.farmField[i][j]='W';//sets the sign to a wilting plant
										}
													
									}
					            }
					            System.out.println();
					        }while(seedQuantity<0);
		

							break;
				
				case "Apple":
					
					do {
						
						 for( i=0; i<10; i++ ) {
					            System.out.print((i + 1) + "\t");
					            for( j=0; j<5; j++ ) {
					            		if (farm.farmField[i][j]==1|| seedQuantity>0) // if a tile is unplowed or has seeds for the specific plant,it opens opportunities for 
					            		{
					            			seedQuantity=seedQuantity-1;//decreases the specific seed 
					            			totalday=totalday+1;//adds the total day
					            			farm.farmField[i][j]=farm.farmField[i][6];// sets a sign for the turnip
									
					            			if (totalday==harvesttime[seedchoice]) {

					            				farm.farmField[i][j]='H';//sets the sign that the plant is ready to harvest
										    }
										
										}
										//checks water status
										if (farm.farmField[i][j]==waterneeds[seedchoice]||farm.farmField[i][j]==waterneedsbonus[seedchoice])// checks the farm if the specific tile is watered 
										{
											farm.farmField[i][j]='G';//sets the sign of a growing plant
										}
										else if(farm.farmField[i][j]<waterneeds[seedchoice]||farm.farmField[i][j]<fertilizer[seedchoice]) {
											farm.farmField[i][j]='W';//sets the sign to a wilting plant
										}
													
									}
					            }
					            System.out.println();
					        }while(seedQuantity<0);
		
			

			}
		
		}
	
			
