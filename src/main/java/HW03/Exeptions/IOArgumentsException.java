package HW03.Exeptions;

public class IOArgumentsException extends Exception {
    public IOArgumentsException(){
        super("Ошибка ввода аргументов");
    }
    public IOArgumentsException(String e){
        super(e);
    }
}
