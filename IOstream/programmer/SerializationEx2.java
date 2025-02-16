package programmer;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationEx2 {
    public static void main(String[] args) {
        Employees employee = new Employees("Zaur", "police", 28, 100000.0);
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                new FileOutputStream("Files\\employees2.bin"))) {
            objectOutputStream.writeObject(employee);
            System.out.println("Done");
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
