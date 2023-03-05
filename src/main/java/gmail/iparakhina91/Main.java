package gmail.iparakhina91;

public class Main {
    public static void main(String[] args) {

        // Арифметические операторы
        int a = 20;
        int b = 30;
        int c = 70;
        int d = 5;
        double e = 2.458;

        // сложение
        System.out.println("a + b = " + (a + b));
        System.out.println("a + e = " + (a + e));
        // вычитание
        System.out.println("a - b = " + (a - b));
        System.out.println("a - e = " + (a - e));
        // умножение
        System.out.println("a * b = " + (a * b));
        System.out.println("a * e = " + (a * e));
        // деление
        System.out.println("b / a = " + (b / a));
        System.out.println("a / e = " + (a / e));
        // получение остатка от деления
        System.out.println("b % a = " + (b % a));
        System.out.println("a % e = " + (a % e));
        // инкремент (с разным расположением ++)
        System.out.println("a++ = " + (a++));
        System.out.println("++a = " + (++a));
        System.out.println("e++ = " + (e++));
        System.out.println("++e = " + (++e));
        // декремент (с разным расположением --)
        System.out.println("a-- = " + (a--));
        System.out.println("--a = " + (--a));
        System.out.println("e-- = " + (e--));
        System.out.println("--e = " + (--e));
        // примеры на приоритеты арифметических операторов
        System.out.println("a + b * c = " + (a + b * c));
        System.out.println("(a + b) * c = " + ((a + b) * c));
        System.out.println("a - c / b = " + (a - c / b));
        System.out.println("(c - a) / b = " + ((c - a) / b));
        System.out.println("a + c % b = " + (a + c % b));
        System.out.println("a + b * c / e = " + (a + b * c / e));
        System.out.println("a + b * c - d / e = " + (a + b * c - d / e));

        // Логические операторы
        boolean f = true;
        boolean g = false;
        // и (сокращенное)
        System.out.println("f && g = " + (f&&g));
        // или (сокращенное)
        System.out.println("f || g = " + (f||g));
        // не
        System.out.println("! (f && g) = " + (!(f&&g)));

        // Переполнение при вычислениях
        // для byte
        byte m = Byte.MAX_VALUE;
        byte l = Byte.MIN_VALUE;
        System.out.println("Byte.MAX_VALUE + 1 = " + (m + 1));
        System.out.println("Byte.MIN_VALUE - 1 = " + (l - 1));
        // для int
        int h = Integer.MAX_VALUE;
        int k = Integer.MIN_VALUE;
        System.out.println("Integer.MAX_VALUE + 1 = " + (h + 1));
        System.out.println("Integer.MIN_VALUE - 1 = " + (k - 1));


    }
}