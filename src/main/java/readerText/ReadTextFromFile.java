package readerText;

public class ReadTextFromFile {
    public static void main(String[] args) throws Exception {
        ReadTxt readFile = new ReadTxt();

        System.out.println("Чтение содиржимого из файла: simpleText.txt");
        System.out.println(readFile.textFromFile("src/main/resources/simpleText.txt","UTF-8"));

        System.out.println("\r\nЧтение содиржимого из файла: oneMoreText.txt");
        System.out.println(readFile.textFromFile("src/main/resources/oneMoreText.txt","Windows-1251"));
    }
}
