package HW03.Exeptions;

public class NumericInFIOException extends IOArgumentsException {
    public NumericInFIOException() {
        super("Наличие цифр в ФИО не допускается");
    }
}