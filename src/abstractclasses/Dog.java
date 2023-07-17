package abstractclasses;

public class Dog extends Mammal {

	public Dog(String type, String size, double weight) {
		super(type, size, weight);

	}

	public void makeNoise() {
		if(type=="wolf") {
			System.out.println("howling!");
		}else {
			System.out.println("woof");
		}
	}
	@Override
	public void move(String speed) {
		if(speed.equals("slow")) {
			System.out.println(getExplictType()+"walking");
		}else {
			System.out.println(getExplictType()+"running");
		}
	}

	@Override
	public void shedHair() {
		// TODO Auto-generated method stub
		
	}
	

}
