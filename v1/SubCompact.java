package v1;

public class SubCompact implements Car{
	private int cost;
	public SubCompact(int cost){
		this.cost = cost;
	}
	
	@Override
	public void showCar() {
		System.out.println("SubCompact car cost "+this.cost);
	}
	
}