package readerText;

public class ReadTextFromFile {
    public static void main(String[] args) throws Exception {
        ReadTxt readFile = new ReadTxt();

        System.out.println("simpleText");
        System.out.println(readFile.textFromFile("src/main/resources/simpleText.txt","UTF-8"));

        System.out.println("oneMoreText");
        System.out.println(readFile.textFromFile("src/main/resources/oneMoreText.txt","Windows-1251"));
    }
}
