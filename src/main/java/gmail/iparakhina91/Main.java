package gmail.iparakhina91;

public class Main {
    public static void main(String[] args) {

        // Математические операторы
        // сложение
        int result1 = 1 + 1;
        System.out.println("### result1: " + result1);
        // вычитание
        int result2 = 10 - 5;
        System.out.println("### result2: " + result2);
        // умножение
        int result3 = 2 * 3;
        System.out.println("### result3: " + result3);
        // деление
        int result4 = 100 / 10;
        System.out.println("### result4: " + result4);
        // остаток от деления
        int result5 = 35 % 18;
        System.out.println("### result5: " + result5);

        // Логические операторы
        // и (сокращенное)
        int a = 4, b = 5;
        if (a > 3 && b > 4) {
            System.out.println("### result6: true ");
        } else {
            System.out.println("### result6: false ");
        }
        // или (сокращенное)
        int c = 2, d = 8;
        if (c > 5 || d > 3) {
            System.out.println("### result7: true ");
        } else {
            System.out.println("### result7: false ");
        }
        // отрицание
        boolean e = true;
        System.out.println("### result8: " + !e);
        // двойное отрицание

        boolean f = true;
        System.out.println("### result9: " + !!f);

        // Переполнение при вычислениях
        byte h = Byte.MAX_VALUE;
        byte t = 1;
        System.out.println("### result10 " + (h + t));

        int s = Integer.MAX_VALUE;
        System.out.println("### result11 " + (s + 1));
    }
}