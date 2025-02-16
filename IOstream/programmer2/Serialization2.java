package programmer2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.WriteAbortedException;

import programmer.Employees;

public class Serialization2 {
    public static void main(String[] args)
            throws IOException, ClassNotFoundException, FileNotFoundException, WriteAbortedException {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(
                new FileInputStream("Files\\employees2.bin"))) {
            Employees employees = (Employees) objectInputStream.readObject();
            System.out.println(employees);
        }

    }
}
