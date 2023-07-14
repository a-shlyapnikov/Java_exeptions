package HW03;

import HW03.Exeptions.DataWriteException;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DataWriter {
    public void writeData(UserData data) throws DataWriteException {
        if (!Files.exists(Path.of("data")))
            new File("data").mkdir();
        String filename = "data/" + data.getLastName();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename, true))) {
            bw.write(data.toString());
        } catch (IOException e) {
            throw new DataWriteException();

        }
    }
}