public class Seeds {
	
	public static int seeds(String seedIndex,int seedchoice, int totalcoins,int[] prices) {
		switch(seedIndex) {
			case "Turnip":
				totalcoins=totalcoins-prices[seedchoice];
			
				System.out.println("Turnip seed is bought! your total coins is "+ totalcoins);
						break;
			
			case "Carrot":
				totalcoins=totalcoins-prices[seedchoice];
			
				System.out.println("Turnip seed is bought! your total coins is "+ totalcoins);
						break;
			
			case "Potato":
				totalcoins=totalcoins-prices[seedchoice];
			
				System.out.println("Turnip seed is bought! your total coins is "+ totalcoins);
						break;
			
			case "Rose":
				totalcoins=totalcoins-prices[seedchoice];
			
				System.out.println("Turnip seed is bought! your total coins is "+ totalcoins);
						break;
			
			case "Tulips":
			totalcoins=totalcoins-prices[seedchoice];
			
			System.out.println("Turnip seed is bought! your total coins is "+ totalcoins);
						break;
			
			case "Sunflower":
				totalcoins=totalcoins-prices[seedchoice];
			
				System.out.println("Turnip seed is bought! your total coins is "+ totalcoins);
						break;
			
			case "Mango":
				totalcoins=totalcoins-prices[seedchoice];
			
				System.out.println("Turnip seed is bought! your total coins is "+ totalcoins);
						break;
			
			case "Apple":
				totalcoins=totalcoins-prices[seedchoice];
			
				System.out.println("Turnip seed is bought! your total coins is "+ totalcoins);

		}
		return prices[seedchoice];
	}
	

	
	
	//main
	public static void main(String[] args) {
		
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
			
