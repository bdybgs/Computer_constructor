package ComputerComponents.Processor;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@Getter
public class Processor {
    private  double frequency;
    private  int numberOfCores;
    private  ProcessorEfficiency efficiency;
    private  double weight;

    public double getWeight() {
        return weight;
    }


}
