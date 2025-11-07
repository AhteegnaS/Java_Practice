package programupanddowncasting;

class Eagle extends Bird {
	void eat() {
		System.out.println("Eagle is eating...");
	}
	
	void fly() {
		System.out.println("Eagle is flying above the sky...");
	}
}

class Sparrow extends Bird {
	void eat() {
		System.out.println("Sparrow is eating...");
	}
	
	void fly() {
		System.out.println("Sparrow is flying...");
	}
}



public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eagle eagle = new Eagle();
		Bird bird;
		//Upcating
		bird = eagle;
		bird.eat();
		bird.sleep();
		//bird.fly(); 
		//down Casting
        ((Eagle)(bird)).fly();
        
        Sparrow sparrow = new Sparrow();
		Bird bird1;
		bird1 = sparrow;
		bird1.eat();
		bird1.sleep();
		//bird.fly();
        ((Sparrow)(bird1)).fly();
	}

}
