package HW02;

import java.util.Scanner;

/*
Разработайте программу, которая выбросит Exception,
когда пользователь вводит пустую строку. Пользователю должно показаться сообщение,
что пустые строки вводить нельзя.
 */
public class Task04 {
    public static void main(String[] args) {
        String msg = enterString();
        System.out.println("Введенная строка: " + msg);

    }

    public static String enterString() {
        System.out.print("Введите строку: ");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        if (line.equals("")) {
            throw new RuntimeException("Вы ввели пустую строку");
        }
        return line;
    }
}
