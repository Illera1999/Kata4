package kata4.view;

import kata4.model.Histograma;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

public class HistogramDisplay extends ApplicationFrame{

    private final Histograma<String> histograma;
    
    public HistogramDisplay(String title, Histograma<String> histograma) {
        super(title);
        this.histograma=histograma;
        this.setContentPane (createPanel());
        this.pack();
    }

    private JPanel createPanel() {
        ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
        return chartPanel;      
    }
    
    private JFreeChart createChart(DefaultCategoryDataset dataSet){
        JFreeChart chart = ChartFactory.createBarChart(
                "JFreeChart Histogram", 
                "email domains", 
                "nº emails", 
                dataSet, 
                PlotOrientation.VERTICAL, 
                false, 
                false, 
                rootPaneCheckingEnabled);
        
        return chart;
    }
    
    private DefaultCategoryDataset createDataset(){
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        
        for (String key : histograma.keySet()) {
            dataSet.addValue(histograma.get(key), "", key);
        }
        
        return dataSet;
    }
    
    public void execute(){
        this.setVisible(true);
    }
    
}