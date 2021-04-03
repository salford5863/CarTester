
public class CarFactory {
	
	public Car getCar(String carType) {
		if(carType == null){
	         return null;
	      }	
		
		if(carType.equalsIgnoreCase("Fast")){
	         return new FastCar();
		} else if (carType.equalsIgnoreCase("Family")){
	         return new FamilyCar();
		}
		return null;
	}	

}
