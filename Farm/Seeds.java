public class Seeds {
	
	public static int seeds(String seedIndex,int seedchoice, int totalcoins,int[] prices) {
		switch(seedIndex) {
			case "Turnip":
		
						break;
			
			case "Carrot":
			
						break;
			
			case "Potato":
	
						break;
			
			case "Rose":

						break;
			
			case "Tulips":

						break;
			
			case "Sunflower":
	
						break;
			
			case "Mango":

						break;
			
			case "Apple":
		

		}
		return ;
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
			
