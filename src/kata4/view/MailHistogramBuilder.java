package kata4.view;

import java.util.List;
import kata4.model.*;

public class MailHistogramBuilder {

    public static Histograma<String> build (List<Mail> miList){
        Histograma<String> histogram = new Histograma<>();
        for (Mail mail : miList) {
            histogram.increment(mail.getDomain());
        }
        return histogram;
    }
    
}
