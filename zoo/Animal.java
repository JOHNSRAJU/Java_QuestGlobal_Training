package zoo;
abstract class Animal {
	protected String name;
	public Animal(String name) {
		this.name=name;
	}
	abstract void makeSound();
	void eat() {
		System.out.println(this.name+" is eating.");
	}
}
