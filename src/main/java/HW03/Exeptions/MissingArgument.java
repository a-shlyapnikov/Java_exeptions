package HW03.Exeptions;

public class MissingArgument extends IOArgumentsException{
    public MissingArgument() {
        super("Введены не все аргументы");
    }
}
