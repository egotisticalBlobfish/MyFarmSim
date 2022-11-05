/*The Tools class shows the equipping of tools and the function depends on the state of the specific land tile*/

public class Tools{
	public static String tools(String toolInx,String equippedtool,String[] Tools, int toolchoice) {

		switch (toolInx) {
		
		case "Plow":
			  System.out.println("You chose the Plow!");
			  equippedtool="Plow";
			  System.out.println("You equipped:");
			  System.out.println(Tools[toolchoice]);
				break;
		case "WateringCan":
			  System.out.println("You chose the Watering Can!");
			  equippedtool="WateringCan";
			  System.out.println("You equipped:");
			  System.out.println(Tools[toolchoice]);
				break;
		case "Fertilizer":
		
			  System.out.println("You chose the Fertilizer!");
			  equippedtool="Fertilizer";
			  System.out.println("You equipped:");
			  System.out.println(Tools[toolchoice]);
				break;
	case "Pickaxe":
			  System.out.println("You chose the Pickaxe!");
			  equippedtool="Pickaxe";
			  System.out.println("You equipped:");
			  System.out.println(Tools[toolchoice]);
				break;
	case "Shovel":
			  System.out.println("You chose the Shovel!");
			  equippedtool="Shovel";
			System.out.println("You equipped:");
			System.out.println(Tools[toolchoice]);
				break;
		
	default:
		System.out.println("Invalid option");
		break;
		}
		
		return equippedtool;
	}
  
  public static void main{
  String[] strTools= {"Plow","WateringCan","Fertilizer","Pickaxe","Shovel"};
    
    System.out.println("Choose your tool");
				System.out.println("0.) Plow");
				System.out.println("1.) Watering Can");
				System.out.println("2.) Fertilizer");
				System.out.println("3.) Pickaxe");
				System.out.println("4.) Shovel");
				int nToolChoice=sc.nextInt();
				
				String toolIndex= strTools[nToolChoice];
				
				tools(toolIndex, strToolonHand,strTools, nToolChoice);
  }
	
}
