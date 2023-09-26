package KI305.Hryn.Lab3;

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

        Truck tr = new Truck(new Company("Volvo", "volvo is the best company"), new Model("MD-233"), new Price(2233));
        System.out.println(tr);
        tr.startEngine();
        tr.checkEngineStatus();
        tr.lightInfo();
        tr.setLight(true);
        tr.lightInfo();
        tr.moveObject();
        tr.turnLeft();
        tr.stopObject();

    }
}