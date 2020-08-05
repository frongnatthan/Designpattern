package v1;

public class Compact implements Car{
	private int cost;
	public Compact(int cost){
		this.cost = cost;
	}
	
	@Override
	public void showCar() {
		System.out.println("Compact car cost "+this.cost);
	}
	
}