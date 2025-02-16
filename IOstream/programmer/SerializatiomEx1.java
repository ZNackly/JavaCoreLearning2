package programmer;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializatiomEx1 {
    public static void main(String[] args) throws IOException {
        List<String> employees = new ArrayList<>();
        employees.add("Zaur");
        employees.add("Ivan");
        employees.add("Elena");
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("Files\\employees.bin"))) {
            outputStream.writeObject(employees);
            System.out.println("Done!");
        }
    }
}
