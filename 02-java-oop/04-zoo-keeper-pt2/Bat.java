public class Bat extends Mammal{
    public Bat(int energyLevel){
        super(energyLevel);
    }
    public void fly(){
        if (energyLevel < 50){
            System.out.println("Too hungry to fly!");
        } else {
            System.out.println("And it sounded like a great gust of wind... to a fly.");
            this.energyLevel -= 50;
        }
    }

    public void eatHumans(){
        System.out.println("Num Num Num... tasty!");
        this.energyLevel += 25;
    }

    public void attackTown(){
        if (energyLevel < 100){
            System.out.println("Too hungry to attack!");
        } else {
            System.out.println("And the town crackled like a wood burning fireplace on a cold night.");
            this.energyLevel -= 100;
        }
    }
}