package HW03;

import HW03.Exeptions.*;


public class StringParser {

    public static String[] splitLine(String line) throws IOArgumentsException {
        CheckData checker = new CheckData();
        String[] args = line.split(" ");
        if (args.length > 6)
            throw new ExtraArgument();
        else if (args.length < 6)
            throw new MissingArgument();
        else if (!checker.checkString(args[0]) || !checker.checkString(args[1]) || !checker.checkString(args[2]))
            throw new NumericInFIOException();
        else if (!checker.checkDate(args[3]))
            throw new NotCurrentDateValueError();
        else if (!checker.checkNumeric(args[4]))
            throw new SymbolsInPhoneException();
        else if (!(args[5] = replaceGender(args[5])).equals("f") && !args[5].equals("m"))
            throw new GenderError();
        else return args;
    }

    public static String replaceGender(String value) throws GenderError {
        value = value.toLowerCase();
        switch (value) {
            case "m":
            case "men":
            case "male":
            case "м":
            case "муж":
            case "мужской":
                return "m";

            case "f":
            case "woman":
            case "female":
            case "ж":
            case "жен":
            case "женский":
                return "f";

            default:
                throw new GenderError();
        }
    }
}
