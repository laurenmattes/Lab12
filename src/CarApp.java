import java.util.Scanner;

public class CarApp {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		Car myCar = new Car();
		System.out.println("Welcome to the Gand Circus Motors admin console!");
		System.out.println();
		System.out.println("How many cars are you entering?");
		int userNum = scnr.nextInt();

		scnr.nextLine();

		for (int i = 0; i < userNum; i++) {

			myCar.setMake(Validator.getString(scnr, "Car " + "Make: "));
			myCar.setModel(Validator.getString(scnr, "Car " + "Model: "));
			myCar.setYear(Validator.getInt(scnr, "Car " + "Year: ", 1950, 2019));
			myCar.setPrice(Validator.getDouble(scnr, "Car " + "Price: "));

			// for (Car cars : ) {
			// List<Car> Car = new ArrayList<>();
			// Car.add( new Car() );

			// System.out.println(Car.getClass());

			System.out.println("Curent Inventory: ");
			System.out.println();
			System.out.println(
					(myCar).getMake() + " " + myCar.getModel() + " " + myCar.getYear() + " " + myCar.getPrice());

			// }
		}
	}
}
