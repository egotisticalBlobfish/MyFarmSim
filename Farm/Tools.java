/*The Tools class shows the equipping of tools and the function depends on the state of the specific land tile*/

public class Tools{
	public tools(String toolInx,int totalcoins,String equippedtool,String[] Tools, int toolchoice) {

		switch (toolInx) {
		
		case "Plow":
			System.out.println("You chose the Plow!");
			equippedtool="Plow";
			System.out.println("You equipped:");
			System.out.println(Tools[toolchoice]);
			//insert method
				break;
		case "WateringCan":
			System.out.println("You chose the Watering Can!");
			equippedtool="Watering Can";
			System.out.println("You equipped:");
			System.out.println(Tools[toolchoice]);
			//insert method
				break;
		case "Fertilizer":
			if(totalcoins>=10) {
				totalcoins=totalcoins-10;
			System.out.println("You chose the Fertilizer!");
			equippedtool="Fertilizer";
			System.out.println("You equipped:");
			System.out.println(Tools[toolchoice]);
			//insert method
			}
			else {
				System.out.println("Sorry, please try again");
			}
				break;
	case "Pickaxe":
		if(totalcoins>=50) {
			totalcoins=totalcoins-50;
			System.out.println("You chose the Pickaxe!");
			equippedtool="Pickaxe";
			System.out.println("You equipped:");
			System.out.println(Tools[toolchoice]);
			//insert method
			}
			else {
			System.out.println("Sorry, please try again");
			}
				break;
	case "Shovel":
		if (totalcoins>=7) {
			totalcoins=totalcoins-7;
			System.out.println("You chose the Shovel!");
			equippedtool="Shovel";
			System.out.println("You equipped:");
			System.out.println(Tools[toolchoice]);
			//insert method
				break;
		}
	default:
		System.out.println("Invalid option");
		break;
		}
		
	}
  
 
