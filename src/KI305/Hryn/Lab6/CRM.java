package KI305.Hryn.Lab6;

/**
 * Клас, що представляє CRM (Customer Relationship Management) систему для обробки даних користувачів.
 *
 * @param <T> Тип даних, які обробляються CRM системою і реалізують інтерфейс Data.
 */
class CRM<T extends Data> {
    // Поле класу

    /**
     * Двохзв'язний список для зберігання даних користувачів в CRM системі.
     */
    private DoublyLinkedList<T> list;

    /**
     * Конструктор для створення нового об'єкту CRM системи з порожнім списком користувачів.
     */
    public CRM() {
        list = new DoublyLinkedList<>();
    }

    /**
     * Знайти об'єкт з максимальним віком серед користувачів CRM системи.
     *
     * @return Об'єкт з максимальним віком або null, якщо список порожній.
     */
    public T findMax() {
        return list.findMax();
    }

    /**
     * Додати дані користувача до CRM системи.
     *
     * @param data Дані користувача, які будуть додані до системи.
     */
    public void AddData(T data) {
        list.add(data);
        System.out.print("Element added: ");
        data.print(); // Припустимо, що в Data існує метод print() для виведення інформації.
    }

    /**
     * Видалити дані користувача за вказаним індексом з CRM системи.
     *
     * @param i Індекс користувача, якого потрібно видалити.
     */
    public void DeleteData(int i) {
        list.remove(i);
    }

    /**
     * Вивести інформацію про наступного та попереднього користувачів за вказаним індексом.
     *
     * @param index Індекс користувача, для якого потрібно вивести інформацію.
     */
    public void PrintNextAndPrevious(int index) {
        list.printNextAndPrevious(index);
    }

    /**
     * Вивести інформацію про користувача за вказаним індексом.
     *
     * @param index Індекс користувача, для якого потрібно вивести інформацію.
     */
    public void PrintUserData(int index) {
        T userData = list.getUserData(index);
        if (userData != null) {
            System.out.println("Person Information for index " + index + ":");
            userData.print(); // Припустимо, що в Data існує метод print() для виведення інформації.
        } else {
            System.out.println("Person not found for index " + index);
        }
    }
}

