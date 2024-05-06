import java.util.Scanner;

public class Bankomat {
    public static void main(String[] args) {
        // проверка комита
        Scanner sc = new Scanner(System.in);
        System.out.println("Добро пожаловать в контроль расходов!");
        while (true) {
            System.out.println("Выберите действие:");
            System.out.println("1 - Изменить расходы за неделю");
            System.out.println("2 - Посмотреть курсы валют");
            System.out.println("3 - Калькулятор валют");
            System.out.println("0 - Выход");
            int command = sc.nextInt();
            int val1 = 0;
            int val2 = 0;
            int val3 = 0;
            int val4 = 0;
            int val5 = 0;
            int val6 = 0;
            int val7 = 0;
            if (command == 1) {
                while (true) {
                    System.out.println("Выберите день недели:");
                    System.out.println("1 - Понедельник");
                    System.out.println("2 - Вторник");
                    System.out.println("3 - Среда");
                    System.out.println("4 - Четврг");
                    System.out.println("5 - Пятница");
                    System.out.println("6 - Суббота");
                    System.out.println("7 - Воскресенье");
                    System.out.println("8 - Мои расходы за неделю");
                    System.out.println("0 - Далее");
                    int change = sc.nextInt();
                    if (change == 1) {
                        System.out.print("Введите сумму трат за Понедельник: ");
                        val1 = sc.nextInt();
                    } else if (change == 2) {
                        System.out.print("Введите сумму трат за Вторник: ");
                        val2 = sc.nextInt();
                    } else if (change == 3) {
                        System.out.print("Введите сумму трат за Среду: ");
                        val3 = sc.nextInt();
                    } else if (change == 4) {
                        System.out.print("Введите сумму трат за Четверг: ");
                        val4 = sc.nextInt();
                    } else if (change == 5) {
                        System.out.print("Введите сумму трат за Пятницу: ");
                        val5 = sc.nextInt();
                    } else if (change == 6) {
                        System.out.print("Введите сумму трат за Субботу: ");
                        val6 = sc.nextInt();
                    } else if (change == 7) {
                        System.out.print("Введите сумму трат за Воскресень: ");
                        val7 = sc.nextInt();
                    } else if (change == 8) {
                        System.out.println("Понедельник - " + val1);
                        System.out.println("Вторник - " + val2);
                        System.out.println("Среда - " + val3);
                        System.out.println("Четврг - " + val4);
                        System.out.println("Пятница - " + val5);
                        System.out.println("Суббота - " + val6);
                        System.out.println("Воскресенье - " + val7);
                        int valSum = val1 + val2 + val3 + val4 + val5 + val6 + val7;
                        System.out.println("Расходы за неделю: " + valSum);
                    } else if (change == 0) {
                        break;
                    }
                }
            } else if (command == 2) {
                System.out.println("USD = 97,92");
                System.out.println("EUR = 104,89");
            } else if (command == 3) {
                System.out.println("Введите количество денег:");
                int money = sc.nextInt();
                System.out.println("Выберите курс в числовом диапозоне");
                double curs = sc.nextDouble();
                double moneyCurse = money / curs;
                System.out.println("Ваши сбережения в данной валюте: " + moneyCurse);
            } else if (command == 0) {
                System.out.println("Досвидание!");
                break;
            }
        }
    }
}