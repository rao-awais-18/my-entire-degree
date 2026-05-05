import java.io.FileWriter;

public class TryWithResources {
    public static void main(String[] args) {

        try (FileWriter fw = new FileWriter("file.txt")) {
            fw.write("Auto close example");
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}