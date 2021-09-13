public class Gorilla extends Mammal{

	public Gorilla(int energyLevel){
		super(energyLevel);
	}

	public void throwSomething(){
		System.out.println("They threw it!");
		this.energyLevel -= 5;
	}

	public void eatBananas(){
		System.out.println("eaten");
		this.energyLevel += 10;
	}

	public void climb(){
		System.out.println("Climbed! and Conquered! a tree.");
		this.energyLevel -= 10;
	}
}