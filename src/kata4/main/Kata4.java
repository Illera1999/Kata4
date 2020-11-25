package kata4.main;

import java.util.List;
import kata4.model.Histograma;
import kata4.model.Mail;
import kata4.view.HistogramDisplay;
import kata4.view.MailHistogramBuilder;
import kata4.view.MailListReader;

/**
 *
 * @author josei
 */
public class Kata4 {
    
    private static String fileName;
    private static List<Mail> miList;
    private static Histograma<String> histograma;
    private static HistogramDisplay histoDisplay ;

    public static void main(String[] args) {
        // TODO code application logic here
        execute();
        input();
        process();
        output();
        

        

    }
    
    public static void execute(){
        histoDisplay.execute();
    }
    
    public static void input(){
        fileName = new String ("src\\email.txt");
        miList = MailListReader.read(fileName);
    }
    
    public static  void process(){
        histograma = MailHistogramBuilder.build(miList);
    }

    public static void output(){
        histoDisplay= new HistogramDisplay("HISTOGRAMA", histograma);
    }
}
