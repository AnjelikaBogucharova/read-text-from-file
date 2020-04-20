package readerText;

import org.apache.commons.io.IOUtils;
import java.io.*;

public class ReadTxt {
    public String textFromFile(String file, String encoding) throws Exception{

//        //Старая реализация
//        StringBuilder readFileText = new StringBuilder();
//        try (BufferedReader readFile = new BufferedReader( new InputStreamReader( new FileInputStream(file), encoding))){
//            while (readFile.ready()) {
//                readFileText.append(readFile.readLine()).append("\r\n");
//            }
//            return readFileText.toString();
//        }catch (Exception e){
//            System.out.println(e);
//            throw e;
//        }
        //Новая реализация
        FileInputStream pathFile = new FileInputStream(file);
        String text = IOUtils.toString(pathFile, encoding);
        return  text;
    }
}
