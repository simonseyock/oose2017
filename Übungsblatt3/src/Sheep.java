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

//	public Sheep clone(boolean deep) {
//		if (deep) {
//			Fur newFur = fur.clone();
//			String newname = name;
//			return new Sheep(newname, newFur);
//		}
//		else {
//			return new Sheep(name, fur);
//		}
//	}
//	
//	public Sheep clone() {
//		return clone(false);
//	}
	
	public Sheep shallowclone() {
		return new Sheep(name, fur);
	}
	
	public Sheep deepclone(){
		Fur newFur = fur.clone();
		String newname = name;
		return new Sheep(newname, newFur);
	}
}