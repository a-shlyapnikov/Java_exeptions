package HW03.Exeptions;

public class ExtraCharactersException extends NotCurrentDateValueError {
    public ExtraCharactersException(){
        super("Лишнии символы в полях введённой даты");
    }
}
