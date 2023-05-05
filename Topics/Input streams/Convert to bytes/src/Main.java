import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

class Main {
    public static void main(String[] args) throws IOException {
        byte[] buffer = new byte[1024];
        InputStream inputStream = System.in;
        int bytesRead = inputStream.read(buffer);

        for (int i = 0; i < bytesRead; i++) {
            System.out.print(buffer[i]);
        }
    }
}