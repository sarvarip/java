public class Rocket implements Spaceship{
	
	int cost;
	int weightLeft;
	
	public boolean launch() { return true; }
	public boolean land() { return true; }
	
	public boolean canCarry(Item item) { return item.weight <= this.weightLeft; }
	
	public void carry(Item item) { this.weightLeft -= item.weight; }
	
}