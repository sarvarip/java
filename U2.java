public class U2 extends Rocket{
	
	U2(){
		super.cost = 120;
		super.weightleft = 11000;
	}
	
	public boolean launch() { 
		return !(Math.random() < (0.04 * (1- (super.weightLeft / 11000.0)))); 
	}
	
	public boolean land() {
		return !(Math.random() < (0.08 * (1- (super.weightLeft / 11000.0))));
	} 
	
}