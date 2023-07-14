package HW03;

import HW03.Exeptions.DateNotValidException;
import HW03.Exeptions.ExtraCharactersException;
import HW03.Exeptions.NotAllArgsInDateException;
import HW03.Exeptions.NotCurrentDateValueError;

public class CheckData {
    public CheckData() {
    }

    public static boolean checkDate(String value) throws NotCurrentDateValueError {
        value = value.replace(".", ",");
        String[] args = value.split(",");
        if (args.length != 3)
            throw new NotAllArgsInDateException();
        else if (args[0].length() != 2 && args[1].length() != 2 && args[2].length() != 4)
            throw new ExtraCharactersException();
        else if (Integer.parseInt(args[0]) < 1 || Integer.parseInt(args[0]) > 31)
            throw new DateNotValidException("Число дня рождения указано неверно");
        else if (Integer.parseInt(args[1]) < 1 || Integer.parseInt(args[1]) > 12) {
            throw new DateNotValidException("Месяц дня рождения указан неверно");
        } else if (Integer.parseInt(args[2]) < 1900 || Integer.parseInt(args[2]) > 2023)
            throw new DateNotValidException("Год дня рождения указан неверно");
        return true;
    }
    public static boolean checkNumeric(String value) {
        for (char c : value.toCharArray()) {
            if ((int) c - 48 > 9)
                return false;
        }
        return true;
    }
    public static boolean checkString(String value) {
        for (char c : value.toCharArray()) {
            if ((int) c - 48 < 10)
                return false;
        }
        return true;
    }

}
