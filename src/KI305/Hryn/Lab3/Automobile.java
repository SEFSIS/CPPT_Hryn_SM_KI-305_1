package KI305.Hryn.Lab3;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Клас, що представляє автомобіль та зберігає інформацію про нього.
 */
public abstract class Automobile {
    //Поля класу
    private Company company;
    private Model model;
    private Price price;

    //Поле для запису протоколу
    private PrintWriter logWriter;

    /**
     * Пустий конструктор без аргументів.
     * Ініціалізує об'єкт Automobile та створює файл протоколу.
     */
    //Пустий конструктор без аргументів
    public Automobile() {
        try {
            logWriter = new PrintWriter(new FileWriter("C:\\Users\\User\\IdeaProjects\\java_lab\\src\\KI305\\Hryn\\Lab3\\Automobile.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Конструктор зі всіма аргументами
    public Automobile(Company company, Model model, Price price) {
        this.company = company;
        this.model = model;
        this.price = price;
        try {
            logWriter = new PrintWriter(new FileWriter("C:\\Users\\User\\IdeaProjects\\java_lab\\src\\KI305\\Hryn\\Lab3\\Automobile.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Абстрактні методи класу
    public abstract void moveObject();
    public abstract void stopObject();

    //Гетери і сетери для об'єктів класу
    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    /**
     * Метод для запису дій в файл протоколу.
     *
     * @param activity Дія, яку потрібно зареєструвати в протоколі.
     */

    private void logActivity(String activity) {
        if (logWriter != null) {
            logWriter.println(activity);
            logWriter.flush();
        }
    }

    //Методи для роботи з автомобілем
    public void startEngine() {
        System.out.println("Starting the car engine.");
        logActivity("We started the car engine.");//Запис у протокол
    }

    public void brake() {
        System.out.println("Turning on the brakes.");
        logActivity("We turned on the brakes.");//Запис у протокол
    }

    public void turnLeft() {
        System.out.println("Turning to the left.");
        logActivity("We turned to the left.");//Запис у протокол
    }

    public void turnRight() {
        System.out.println("Turning to the right.");
        logActivity("We turned to the right.");//Запис у протокол
    }

    public void checkEngineStatus() {
        System.out.println("Сhecking the condition of the engine.");
        logActivity("We checked the condition of the engine.");//Запис у протокол
    }

    public void turnOnHeadlights() {
        System.out.println("Turning on the headlights.");
        logActivity("We turned on the headlights.");//Запис у протокол
    }

    public void checkFuelLevel() {
        System.out.println("Сhecking the level of the fuel tank in the car.");
        logActivity("We checked the level of the fuel tank in the car.");//Запис у протокол
    }

    public void lockDoors() {
        System.out.println("Locking the doors.");
        logActivity("We locked the doors.");//Запис у протокол
    }

    public void stopEngine() {
        System.out.println("Stopping the car engine.");
        logActivity("We stopped the car engine.");//Запис у протокол
        closeLogFile();//Закриваємо файл при завершенні роботи
    }

    // Метод для закриття файлу протоколу
    private void closeLogFile() {
        if (logWriter != null) {
            logWriter.close();
        }
    }
    //Метод toString()
    @Override
    public String toString() {
        return "Automobile: Company : " + company + ", Model : " + model + ", Price : " + price;
    }


}
