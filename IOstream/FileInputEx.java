import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileInputEx {
    public static void main(String[] args) throws IOException {
        try (FileInputStream fileInputStream = new FileInputStream(
                "C:\\Users\\User\\OneDrive\\Рабочий стол\\Dev\\Javalearning\\Source codes\\Different\\Files\\img13.jpg");
                FileOutputStream fileOutputStream = new FileOutputStream("img2.jpg")) {
            int i;
            while ((i = fileInputStream.read()) != -1) {
                fileOutputStream.write(i);
            }
            System.out.println("Done");
        }
    }
}
