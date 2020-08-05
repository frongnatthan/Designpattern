package v1;


public class CarBuilder {
	 public static void main(String[] args) {
		Car Eco1 = CarFactory.createCar(Car.EcoCar);
		
		Car compact = CarFactory.createCar(Car.Compact);

		Eco1.showCar();
		compact.showCar();

	}
}

