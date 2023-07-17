package abstractclasses;

public class Fish extends Animal {

	public Fish(String type, String size, double weight) {
		super(type, size, weight);

	}

	public void makeNoise() {
		if(type=="goldfish") {
			System.out.println("swish");
		}else {
			System.out.println("splash");
		}
	}
	@Override
	public void move(String speed) {
		if(speed.equals("slow")) {
			System.out.println(getExplictType()+"lazily swimming");
		}else {
			System.out.println(getExplictType()+"drating frantically");
		}
	}
	

}
