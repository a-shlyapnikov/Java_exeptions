package HW03.Exeptions;

public class NotAllArgsInDateException extends NotCurrentDateValueError {
    public NotAllArgsInDateException(){
        super("Не хватает аргументов в поле 'Дата'");
    }
}