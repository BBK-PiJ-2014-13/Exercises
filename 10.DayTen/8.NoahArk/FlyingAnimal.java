public class FlyingAnimal extends Animal {

	public FlyingAnimal(String s) {
		super(s);
	}

	@Override
	public void call() {
		System.out.println(getName() + " now flying, will come later when tired...");

	}

}
