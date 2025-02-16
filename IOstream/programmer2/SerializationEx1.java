package programmer2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializationEx1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<String> employees;
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("Files\\employees.bin"))) {
            employees = (ArrayList) inputStream.readObject();
        }
        System.out.println(employees);
    }
}
