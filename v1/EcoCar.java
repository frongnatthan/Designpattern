package v1;

public class EcoCar implements Car{
	private int cost;
	public EcoCar(int cost){
		this.cost = cost;
	}
	
	@Override
	public void showCar() {
		System.out.println("Eco car cost "+this.cost);
	}
	
}