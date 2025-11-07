package polymorphism;

public class PlaneApp {

	public static void main(String[] args) {
		PlaneParameters.accept(new CargoPlane());
		PlaneParameters.accept(new PassengerPlane());
		PlaneParameters.accept(new FighterPlane());
	}

}
