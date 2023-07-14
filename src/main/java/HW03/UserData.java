package HW03;

import java.util.Date;

public class UserData {
    private String lastName;
    private String name;
    private String patronymic;
    private String  dateBirth;
    private String phoneNumber;
    private String gender;

    public UserData(String lastName, String name, String patronymic, String dateBirth, String phoneNumber, String gender) {
        this.lastName = lastName;
        this.name = name;
        this.patronymic = patronymic;
        this.dateBirth = dateBirth;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    public UserData(String[] arguments) {
        this.lastName = arguments[0];
        this.name = arguments[1];
        this.patronymic = arguments[2];
        this.dateBirth = arguments[3];
        this.phoneNumber = arguments[4];
        this.gender = arguments[5];
    }
    @Override
    public String toString() {
        return "<" + lastName + '>' +
                "<" + name + '>' +
                "<" + patronymic + '>' +
                "<" + dateBirth + '>' +
                "<" + phoneNumber + '>' +
                "<" + gender + ">\n";
    }

    public String getLastName() {
        return lastName;
    }
}
