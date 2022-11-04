

import java.util.Scanner;

public class main {
	
	public static void displayHeader( ) {
        	System.out.println("Welcome to the game: My Farm!");
    	}
	
	/*
	public buySeeds( int nChoice, int nLevel, int nTotalGoldCoins ) {
		
	}
	*/
	
	//main
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int nChoice=0;
		int nLevel=0;
		int nTotalGoldCoins=100;
		String[] strSeed= {"Turnip","Carrot","Potato","Rose","Tulips","Sunflower","Mango","Apple"};
		int[] prices= {5,10,20,5,10,20,200};
		
		System.out.println("1.) Buy Seeds");
		System.out.println("2.) View and Equip tools");
		System.out.println("3.) Check Farmer Status");
		
		nChoice=sc.nextInt();
		
			switch (nChoice ) {
			
			case 1:// a choice to buy seeds 
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
					switch(nSeedindex) {
						case "Turnip":
						
							break;
							
						case "Carrot":
							nTotalGoldCoins=nTotalGoldCoins-prices[nSeedChoice];
							
							System.out.println("Carrot seed is bought! your total coins is "+ nTotalGoldCoins);
							break;
							
						case "Potato":
							nTotalGoldCoins=nTotalGoldCoins-prices[nSeedChoice];
							System.out.println("Potato seed is bought! your total coins is "+ nTotalGoldCoins);
							break;
							
						case "Rose":
							nTotalGoldCoins=nTotalGoldCoins-prices[nSeedChoice];
							System.out.println("Rose seed is bought! your total coins is "+ nTotalGoldCoins);
							break;
							
						case "Tulips":
							nTotalGoldCoins=nTotalGoldCoins-prices[nSeedChoice];
							System.out.println("Tulips seed is bought! your total coins is "+ nTotalGoldCoins);
							break;
							
						case "Sunflower":
							nTotalGoldCoins=nTotalGoldCoins-prices[nSeedChoice];
							System.out.println("Sunflower seed is bought! your total coins is "+ nTotalGoldCoins);
							break;
							
						case "Mango":
							nTotalGoldCoins=nTotalGoldCoins-prices[nSeedChoice];
							System.out.println("Mango seed is bought! your total coins is "+ nTotalGoldCoins);
							break;
							
						case "Apple":
							nTotalGoldCoins=nTotalGoldCoins-prices[nSeedChoice];
							System.out.println("Apple seed is bought! your total coins is "+ nTotalGoldCoins);
				
				}
					
			case 2:// a choice to equip tools

			break;
      
      case 3:// a choice to view the farmer's status
      break;
        
			}
			
			sc.close();
		}
	}


