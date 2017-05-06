import java.util.ArrayList;

public class TrafficOffice {

	private ArrayList<Car> cars;

	public TrafficOffice() {
		cars = new ArrayList<Car>();
	}

	public void registerCar(Car c) {
		if (cars.size() <= 100) {
			cars.add(c);
		}
	}

	public Car getCar(String licensePlate) {
		Car car = null;
		for (Car c : cars) {
			if (c.getLicensePlate().equals(licensePlate)) {
				car = c;
				break;
			}
		}
		return car;
	}

}
