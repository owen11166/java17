package abstractclasses;
abstract class Mammal extends Animal{

	public Mammal(String type, String size, double weight) {
		super(type, size, weight);
		
	}
	public void move(String speed) {
		System.out.println(getExplictType()+"");
	}
	public abstract void shedHair();
	
}

public abstract class Animal {
	protected String type;
	private String size;
	private double weight;
	public Animal(String type, String size, double weight) {

		this.type = type;
		this.size = size;
		this.weight = weight;
	}
	public abstract void move(String speed);
	public abstract void makeNoise();
	public  final String getExplictType() {
		return getClass().getSimpleName()+"("+type+")";
	}
}
