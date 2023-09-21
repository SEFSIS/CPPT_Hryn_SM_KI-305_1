package KI305.Hryn.Lab6;

/**
 * Клас, що представляє об'єкт співробітника в CRM системі.
 */
class Employee implements Data {
    // Поля класу

    /**
     * Ім'я співробітника.
     */
    private String employeeName;

    /**
     * Прізвище співробітника.
     */
    private String employeeSurname;

    /**
     * Вік співробітника.
     */
    private int employeeAge;

    // Конструктор

    /**
     * Конструктор для створення об'єкта співробітника з заданими параметрами.
     *
     * @param eName      Ім'я співробітника.
     * @param eSurname   Прізвище співробітника.
     * @param eAge       Вік співробітника.
     */
    public Employee(String eName, String eSurname, int eAge) {
        employeeName = eName;
        employeeSurname = eSurname;
        employeeAge = eAge;
    }

    // Методи доступу до полів

    /**
     * Отримати ім'я співробітника.
     *
     * @return Ім'я співробітника.
     */
    public String getName() {
        return "Employees`s Name: " + employeeName + employeeSurname;
    }

    /**
     * Встановити ім'я співробітника.
     *
     * @param name Нове ім'я співробітника.
     */
    public void setEmployeeName(String name) {
        employeeName = name;
    }

    /**
     * Встановити прізвище співробітника.
     *
     * @param surname Нове прізвище співробітника.
     */
    public void setEmployeeSurname(String surname) {
        employeeSurname = surname;
    }

    /**
     * Встановити вік співробітника.
     *
     * @param n Новий вік співробітника.
     */
    public void setEmployeeAge(int n) {
        employeeAge = n;
    }

    /**
     * Отримати вік співробітника.
     *
     * @return Вік співробітника.
     */
    public int getAge() {
        return employeeAge;
    }

    // Реалізація інтерфейсу Data

    /**
     * Порівняти співробітника за віком.
     *
     * @param e Об'єкт для порівняння з поточним співробітником.
     * @return Результат порівняння (негативне, нуль або позитивне число).
     */
    public int compareTo(Data e) {
        Integer a = employeeAge;
        return a.compareTo(e.getAge());
    }

    /**
     * Вивести інформацію про співробітника.
     */
    public void print() {
        System.out.print("Employee`s Name: " + employeeName + "Employee`s Surname: " + employeeSurname + ", Employee`s Age: " + employeeAge + ";\n");
    }
}
