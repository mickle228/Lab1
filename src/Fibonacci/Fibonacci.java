package Fibonacci;

/**
 * Клас чисел Фібоначчі з полями <b>data</b> і <b>number</b>
 * @author Качановський Олег
 */
public class Fibonacci
{
    /** Поле значення числа Фібоначчі */
    private long data;
    /** Поле номер числа Фібоначчі */
    private int number;

    /**
     * Функція отримання поля {@link Fibonacci#data}
     * @return data - значення числа Фібоначчі
     */
    public long getData() {
        return data;
    }
    /**
     * Функція отримання поля {@link Fibonacci#number}
     * @return number - номер числа Фібоначчі
     */
    public int getNumber() {
        return number;
    }

    /**
     * Функція задання поля {@link Fibonacci#data}
     * @param data значення числа Фібоначчі
     */
    public void setData(long data) {
        this.data = data;
    }

    /**
     * Функція задання поля {@link Fibonacci#number}
     * @param number номер числа Фібоначчі
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * Конструктор за параметрами
     * @param data значення числа Фібоначчі
     * @param number номер числа Фібоначчі
     */
    public Fibonacci(long data, int number)
    {
        this.data = data;
        this.number = number;
    }

}