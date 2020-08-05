package v1;
public class CarFactory{
	public static Car createCar(String type){
		if(type.equals(Car.EcoCar)){
            return new EcoCar(100000);
        }
        
        else if(type.equals(Car.Compact)){
            return new Compact(200000);
        }
        else if(type.equals(Car.SubCompact)){
            return new SubCompact(300000);
        }
        else{
            return null;
            }
		
	}
}
