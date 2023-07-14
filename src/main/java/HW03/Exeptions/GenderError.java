package HW03.Exeptions;

public class GenderError extends IOArgumentsException {
    public GenderError() {
        super("Пол не распознан");
    }
}
