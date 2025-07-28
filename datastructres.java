//Name:Mahmood Abdulmajeed Alzaki
//ID:202008188
//Sec:06
import java.util.ArrayList;
import java.util.Arrays;
public class TemperatureAnalyzer202008188 {
    private Double[] temperatureList;
    private int length;
    private int capacity;
    public TemperatureAnalyzer202008188() {
        this.capacity = 10;
        this.temperatureList = new Double[capacity];
        this.length = 0;
    }
    public TemperatureAnalyzer202008188(int newCapacity) {
        this.capacity = newCapacity;
        this.temperatureList = new Double[capacity];
        this.length = 0;
    }
    private void reallocate() {
        capacity *= 2;
        temperatureList = Arrays.copyOf(temperatureList, capacity);
    }
    public int getLength() {
        return length;
    }
    public void addTemperature(Double newTemperature) {
        if (length == capacity) reallocate();
        temperatureList[length++] = newTemperature;
    }
    public boolean isTemperatureInList(Double temperature) {
        for (int i = 0; i < length; i++) {
            if (temperatureList[i].equals(temperature)) return true;
        }
        return false;
    }
    public Double getTemperature(int index) {
        if (index < 0 || index >= length) return null;
        return temperatureList[index];
    }
    public Double setTemperature(int index, Double newTemperature) {
        if (index < 0 || index >= length) return null;
        Double oldTemp = temperatureList[index];
        temperatureList[index] = newTemperature;
        return oldTemp;
    }
    public void removeTemperature(int index) {
        if (index < 0 || index >= length) return;
        for (int i = index; i < length - 1; i++) {
            temperatureList[i] = temperatureList[i + 1];
        }
        temperatureList[--length] = null;
    }
    public void removeMiddleTemperature() {
        if (length % 2 == 1) removeTemperature(length / 2);
    }
    public boolean equals(TemperatureAnalyzer202008188 otherList) {
        if (this.length != otherList.length) return false;
        for (int i = 0; i < length; i++) {
            if (!this.temperatureList[i].equals(otherList.temperatureList[i])) return false;
        }
        return true;
    }
    public void reverse() {
        for (int i = 0; i < length / 2; i++) {
            Double temp = temperatureList[i];
            temperatureList[i] = temperatureList[length - i - 1];
            temperatureList[length - i - 1] = temp;
        }
    }
    public boolean isEmpty() {
        return length == 0;
    }
    public Double getLast() {
        return isEmpty() ? null : temperatureList[length - 1];
    }
    public void setLast(Double newValue) {
        if (!isEmpty()) temperatureList[length - 1] = newValue;
    }
    public int countOccurrences(Double value) {
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (temperatureList[i].equals(value)) count++;
        }
        return count;
    }
    public double getAverage() {
        if (isEmpty()) return 0;
        double sum = 0;
        for (int i = 0; i < length; i++) {
            sum += temperatureList[i];
        }
        return sum / length;
    }
    public void sortTemperatures(TemperatureAnalyzer202008188 temp) {
        for (int i = 0; i < temp.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < temp.length; j++) {
                if (temp.temperatureList[j] < temp.temperatureList[minIndex]) {
                    minIndex = j;
                }
            }
            Double tempValue = temp.temperatureList[minIndex];
            temp.temperatureList[minIndex] = temp.temperatureList[i];
            temp.temperatureList[i] = tempValue;
        }
    }
    public Double getMaxTemperature() {
        if (isEmpty()) return null;
        Double maxTemp = temperatureList[0];
        for (int i = 1; i < length; i++) {
            if (temperatureList[i] > maxTemp) maxTemp = temperatureList[i];
        }
        return maxTemp;
    }
    public Double getMinTemperature() {
        if (isEmpty()) return null;
        Double minTemp = temperatureList[0];
        for (int i = 1; i < length; i++) {
            if (temperatureList[i] < minTemp) minTemp = temperatureList[i];
        }
        return minTemp;
    }
    public void separateAboveBelowAverage(ArrayList<Double> aboveAverage, ArrayList<Double> belowAverage) {
        double avg = getAverage();
        for (int i = 0; i < length; i++) {
            if (temperatureList[i] > avg) aboveAverage.add(temperatureList[i]);
            else belowAverage.add(temperatureList[i]);
        }
    }
    public static void categorizeTemperatures(TemperatureAnalyzer202008188 temp, Double newTemp) {
        int above = 0, below = 0, equal = 0;
        for (int i = 0; i < temp.length; i++) {
            if (temp.temperatureList[i] > newTemp) above++;
            else if (temp.temperatureList[i] < newTemp) below++;
            else equal++;
        }
        System.out.println("Above: " + above + ", Below: " + below + ", Equal: " + equal);
    }
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < length; i++) {
            sb.append(temperatureList[i]);
            if (i < length - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
