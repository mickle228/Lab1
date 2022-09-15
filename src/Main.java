import java.util.Scanner;
import Fibonacci.Fibonacci;

/**
 * Клас Main - основний клас програми
 * @author Качановський Олег
 */
public class Main
{
    /**
     * Пустий конструктор
     */
    public Main() {}
    /**
     * Створити, заповнити і вивести на екран масив чисел Фібоначчі
     * @param size розмір масиву
     * @return - масив об'єктів класу {@link Fibonacci}
     */
    static Fibonacci[] CreateArrayOfObjects(int size)
    {
        Fibonacci[] Array = new Fibonacci[size]; // масив об'єктів
        Array[0] =  new Fibonacci(1,1); // задання перших 2 чисел Фібоначчі
        Array[1] = new Fibonacci(1,2);
        for (int i = 2; i < size; i++) // заповнення масиву відповідними даними
        {
            Array[i] = new Fibonacci(Array[i-1].getData() + Array[i-2].getData(), i+1);
        }
        System.out.println("Fibonacci`s numbers: ");
        for (int i = 0; i < size; i++) // вивід масиву на екран
        {
            System.out.println("Number: "+Array[i].getNumber()+" Data: "+Array[i].getData());
        }
        return Array;
    }

    /**
     * Задання N
     * @return N - кількість чисел Фібоначчі які потрібно перевірити за умовою в {@link Main#Check(Fibonacci[], int)}
     */
    static int setN()
    {
        System.out.print("\nEnter the N: ");
        Scanner myScanner = new Scanner(System.in);
        return myScanner.nextInt(); // N
    }
    static int setSize()
    {
        int size;
        do{
            System.out.print("Enter the size: ");
            Scanner myScanner = new Scanner(System.in);
            size =  myScanner.nextInt();
        }while(size>0 && size<92);

        return size;
    }
    /**
     * Перевірка умови w*w+1 = число Фібоначчі і вивести результати на екран, w - натуральне число
     * @param Array масив чисел Фібоначчі
     * @param N кількість перевіряємих чисел Фібоначчі
     */
    static void Check(Fibonacci[] Array, int N)
    {
        System.out.println("\nResult: ");
        for (int i = 0; i < N; i++) // алгоритм перевірки
        {
            for (int w = 1; ; w++)
            {
                if ((long) w*w + 1 == Array[i].getData())
                {
                    System.out.println(Array[i].getData());
                }
                else if ((long) w*w + 1 > Array[i].getData()) // додаткова умова для скорочення роботи алгоритму
                {
                    break;
                }
            }

        }
    }

    /**
     * Основний метод програми
     * @param args значення командного рядка
     */
    public static void main(String[] args)
    {
        Fibonacci[] Array = CreateArrayOfObjects(setSize());
        int N = setN(); // кількість чисел для перевірки
        Check(Array,N);
    }
}