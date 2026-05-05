import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingWrite {
    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("file.txt");
        fw.write("Hello Java");
        fw.close();
    }
}