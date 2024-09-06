package zoo;
public class Cat extends Animal{

	public Cat(String name) {
		super(name);
	}

	@Override
	void makeSound() {
		System.out.println("Mweo! Meow!");
		
	}
	void eat() {
		System.out.println(name+" the cat is eating fish.");
	}
}
