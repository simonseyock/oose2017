public class Car {

	private String licensePlate;
	private String owner;
	private String address;

	private Delict[] delicts;

	public Car(String Kennzeichen, String Besitzer, String Adresse) {
		this.licensePlate = Kennzeichen;
		this.owner = Besitzer;
		this.address = Adresse;

		this.delicts = new Delict[5];
	}

	public void registerDelict(Delict del) {
		for (int i = 0; i < delicts.length; i++) {
			if (delicts[i] == null) {
				delicts[i] = del;
				return;
			}
		}
	}

	public void printDelicts() {
		for (Delict del : delicts) {
			if (del == null) {
				break;
			}
			System.out.println("Geldstrafe: " + del.getFees() + " Punkte: " + del.getPoints());
		}
	}

	public String getLicensePlate() {
		return licensePlate;
	}

	public String getOwner() {
		return owner;
	}

	public String getAddress() {
		return address;
	}
}
