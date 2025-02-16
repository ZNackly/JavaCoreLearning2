public class RandomAccesFile {
    public static void main(String[] args) {
        try (java.io.RandomAccessFile file = new java.io.RandomAccessFile("Files\\text1.txt", "rw")) {

            int a = file.read();
            System.out.println((char) a);
            System.out.println(file.readLine());
            file.seek(101);
            System.out.println(file.readLine());
            long position = file.getFilePointer();
            System.out.println(position);
            // file.seek(0);
            // file.writeBytes("privet ");
            file.seek(file.length() - 1);
            file.writeBytes("Author");
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
