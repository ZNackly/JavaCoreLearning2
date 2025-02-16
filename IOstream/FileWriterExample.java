
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) throws IOException {
        String rubai = "Много лет размышлял я над жизнью земной.\n" +
                "Непонятного нет для меня под луной.\n" +
                "Мне известно, что мне ничего не известно, —\n" +
                "Вот последний секрет из постигнутых мной.";
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(
                    "C:\\Users\\User\\OneDrive\\Рабочий стол\\Dev\\Javalearning\\Source codes\\Different\\Files\\1.txt");
            // for (int i = 0; i < rubai.length(); i++) {
            // fileWriter.write(rubai.charAt(i));
            // }
            fileWriter.write(rubai);
            System.out.println("Done");

        } catch (IOException e) {
            // TODO: handle exception
        } finally {
            fileWriter.close();
        }

    }
}
