package NIO;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;

public class CopyFileTree {
    public static void main(String[] args) throws IOException {
        Path path1 = Paths
                .get("C:\\Users\\User\\OneDrive\\Рабочий стол\\Dev\\Javalearning\\Source codes\\Different\\Files\\directory");
        Path path2 = Paths.get(
                "C:\\Users\\User\\OneDrive\\Рабочий стол\\Dev\\Javalearning\\Source codes\\Different\\Files\\CopyHere");
        Files.walkFileTree(path1, new MyFileVisitor2(path1, path2));
        System.out.println("Done!");
    }
}

class MyFileVisitor2 extends SimpleFileVisitor<Path> {
    Path source;
    Path destination;

    public MyFileVisitor2(Path source, Path destination) {
        this.source = source;
        this.destination = destination;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        Path newDestination = destination.resolve(source.relativize((file)));
        Files.copy(file, newDestination, StandardCopyOption.REPLACE_EXISTING);
        System.out.println("Copied file: " + file.getFileName());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        Path newDestination = destination.resolve(source.relativize((dir)));
        Files.copy(dir, newDestination, StandardCopyOption.REPLACE_EXISTING);
        System.out.println("Visited directory: " + dir.getFileName());
        return FileVisitResult.CONTINUE;
    }

}