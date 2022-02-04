import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

public class Simulation {
	
	public ArrayList<Item> loadItems() throws Exception {
		ArrayList<Item> listOfItems = new ArrayList<>();
		File file = new File("phase-1.txt");
		Scanner scanner = new Scanner(file);
		
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			Item myItem = new Item(line);
			listOfItems.add(myItem);
		}
		return listOfItems
	}
	
	public ArrayList<Rocket> loadU1(ArrayList<Item> listOfItems){
		ArrayList<Rocket> listOfU1 = new ArrayList<>();
		while (!listOfItems.isEmpty()) {
			U1 myNewU1 = new U1();
			for (int i = 0; i < listOfItems.toArray().length; i++) {
				Item item = listOfItems.get(i);
				System.out.println("Checking Item: " + item.name);
				if (myNewU1.canCarry(item)) {
					myNewU1.carry(item);
					System.out.println("Rocket type U1 is carrying " + item.name);
					listOfItems.remove(item);
				}
			}
			listOfU1.add(myNewU1);
		}
		return listOfU1;
	}
	
	public ArrayList<Rocket> loadU2(ArrayList<Item> listOfItems){
		ArrayList<Rocket> listOfU2 = new ArrayList<>();
		while (!listOfItems.isEmpty()) {
			U2 myNewU2 = new U2();
			for (Item item : listOfItems) {
				if (myNewU2.canCarry(item)) {
					myNewU2.carry(item);
					listOfItems.remove(item);
				}
			}
			listOfU1.add(myNewU1);
		}
		return listOfU2;
	}
	
	public int runSimulation(ArrayList<Rocket> listOfRockets){
		int cost = 0;
		for (Rocket rocket : listOfRockets){
			cost += rocket.cost;
			System.out.println("Added cost of rocket: " + rocket.cost);
			while (!rocket.launch() || !rocket.land()){
				System.out.println("Rocket crashed! Sending another one!");
				cost += rocket.cost;
			}
		}
		return cost;
	}
	
}