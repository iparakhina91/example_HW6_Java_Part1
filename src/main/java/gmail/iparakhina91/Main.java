package gmail.iparakhina91;

public class Main {
    public static void main(String[] args) {

        // Арифметические операторы
        int a = 20;
        int b = 30;
        int c = 70;
        // сложение
        System.out.println("a + b = " + (a + b));
        // вычитание
        System.out.println("a - b = " + (a - b));
        // умножение
        System.out.println("a * b = " + (a * b));
        // деление
        System.out.println("b / a = " + (b / a));
        // получение остатка от деления
        System.out.println("b % a = " + (b % a));
        // инкремент (с разным расположением ++)
        System.out.println("a++ = " + (a++));
        System.out.println("++a = " + (++a));
        // декремент (с разным расположением --)
        System.out.println("a-- = " + (a--));
        System.out.println("--a = " + (--a));

        // примеры на приоритеты арифметических операторов
        System.out.println("a + b * с = " + (a + b * c));
        System.out.println("(a + b) * с = " + ((a + b) * c));
        System.out.println("a - c / b = " + (a - c / b);
        System.out.println("(c - a) / b = " + ((c - a) / b);
        System.out.println("a + c % b = " + (a + c % b);

        // Логические операторы
        boolean e = true;
        boolean f = false;
        // и (сокращенное)
        System.out.println("e && f = " + (e&&f));
        // или (сокращенное)
        System.out.println("e || f = " + (e||f));
        // не
        System.out.println("! (e && f) = " + (!(e&&f)));

        // Переполнение при вычислениях

    }
}