package abstractclasses;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Dog dog = new Dog("animal", "big", 100);
		dog.makeNoise();
		doAnimalStuff(dog);
		ArrayList<Animal> animals=new ArrayList<>();
		animals.add(dog);
		animals.add(new Dog("german","big",150));
		animals.add(new Fish("barr","small",1));
		animals.add(new Horse("wdw","large",1000));
		for(Animal animal:animals) {
			doAnimalStuff(animal);
			if(animal instanceof Mammal currentMammal) {
				currentMammal.shedHair();
			}
		}
	}

	private static void doAnimalStuff(Animal animal) {
		animal.makeNoise();
		animal.move("slow");
	}
	
}
