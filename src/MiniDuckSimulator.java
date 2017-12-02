
public class MiniDuckSimulator {

	public static void main(String[] args) {
		
		Duck mallard = new MallardDuck();
		mallard.performFly();
		mallard.performQuack();
		mallard.display();
		
		Duck rubberDuck = new RubberDuck();
		rubberDuck.performFly();
		rubberDuck.performQuack();
		rubberDuck.display();
		
		Duck loudDuck = new LoudMouthDuck();
		loudDuck.performFly();
		loudDuck.performQuack();
		loudDuck.display();
		
		System.out.println("Mallard duck gets mad.");
		mallard.setQuackBehavior(new ShoutingQuack());
		System.out.println("Mallard says: ");
		mallard.performQuack();

	}

}
