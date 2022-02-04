public class Item {
	String name;
	int weight;
	
	public Item(String line) {
		String[] split = line.split("=");
		name = split[0];
		weight = Integer.parseInt(split[1]);
		System.out.println("Item with name: " + name + " and weight: " + weight + " added.");
	}
}