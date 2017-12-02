
public class LoudMouthDuck extends Duck {

	public LoudMouthDuck() {
		quackBehavior = new ShoutingQuack();
		flyBehavior = new FlyWithWings();
	}
	
	@Override
	public void display() {
		System.out.println("I'm a Loud Mouth duck");

	}

	@Override
	public void performFly() {
		flyBehavior.fly();

	}

	@Override
	public void performQuack() {
		quackBehavior.quack();

	}

}
