package HW03.Exeptions;

public class DateNotValidException extends NotCurrentDateValueError{
    public  DateNotValidException(){
        super("Несуществующий день в календаре");
    }

    public DateNotValidException(String e) {
        super(e);
    }
}


