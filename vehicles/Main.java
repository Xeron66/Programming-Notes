package vehicles;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Cars> cars = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String choice;

        while (true) {
            Cars car = new Cars();

            System.out.println("Enter Company: ");
            car.setCompany(sc.nextLine());

            System.out.println("Enter Model: ");
            car.setModel(sc.nextLine());

            System.out.println("Enter Year: ");
            car.setYear(sc.nextInt());
            sc.nextLine();

            cars.add(car);

            System.out.println("Add Mode Cars? (Y/N)");
            choice = sc.nextLine();

            if (!choice.equalsIgnoreCase("Y")) {
                break;
            }
        }

        System.out.println("Added Cars:");
        for (int i = 0; i < cars.size(); i++) {
            Cars car = cars.get(i);
            System.out
                    .println("Company: " + car.getCompany() + " Model: " + car.getModel() + " Year: " + car.getYear());
        }

        sc.close();
    }
}
