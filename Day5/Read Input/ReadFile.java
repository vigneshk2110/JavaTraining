import java.io.File;
import java.util.Scanner;

public class ReadFile{

    public static void main(String[] args) throws Exception {
        String fileName = "textFile.txt";
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
        }
        scanner.close();
    }
}