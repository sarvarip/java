public class U1 extends Rocket{
	
	U1(){
		super.cost = 100;
		super.weightleft = 8000;
	}
	
	public boolean launch() { 
		return !(Math.random() < (0.05 * (1- (super.weightLeft / 8000.0)))); 
	}
	
	public boolean land() {
		return !(Math.random() < (0.01 * (1- (super.weightLeft / 8000.0))));
	} 
	
}
	