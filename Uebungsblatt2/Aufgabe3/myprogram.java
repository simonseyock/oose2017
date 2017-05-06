
public class myprogram {

	public static void main(String[] args) {
		// Car car1 = new Car("K-LS 1992","Erika M.","Kölnerstraße 11");
		// Car car2 = new Car("B-HK 3425", "Hans K.","Salzweg 3");
		// System.out.println(car1.getOwner() + " mit dem Kennzeichen: " + car1.getLicensePlate() + " hat die Adresse " + car1.getAddress() + ".");
		// System.out.println(car2.getOwner() + " mit dem Kennzeichen: " + car2.getLicensePlate() + " hat die Adresse " + car2.getAddress() + ".");

		Car car1 = CarFactory.buildCar("Max M.", "Kreuzbergweg 2");
		Car car2 = CarFactory.buildCar("Simon S.", "Roemerstraße 164");
		TrafficOffice to1 = new TrafficOffice();
		to1.registerCar(car1);
		to1.registerCar(car2);

		// Sollte Max M. ausgeben::
		System.out.println(to1.getCar(car1.getLicensePlate()).getOwner());

		car2.registerDelict(new Delict(2, 48.5));
		car2.registerDelict(new Delict(0, 20.));

		// Sollte K-LM 5135 und Simon S. ausgeben:
		System.out.println("Delikte fuer " + car2.getLicensePlate() + " (" + car2.getOwner() + "):");

		// Sollte die zwei obigen Delikte ausgeben:
		car2.printDelicts();
	}
}
