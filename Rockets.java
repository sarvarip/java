import java.util.ArrayList;

public class Rockets {
	
	public static void main(String[] args) throws Exception{
		Simulation simulation = new Simulation();
		ArrayList<Item> loadedItems = simulation.loadItems();
		System.out.println("Loaded all items");
		ArrayList<Rocket> myRockets = simulation.loadU1(loadedItems);
		int cost = simulation.runSimulation(myRockets);
		System.out.println("Final cost is: " + cost);
	}
	
}