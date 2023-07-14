package HW03.Exeptions;

public class SymbolsInPhoneException extends IOArgumentsException {
    public SymbolsInPhoneException(){
        super("Наличие символов в телефонном номере недопускается");
    }
}
