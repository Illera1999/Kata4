package kata4.view;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kata4.model.Mail;

public class MailListReader {

    public static List<Mail> read (String fileName){
        List<Mail> res = new ArrayList<>();
        
        try {
            //Leemos el archivo.
            BufferedReader reader = new BufferedReader(new FileReader(new File(fileName)));
            //Bucle infinito
            while(true){
                String line = reader.readLine();
                //Si llegamos al final que salga del bucle
                if (line==null)break;
                if (Mail.isMail(line)){
                    res.add(new Mail(line));
                } 
            }
        } catch (FileNotFoundException exception) {
            System.out.println("ERROR MailListReader: :read (File not found)" + exception.getMessage());
        } catch (IOException exception) {
            System.out.println("ERROR MailListReader: :read (IO)" + exception.getMessage());
        }
        
        return res;
    }
}
