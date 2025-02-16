
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataStreamsEx {
    public static void main(String[] args) {
        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("Files\\myTest.bin"));
                DataInputStream dataInputStream = new DataInputStream(new FileInputStream("Files\\myTest.bin"))) {
            dataOutputStream.writeByte(5);
            dataOutputStream.writeBoolean(true);
            dataOutputStream.writeShort(120);

            System.out.println(dataInputStream.readBoolean());
            System.out.println(dataInputStream.readByte());
            System.out.println(dataInputStream.readShort());
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
