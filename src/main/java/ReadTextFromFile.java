import java.io.*;

public class ReadTextFromFile {
    public static void main(String[] args) throws IOException {
        ReadTxt readFileSimpleText = new ReadTxt();
        ReadTxt readFileOneMoreText = new ReadTxt();
        String pathSimpleText = "src/main/resources/simpleText.txt";
        String encodSimpleText = "UTF-8";
        String pathOneMoreText = "src/main/resources/oneMoreText.txt";
        String encodOneMreText = "Windows-1251";

        System.out.println("simpleText");
        System.out.println(readFileSimpleText.textFromFile(pathSimpleText,encodSimpleText));

        System.out.println("oneMoreText");
        System.out.println(readFileOneMoreText.textFromFile(pathOneMoreText,encodOneMreText));
    }
}
