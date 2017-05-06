
public class CarFactory {

	public static Car buildCar(String owner, String owneraddress) {
		return new Car(randomString(), owner, owneraddress);
	}

	private static String randomString() {
		java.util.Random rnd = new java.util.Random(); // oder auch klassenweit
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 6; i++) {
			sb.append((char) ((rnd.nextInt(25) + 65)));
		}
		return sb.toString();
	}

}
