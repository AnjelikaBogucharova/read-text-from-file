import java.io.*;

public class ReadTextFromFile {
    public static void main(String[] args) throws IOException {

        BufferedReader readFileSimpleText = new BufferedReader( new InputStreamReader( new FileInputStream("src/main/resources/simpleText.txt"), "UTF-8"));
        BufferedReader readFileOneMoreText = new BufferedReader( new InputStreamReader( new FileInputStream("src/main/resources/oneMoreText.txt"), "Windows-1251"));

        System.out.println("simpleText");
        while (readFileSimpleText.ready()) {
            System.out.println(readFileSimpleText.readLine());
        }
        System.out.println("\r\n" + "oneMoreText");
        while (readFileOneMoreText.ready()) {
            System.out.println(readFileOneMoreText.readLine());
        }

        readFileSimpleText.close();
        readFileOneMoreText.close();
    }
}
