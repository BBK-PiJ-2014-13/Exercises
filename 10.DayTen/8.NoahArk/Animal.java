public abstract class Animal {
	private String name;
	private boolean birthGiving;
	
	public Animal (String s) {
		name = s;
	}

	public abstract void call();

	public void layEggs() {
		System.out.println(name + " lay egg");
	}

	public void giveBirth() {
		System.out.println(name + " give birth");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void reproduce() {
		if (this instanceof BirthGiving) {
			System.out.println(name + " gives birth");
		} else {
			System.out.println(name + " lays eggs");
		}
	}

}
