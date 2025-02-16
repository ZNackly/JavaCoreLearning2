package NIO;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class DirectoryDelete {
    public static void main(String[] args) throws IOException {
        Path source = Paths.get(
                "C:\\Users\\User\\OneDrive\\Рабочий стол\\Dev\\Javalearning\\Source codes\\Different\\Files\\CopyHere");
        Path deleting = Paths.get(
                "C:\\Users\\User\\OneDrive\\Рабочий стол\\Dev\\Javalearning\\Source codes\\Different\\Files\\CopyHere\\Y");
        Files.walkFileTree(source, new MyFileVisitor3(deleting));

    }
}

class MyFileVisitor3 extends SimpleFileVisitor<Path> {
    Path deleting;

    public MyFileVisitor3(Path deleting) {
        this.deleting = deleting;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        if (file.toAbsolutePath().equals(deleting.toAbsolutePath())) {
            Files.delete(deleting);
            System.out.println("Path found....\n" + file.getFileName() + " deleted");
            return FileVisitResult.TERMINATE;
        } else {
            System.out.println("Deleting path not found...Searching");
            return FileVisitResult.CONTINUE;
        }
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        System.out.println("Exit from directory: {" + dir.getFileName() + "} file not found.");
        return FileVisitResult.CONTINUE;
    }

}