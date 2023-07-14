package HW03.Exeptions;

import java.io.IOException;

public class DataWriteException extends IOException {
    public DataWriteException(){
        super("Ошибка записи файла!");
    }
}
