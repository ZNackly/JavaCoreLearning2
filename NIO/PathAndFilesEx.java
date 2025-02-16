package NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathAndFilesEx {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("Files\\test15.txt");
        Path folderPath = Paths.get(
                "C:\\Users\\User\\OneDrive\\Рабочий стол\\Dev\\Javalearning\\Source codes\\Different\\Files\\directory");
        System.out.println(filePath.getFileName());
        System.out.println(folderPath.getFileName());
        System.out.println("------------------------------------------------------------------------");
        System.out.println(filePath.getParent());
        System.out.println(folderPath.getParent());
        System.out.println("------------------------------------------------------------------------");
        System.out.println(filePath.getRoot());
        System.out.println(folderPath.getRoot());
        System.out.println("------------------------------------------------------------------------");
        System.out.println(filePath.isAbsolute());
        System.out.println(folderPath.isAbsolute());
        System.out.println("------------------------------------------------------------------------");
        System.out.println(filePath.toAbsolutePath());
        System.out.println(folderPath.toAbsolutePath());
        System.out.println("------------------------------------------------------------------------");
        System.out.println(folderPath.resolve(filePath));
        System.out.println("------------------------------------------------------------------------");
        // System.out.println(folderPath.relativize(filePath));
        if (!Files.exists(filePath)) {
            Files.createFile(folderPath);
        }
    }
}
