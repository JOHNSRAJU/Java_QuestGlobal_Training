package zoo;
class Dog extends Animal{

	public Dog(String name) {
		super(name);
	}

	@Override
	void makeSound() {
		System.out.println("Woof! Woof!");
		
	}
	void eat() {
		System.out.println(name+" the dog is eating bones.");
	}
	
}
