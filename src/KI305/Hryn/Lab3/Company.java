package KI305.Hryn.Lab3;

/**
 * Клас, що представляє інформацію про компанію.
 */
public class Company {
    // Поля класу
    private String nameCompany; // Назва компанії
    private String infoCompany; // Інформація про компанію

    /**
     * Пустий конструктор без аргументів.
     * Ініціалізує об'єкт Company з пустими значеннями.
     */
    public Company(){

    }

    /**
     * Конструктор з усіма аргументами.
     * Ініціалізує об'єкт Company з вказаними параметрами.
     *
     * @param nameCompany Назва компанії.
     * @param infoCompany Інформація про компанію.
     */
    public Company(String nameCompany, String infoCompany){
        this.nameCompany = nameCompany;
        this.infoCompany = infoCompany;
    }

    /**
     * Перевизначений метод toString().
     *
     * @return Рядок, що представляє об'єкт Company.
     */
    @Override
    public String toString() {
        return "Company{" +
                "name='" + nameCompany + '\'' +
                ", info='" + infoCompany + '\'' +
                '}';
    }
}
