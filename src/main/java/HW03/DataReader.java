package HW03;

import java.util.Scanner;

public class DataReader {
    public String enterString() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.printf("Введите через пробел:\n 'Фамилию' 'Имя' 'Отчество' " +
                    "'Дату рождения(дд.мм.гггг)' 'Номер телефона' 'Пол'\n>");
            return scanner.nextLine();
        }
    }
}
