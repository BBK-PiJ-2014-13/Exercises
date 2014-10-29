public class SwimmingAnimal extends Animal {

	public SwimmingAnimal(String s) {
		super(s);
	}

	@Override
	public void call() {
		System.out.println(getName() + " will not come...");

	}

}
