import java.io.File;

public class FileEx {
    public static void main(String[] args) {
        File file = new File("Files\\newFile.txt");
        File file2 = new File("Files\\directory");
        try {
            file.createNewFile();
            file2.mkdir();
            System.out.println(file.getAbsolutePath());
            System.out.println("---------------------------------------------------------");
            System.out.println(file.isAbsolute());
            System.out.println("---------------------------------------------------------");
            System.out.println(file.exists());
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}