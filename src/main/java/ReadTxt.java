import java.io.*;

public class ReadTxt {
    private String pathToFile;
    private String encodingFile;
    public String textFromFile(String file, String encod) throws IOException{
        String readFileText = "";
        pathToFile = file;
        encodingFile = encod;
        BufferedReader readFile = new BufferedReader( new InputStreamReader( new FileInputStream(pathToFile), encodingFile));

        while (readFile.ready()) {
            readFileText += readFile.readLine() + "\r\n";
        }


        readFile.close();
        return readFileText;
    }
}
