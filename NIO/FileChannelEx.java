package NIO;

import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileChannelEx {
    public static void main(String[] args) {
        try (RandomAccessFile randomAccessFile = new RandomAccessFile("test10.txt", "rw");
                FileChannel channel = randomAccessFile.getChannel()) {
            ByteBuffer buffer = ByteBuffer.allocate(25);
            StringBuilder stix = new StringBuilder();
            int readByte = channel.read(buffer);
            while (readByte > 0) {
                System.out.println("Read" + readByte);
                buffer.flip();
                while (buffer.hasRemaining()) {
                    stix.append((char) buffer.get());
                }
                buffer.clear();
                readByte = channel.read(buffer);

            }
            System.out.println(stix);
        } catch (Exception e) {
            System.out.println("Exeption");
        }
    }
}
