package KI305.Hryn.Lab6;

/**
 * Клас, що представляє вхідну точку програми для CRM системи.
 */
public class CRMDriver {
    /**
     * Головний метод програми, який виконує демонстрацію функціоналу CRM системи.
     *
     * @param args Масив аргументів командного рядка.
     */
    public static void main(String[] args) {
        // Створюємо об'єкт CRM системи
        CRM<? super Data> crm = new CRM<Data>();

        // Додаємо дані клієнтів та співробітників
        crm.AddData(new Customer("Leanne ", "Graham ", 2, 15));
        crm.AddData(new Employee("Ervin ", "Howell ", 73));
        crm.AddData(new Employee("Clementine ", "Bauch ", 45));
        crm.AddData(new Customer("Patricia ", "Lebsack ", 5, 27));
        crm.AddData(new Customer("Chelsey ", "Dietrich ", 10, 56));

        // Виводимо інформацію про користувача за вказаним індексом
        crm.PrintUserData(2);

        // Виводимо інформацію про попереднього та наступного користувачів за вказаним індексом
        crm.PrintNextAndPrevious(2);

        // Видаляємо дані за вказаним індексом
        crm.DeleteData(0);

        // Знаходимо користувача з максимальним віком та виводимо інформацію
        Data res = crm.findMax();
        System.out.print("A person with a maximum age: \n");
        res.print();
    }
}

