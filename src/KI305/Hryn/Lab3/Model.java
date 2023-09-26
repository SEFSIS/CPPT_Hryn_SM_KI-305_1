package KI305.Hryn.Lab3;

/**
 * Клас, що представляє модель автомобіля.
 */
public class Model {
    // Поле класу
    private String nameModel; // Назва моделі автомобіля

    /**
     * Пустий конструктор без аргументів.
     * Ініціалізує об'єкт Model з пустою назвою моделі.
     */
    public Model(){

    }

    /**
     * Конструктор з усіма аргументами.
     * Ініціалізує об'єкт Model з вказаною назвою моделі.
     *
     * @param nameModel Назва моделі автомобіля.
     */
    public Model(String nameModel){
        this.nameModel = nameModel;
    }

    /**
     * Перевизначений метод toString().
     *
     * @return Рядок, що представляє об'єкт Model.
     */
    @Override
    public String toString() {
        return "Model{" +
                "name:'" + nameModel + '\'' +
                '}';
    }
}