package KI305.Hryn.Lab3;

/**
 * Клас, який представляє вантажний автомобіль.
 * Вантажний автомобіль є розширенням класу Automobile та реалізує інтерфейс ILights для керування світлами.
 */
public class Truck extends Automobile implements ILights {
    private boolean lights;
    /**
     * Конструктор без параметрів для вантажного автомобіля.
     * Створює вантажний автомобіль з вимкнутими світлами за замовчуванням.
     */
    public Truck(){
        super();
        lights = false;
    }

    public Truck(Company company, Model model, Price price) {
       super(company,model,price);

    }
    /**
     * Перевизначений метод для переміщення вантажного автомобіля.
     */
    @Override
    public void moveObject() {
        System.out.println("Object is moving");
    }
    /**
     * Перевизначений метод для зупинки вантажного автомобіля.
     */
    @Override
    public void stopObject() {
        System.out.println("Object stopped");
    }

    @Override
    public void setLights(boolean data) {

    }
    /**
     * Реалізація методу інтерфейсу ILights для виведення інформації про стан фар.
     */
    @Override
    public void lightInfo() {
        if (lights)
            System.out.println("Lights is on");
        else
            System.out.println("Lights is off");
    }

    public void setLight(boolean data) {
        this.lights = data;
    }
}
