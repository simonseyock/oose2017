public class Sheep {
	public String name;
	public Fur fur;

	public Sheep(String name, Fur fur) {
		this.name = name;
		this.fur = fur;
	}

	public void shear() {
		fur.length = 0;
	}

	public String toString() {
		return "Name: " + name + " " + fur.toString();
	}
	
	public boolean equals(Object o){
		if (o instanceof Sheep){
			Sheep s = (Sheep)o;
			return s.name.equals(name) && s.fur.equals(fur);
		}
		return false;
	}
	
	public Sheep shallowclone() {
		return new Sheep(name, fur);
	}
	
	public Sheep deepclone(){
		Fur newFur = fur.clone();
		String newname = name;
		return new Sheep(newname, newFur);
	}
}