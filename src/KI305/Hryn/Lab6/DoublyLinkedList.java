package KI305.Hryn.Lab6;

/**
 * Клас, що представляє двохзв'язний список (DoublyLinkedList).
 *
 * @param <T> Тип даних, які зберігаються в списку.
 */
class DoublyLinkedList<T extends Data> {
    // Поля класу

    /**
     * Перший вузол (голова) списку.
     */
    private Node<T> head;

    /**
     * Останній вузол (хвіст) списку.
     */
    private Node<T> tail;

    /**
     * Конструктор для створення порожнього двохзв'язного списку.
     */
    public DoublyLinkedList() {
        head = null;
        tail = null;
    }

    /**
     * Додати дані до списку.
     *
     * @param data Дані, які будуть додані до списку.
     */
    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }

    /**
     * Видалити елемент зі списку за вказаним індексом.
     *
     * @param index Індекс елемента, який потрібно видалити.
     */
    public void remove(int index) {
        if (index < 0 || head == null) {
            return;
        }

        if (index == 0) {
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                head = head.next;
                head.prev = null;
            }
            return;
        }

        Node<T> current = head;
        int currentIndex = 0;
        while (current != null && currentIndex < index) {
            current = current.next;
            currentIndex++;
        }

        if (current != null) {
            current.prev.next = current.next;
            if (current.next != null) {
                current.next.prev = current.prev;
            } else {
                tail = current.prev;
            }
        }
    }

    /**
     * Знайти об'єкт з максимальним віком в списку.
     *
     * @return Об'єкт з максимальним віком або null, якщо список порожній.
     */
    public T findMax() {
        if (head == null) {
            return null;
        }

        Node<T> current = head;
        T max = head.data;

        while (current != null) {
            if (current.data.compareTo(max) > 0) {
                max = current.data;
            }
            current = current.next;
        }

        return max;
    }

    /**
     * Вивести інформацію про наступний та попередній елементи вузла.
     *
     * @param node Вузол, для якого потрібно вивести інформацію.
     */
    public void printNextAndPrevious(Node<T> node) {
        if (node == null) {
            System.out.println("Node is null.");
            return;
        }

        if (node.prev != null) {
            System.out.println("Previous element: " + node.prev.data.getName());
        } else {
            System.out.println("No previous element (head of the list).");
        }

        if (node.next != null) {
            System.out.println("Next element: " + node.next.data.getName());
        } else {
            System.out.println("No next element (tail of the list).");
        }
    }

    /**
     * Вивести інформацію про наступний та попередній елементи вузла за вказаним індексом.
     *
     * @param index Індекс вузла, для якого потрібно вивести інформацію.
     */
    public void printNextAndPrevious(int index) {
        if (head == null || index < 0) {
            System.out.println("Invalid index.");
            return;
        }

        Node<T> current = head;
        int currentIndex = 0;
        while (current != null && currentIndex < index) {
            current = current.next;
            currentIndex++;
        }

        printNextAndPrevious(current);
    }

    /**
     * Отримати дані користувача за вказаним індексом.
     *
     * @param index Індекс користувача, для якого потрібно отримати дані.
     * @return Об'єкт даних користувача або null, якщо індекс виходить за межі списку.
     */
    public T getUserData(int index) {
        if (index < 0 || head == null) {
            return null;
        }

        Node<T> current = head;
        int currentIndex = 0;
        while (current != null && currentIndex < index) {
            current = current.next;
            currentIndex++;
        }

        if (current != null) {
            return current.data;
        }

        return null; // Повертаємо null, якщо індекс виходить за межі списку.
    }
}
