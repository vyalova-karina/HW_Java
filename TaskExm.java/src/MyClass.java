import java.util.Scanner;
import java.util.Arrays;

public class MyClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// 1 Напишите программу, которая присваивает трем переменным значения 100, 200 и 300.
// Выведите на печать значения переменных в столбик, а затем в строку через пробел.

        int a = 100;
        int b = 200;
        int c = 300;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(a + " " + b + " " + c);

// 2 Напишите программу, которая принимает три числа - год, месяц и день и выводит на печать фразу:
// DD:MM:YYYY. Проверять валидность даты не требуется.

        String year = sc.next();
        String month = sc.next();
        String date = sc.next();
        System.out.println(date + ":" + month + ":" + year);

// 3 Реализуйте простые домашние часы.
// На вход подаётся число секунд, которое прошло с момента начала суток (00:00:00).
// Выведите текущее время в формате ЧЧ:ММ:СС.

        int sec = sc.nextInt();
        int seconds = sec % 60;
        int minutes = (sec % 3600) / 60;
        int hours = (sec % 86400) / 3600;
        System.out.println(String.format("%02d", hours) + ":" + String.format("%02d", minutes) + ":" + String.format("%02d", seconds));

// 4 На вход подаётся натуральное число n.
// Выведите на печать числа n - 1, n, n + 1 в одну строку, через пробел.

        int num = sc.nextInt();
        System.out.println(--num + " " + ++num + " " + ++num);

// 5 На вход подаются два числа.
// Выведите сначала их сумму, а на следующей строке переведите числа в строковый формат и сложите в строковом формате.

        int st1 = sc.nextInt();
        int st2 = sc.nextInt();
        int st3 = st1 + st2;
        System.out.println(st3);
        String str1 = Integer.toString(st1);
        String str2 = Integer.toString(st2);
        System.out.println(str1 + str2);

// 6 На вход подаётся целое число.
// Выведите "YES", если оно нацело делится на 7, и "NO" - если нет.

        int numb = sc.nextInt();
        if (numb % 7 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

// 7 На вход подаются два целых числа.
// Выведите на печать true, если их сумма чётна, а произведение - нечётно, и false - в противном случае.

        int firstN = sc.nextInt();
        int secondN = sc.nextInt();
        if ((secondN + firstN) % 2 == 0 && (secondN * firstN) % 2 != 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

// 8 На вход подаётся три целых числа.
// Выведите среднее из них (т.е. не минимальное и не максимальное).

        int frstN = sc.nextInt();
        int scndN = sc.nextInt();
        int thrdN = sc.nextInt();

        if (frstN >= scndN & frstN <= thrdN || frstN <= scndN & frstN >= thrdN) {
            System.out.print(frstN);
        } else if (frstN <= scndN & scndN <= thrdN || frstN >= scndN & scndN >= thrdN) {
            System.out.print(scndN);
        } else {
            System.out.print(thrdN);
        }

// 9 на вход подаётся два натуральных числа - n и m.
// Напечатайте число n, повторённое m раз в одной строке через пробел.

        int n = sc.nextInt();
        int m = sc.nextInt();
        int i = 1;
        for (; i <= m; i++) {
            System.out.print(n + " ");
        }

// 10 На вход подаётся натуральное число n.
// Создайте массив натуральных чисел от единицы до n включительно и выведите его на печать (в одной строке, через пробел).

        int vrbl = sc.nextInt();
        int[] massiv = new int[vrbl];
        for (int k = 1; k <= vrbl; k++) {
            massiv[k - 1] = k;

        }
        for (int k = 0; k < massiv.length; k++) {
            System.out.print(massiv[k] + " ");
        }

// 11 На вход подаётся натуральное число n, затем несколько целых чисел, разделённых пробелом, а на следующей строке - натуральное число k.
// Выведите k-е по счёту число по возрастанию. Если такого числа нет, выведите "Ошибка ввода".

        int numberCount = sc.nextInt();
        sc.nextLine();
        int[] numbers = new int[numberCount];
        String[] strings = sc.nextLine().split(" ");
        if (strings.length < numberCount) System.out.println("Ошибка ввода");

        for (int p = 0; p < numbers.length; p++) {
            numbers[p] = Integer.parseInt(strings[p]);
        }

        Arrays.sort(numbers);
        int index = sc.nextInt();

        if (index > numbers.length || index < 0) System.out.println("Ошибка ввода");
        else System.out.println(numbers[index - 1]);

// 12 На вход подаётся строка текста. Определите, в каком по счёту слове этого предложения меньше всего букв, и выведите на печать.
// Если таких слов несколько, выведите номер первого по порядку.

        sc.nextLine();
        String stroka = sc.nextLine();
        String[] words = stroka.split(" ");
        int minIndex = 0;
        for (int l = 1; l < words.length; l++) {
            if (words[minIndex].length() > words[l].length()) {
                minIndex = l;
            }
        }
        System.out.print(minIndex + 1);

    }
}

