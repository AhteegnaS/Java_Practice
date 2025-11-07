package polymorphism;

 class CargoPlane extends Plane {
	   void takeOff() {
			System.out.println("The Cargo plane is ready to take off...");
		}
		void fly() {
			System.out.println("the plane is flying at an average speed of 100km/hr");
		}
		void land() {
			System.out.println("Plane is about to land safely...");
			System.out.println();
		}
		
}

 class PassengerPlane extends Plane {
	   void takeOff() {
			System.out.println("Dear Passengers fight is ready to take off...");
		}
		void fly() {
			System.out.println("Dear passengers plane no.7286M is flying 27600meters aboce the sea level..");
		}
		void land() {
			System.out.println("Dear passengers the flight is reaching the airport in 10 mins , we are going to land safely in case of any turbulance inform us...");
			System.out.println();
		}
}

 class FighterPlane extends Plane {
	 void takeOff() {
			System.out.println("The fighter Jet is ready to take off...");
		}
		void fly() {
			System.out.println("Fighter Jet no.72J  is flying 27600meters aboce the sea level at a speed of 250km/hr..");
		}
		void land() {
			System.out.println("flight is reaching the airport in 10 mins , is going to land safely...");
			System.out.println();
		}
}
 
