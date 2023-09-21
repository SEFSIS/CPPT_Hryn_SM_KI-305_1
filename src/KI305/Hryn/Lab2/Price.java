package KI305.Hryn.Lab2;

/**
 * Клас, що представляє ціну.
 */
public class Price {
    // Поле класу
    private int sum; // Сума ціни

    /**
     * Пустий конструктор без аргументів.
     * Ініціалізує об'єкт Price з нульовою сумою.
     */
    public Price() {

    }

    /**
     * Конструктор з усіма аргументами.
     * Ініціалізує об'єкт Price з вказаною сумою ціни.
     *
     * @param sum Сума ціни.
     */
    public Price(int sum) {
        this.sum = sum;
    }

    /**
     * Перевизначений метод toString().
     *
     * @return Рядок, що представляє об'єкт Price.
     */
    @Override
    public String toString() {
        return "Price{" + "sum=" + sum + "}";
    }
}
