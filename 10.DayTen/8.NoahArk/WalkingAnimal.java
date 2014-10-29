public class WalkingAnimal extends Animal {

	public WalkingAnimal(String s) {
		super(s);
	}

	@Override
	public void call() {
		System.out.println(getName() + " coming...");

	}

}
