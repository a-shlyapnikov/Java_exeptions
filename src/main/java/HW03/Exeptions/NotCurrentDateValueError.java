package HW03.Exeptions;

public class NotCurrentDateValueError extends IOArgumentsException {
    public NotCurrentDateValueError(String e){
        super(e);
    }

    public NotCurrentDateValueError(){
        super("Неверно введена дата");
    }
}
