package ComputerComponents.Processor;


import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
//@AllArgsConstructor
public class Processor {
    private  double frequency;
    private  int numberOfCores;
    private  ProcessorEfficiency efficiency;
    private  double weight;

    public Processor(double frequency, int numberOfCores, ProcessorEfficiency efficiency, double weight) {
        this.frequency = frequency;
        this.numberOfCores = numberOfCores;
        this.efficiency = efficiency;
        this.weight = weight;
    }
    public double getWeight() {
        return weight;
    }


}
