package KI305.Hryn.Lab2;

/**
 * Головний клас, який представляє програму для водія автомобіля.
 */
public class AutomobileDriver {
    /**
     * Головний метод програми.
     *
     * @param args Масив рядків аргументів командного рядка.
     */
    public static void main(String[] args) {

        // Ініціалізація полів
        Company company = new Company("Ford", "Ford Motor Company, \"Ford Motor Company\"  is an American automobile company.");
        Model model = new Model("Mustang");
        Price price = new Price(34000);

        // Зміна полів за допомогою метода Сет і відображення зміненого за допомогою метода Гет
        Automobile automobile = new Automobile(company, model, price);
        System.out.println(automobile);

        automobile.setCompany(new Company("Mercedes", "Mercedes-Benz Group AG (Mercedes-Benz), formerly Daimler AG, is an automobile company."));
        System.out.println(automobile.getCompany());

        automobile.setModel(new Model("CLS"));
        System.out.println(automobile.getModel());

        automobile.setPrice(new Price(55000));
        System.out.println(automobile.getPrice());

        // Виклик усіх методів класу
        automobile.startEngine();
        automobile.brake();
        automobile.turnLeft();
        automobile.turnRight();
        automobile.checkEngineStatus();
        automobile.turnOnHeadlights();
        automobile.checkFuelLevel();
        automobile.lockDoors();
        automobile.stopEngine();
    }
}