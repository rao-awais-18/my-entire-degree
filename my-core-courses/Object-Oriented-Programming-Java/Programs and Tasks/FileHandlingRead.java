import java.io.File;
import java.util.Scanner;

public class FileHandlingRead {
    public static void main(String[] args) throws Exception {

        File file = new File("file.txt");
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }

        sc.close();
    }
}