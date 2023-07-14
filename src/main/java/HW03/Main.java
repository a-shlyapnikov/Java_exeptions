package HW03;

import HW03.Exeptions.DataWriteException;
import HW03.Exeptions.IOArgumentsException;

public class Main {
    public static void main(String[] args) {
        DataReader dr = new DataReader();
        String line = dr.enterString();
        String[] arguments;

        try {
            StringParser sp = new StringParser();
            arguments = sp.splitLine(line);
            UserData data = new UserData(arguments);
            try {
                DataWriter dw = new DataWriter();
                dw.writeData(data);
            } catch (DataWriteException e) {
                e.printStackTrace();
            }
        } catch (IOArgumentsException e) {
            e.printStackTrace();
        }
    }
}
