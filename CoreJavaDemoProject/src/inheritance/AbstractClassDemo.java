package inheritance;

public class AbstractClassDemo {
	public static void main(String[]ars){
		
		Peacock bird = new Peacock();
		bird.speak();
		bird.layEgg();
		bird.fly();
		
		Parrot parrot = new Parrot();
		parrot.speak();
		parrot.layEgg();
		parrot.fly();
		
		Penguine penguine = new Penguine();
		penguine.speak();
		penguine.layEgg();
		//penguine.fly(); // Cannot have fly behaviour
		
	}
	
}


abstract class Bird {
	abstract public void speak();
	public void layEgg(){
		System.out.println("Laying Eggs");
	}
}

interface Flyable {
	void fly();
}

class Peacock extends Bird implements Flyable{
	@Override
	public void speak(){
		System.out.println("Cooo Cooo");
		
	}
	
	@Override
	public void fly(){
		System.out.println("Peacock Fly normal");
	}
}

class Parrot extends Bird implements Flyable{
	@Override
	public void speak(){
		System.out.println("Tai Tai");
	}
	
	@Override
	public void layEgg(){
		System.out.println("Parror Layegg");
		
	}
	@Override
	public void fly(){
		System.out.println("Parrot Fly high");
	}
}

class Penguine extends Bird {
	@Override
	public void speak() {
		System.out.println("Squeak");
	}
}
