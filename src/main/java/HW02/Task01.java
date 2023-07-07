package HW02;

import java.util.InputMismatchException;
import java.util.Scanner;
/*Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
и возвращает введенное значение.
Ввод текста вместо числа не должно приводить к падению приложения,
вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */
public class Task01 {
    public static void main(String[] args) {
        float num = enterFloat();
        System.out.println("Введенное число: "+ num);
    }
    public static float enterFloat(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите дробное число:");
        try {
            return scanner.nextFloat();
        } catch (InputMismatchException e){
            System.out.println("Введенное значение недопустимо");
            return enterFloat();
        }
    }
}
