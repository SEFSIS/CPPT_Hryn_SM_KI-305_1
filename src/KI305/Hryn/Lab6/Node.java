package KI305.Hryn.Lab6;

/**
 * Клас, що представляє вузол (Node) для двохзв'язного списку (DoublyLinkedList).
 *
 * @param <T> Тип даних, які зберігаються в вузлі.
 */
class Node<T extends Data> {
    // Поля класу

    /**
     * Дані, які зберігаються в вузлі.
     */
    T data;

    /**
     * Посилання на попередній вузол.
     */
    Node<T> prev;

    /**
     * Посилання на наступний вузол.
     */
    Node<T> next;

    /**
     * Конструктор для створення об'єкту вузла з заданими даними.
     *
     * @param data Дані, які будуть збережені в вузлі.
     */
    public Node(T data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
