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
	

	
	
	//main
	public  void plantSeeds(String[] args) {
		
		Scanner sc= new Scanner(System.in);

		int nTotalGoldCoins=100;
		String strToolonHand=null;
		String[] strSeed= {"Turnip","Carrot","Potato","Rose","Tulips","Sunflower","Mango","Apple"};
		int[] prices= {5,10,20,5,10,20,200};
    
				System.out.println("Choose a seed");
				System.out.println("0.) Turnip (5 g)");
				System.out.println("1.) Carrot (10 g)");
				System.out.println("2.) Potato (20 g)");
				System.out.println("3.) Rose (5 g)");
				System.out.println("4.) Tulips (10 g)");
				System.out.println("5.) Sunflower (10 g)");
				System.out.println("6.) Mango (100 g)");
				System.out.println("7.) Apple (200)");
				
				int nSeedChoice=sc.nextInt();
				
				System.out.println("You chose \n"+strSeed[nSeedChoice]+"!");
				
				String nSeedindex=strSeed[nSeedChoice];
				
					//initiate seed transaction
				seeds(nSeedindex,nSeedChoice, nTotalGoldCoins,prices);
				
    sc.close();
					
				
  }
			
