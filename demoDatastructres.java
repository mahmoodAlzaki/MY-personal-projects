//Name:Mahmood Abdulmajeed Alzaki
//ID:202008188
//Sec:06
import java.util.ArrayList;
public class demoTemperatureAnalyzer {
    public static void main(String[] args) {
        TemperatureAnalyzer202008188 tempAnalyzer1 = new TemperatureAnalyzer202008188();
        tempAnalyzer1.addTemperature(23.5);
        tempAnalyzer1.addTemperature(19.2);
        tempAnalyzer1.addTemperature(30.8);
        tempAnalyzer1.addTemperature(25.1);
        tempAnalyzer1.addTemperature(27.4);
        System.out.println("Temperature List: " + tempAnalyzer1);
        System.out.println("Max Temperature: " + tempAnalyzer1.getMaxTemperature());
        System.out.println("Min Temperature: " + tempAnalyzer1.getMinTemperature());
        System.out.println("Average Temperature: " + tempAnalyzer1.getAverage());
        tempAnalyzer1.removeMiddleTemperature();
        System.out.println("After Removing Middle: " + tempAnalyzer1);
        TemperatureAnalyzer202008188 tempAnalyzer2 = new TemperatureAnalyzer202008188();
        tempAnalyzer2.addTemperature(23.5);
        tempAnalyzer2.addTemperature(19.2);
        tempAnalyzer2.addTemperature(30.8);
        tempAnalyzer2.addTemperature(27.4);
        System.out.println("Lists Equal: " + tempAnalyzer1.equals(tempAnalyzer2));
        tempAnalyzer1.reverse();
        System.out.println("Reversed List: " + tempAnalyzer1);
        ArrayList<Double> aboveAvg = new ArrayList<>();
        ArrayList<Double> belowAvg = new ArrayList<>();
        tempAnalyzer1.separateAboveBelowAverage(aboveAvg, belowAvg);
        System.out.println("Above Average: " + aboveAvg);
        System.out.println("Below Average: " + belowAvg);
        TemperatureAnalyzer202008188.categorizeTemperatures(tempAnalyzer1, 25.0);
    }
}
