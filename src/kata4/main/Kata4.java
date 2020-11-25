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

    public static void main(String[] args) {
        // TODO code application logic here
        String fileName = new String ("src\\email.txt");
        List<Mail> miList = MailListReader.read(fileName);
        
        Histograma<String> histograma = MailHistogramBuilder.build(miList);
        
        HistogramDisplay histoDisplay = new HistogramDisplay("HISTOGRAMA", histograma);
        histoDisplay.execute();
    }

}
