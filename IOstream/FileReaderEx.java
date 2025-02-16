
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderEx {
    public static void main(String[] args) throws IOException{

        try(FileWriter fileWriter = new FileWriter("C:\\Users\\User\\OneDrive\\Рабочий стол\\Dev\\Javalearning\\Source codes\\Different\\Files\\2.txt", true)) {
            fileWriter.write("Заур, здравствуйте! А что вы думаете по поводу такого написания кода для чтения из файла?");
            fileWriter.append(
                    "\n@Евгений_Герасимов, здравствуйте. Честно говоря, не работал с этим методом. Выглядит просто. Единственное что, у вас выполняется проверка, а затем чтение. А в примере из урока, проверка выполняется при непосредственном чтении.");

        }
        
        try(FileReader reader = new FileReader("C:\\Users\\User\\OneDrive\\Рабочий стол\\Dev\\Javalearning\\Source codes\\Different\\Files\\2.txt")) {
            int a;
            while ((a = reader.read()) != -1) {
                System.out.print((char) a);
            }
            System.out.println();
            System.out.println("Done!");
        }
    }
}