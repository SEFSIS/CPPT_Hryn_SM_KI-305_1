package KI305.Hryn.Lab6;
/**
 * Клас, що представляє об'єкт клієнта в CRM системі.
 */
class Customer implements Data {
    // Поля класу

    /**
     * Ім'я клієнта.
     */
    private String customerName;
    /**
     * Прізвище клієнта.
     */
    private String customerSurname;
    /**
     * Кількість покупок клієнта.
     */
    private int numberOfPurchases;
    /**
     * Вік клієнта.
     */
    private int age;
// Конструктор

    /**
     * Конструктор для створення об'єкта клієнта з заданими параметрами.
     *
     * @param cName              Ім'я клієнта.
     * @param cSurname           Прізвище клієнта.
     * @param cNumberOfPurchases Кількість покупок клієнта.
     * @param cAge               Вік клієнта.
     */
    public Customer(String cName, String cSurname, int cNumberOfPurchases, int cAge) {
        customerName = cName;
        customerSurname = cSurname;
        numberOfPurchases = cNumberOfPurchases;
        age = cAge;
    }
// Методи доступу до полів

    /**
     * Отримати ім'я клієнта.
     *
     * @return Ім'я клієнта.
     */
    public String getCustomerName() {
        return customerName;
    }
    /**
     * Отримати прізвище клієнта.
     *
     * @return Прізвище клієнта.
     */

    public String getCustomerSurname() {
        return customerSurname;
    }
    /**
     * Встановити ім'я клієнта.
     *
     * @param name Нове ім'я клієнта.
     */
    public void setCustomerName(String name) {
        customerName = name;
    }
    /**
     * Встановити прізвище клієнта.
     *
     * @param surname Нове прізвище клієнта.
     */

    public void setCustomerSurname(String surname) {
        customerSurname = surname;
    }
    /**
     * Отримати кількість покупок клієнта.
     *
     * @return Кількість покупок клієнта.
     */

    public int getNumberOfPurchases() {
        return numberOfPurchases;
    }
    /**
     * Встановити кількість покупок клієнта.
     *
     * @param n Нова кількість покупок клієнта.
     */

    public void setNumberOfPurchases(int n) {
        numberOfPurchases = n;
    }
    /**
     * Отримати вік клієнта.
     *
     * @return Вік клієнта.
     */
    public int getAge() {
        return age;
    }
    // Реалізація інтерфейсу Data

    /**
     * Порівняти клієнта за віком.
     *
     * @param c Об'єкт для порівняння з поточним клієнтом.
     * @return Результат порівняння (негативне, нуль або позитивне число).
     */

    public int compareTo(Data c) {
        Integer a = age;
        return a.compareTo(c.getAge());
    }
    /**
     * Вивести інформацію про клієнта.
     */
    public void print() {
        System.out.print("Customer`s Name: " + customerName + "Customer`s Surname: " + customerSurname + ", Number of purchases: " + numberOfPurchases +
                ", Customer`s Age: " + age + ";\n");
    }
    /**
     * Отримати ім'я клієнта.
     *
     * @return Ім'я клієнта.
     */
    @Override
    public String getName() {
        return "Customer: " + customerName + customerSurname;
    }
}
