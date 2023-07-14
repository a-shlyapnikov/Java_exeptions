package HW03.Exeptions;

public class ExtraArgument extends  IOArgumentsException{
    public ExtraArgument() {
        super("Введены лишние аргумменты");
    }
}
