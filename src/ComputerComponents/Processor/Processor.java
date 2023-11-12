package ComputerComponents.Processor;

public class Processor {
    private final double frequency;
    private final int numberOfCores;
    private final ProcessorEfficiency efficiency;
    private final double weight;

    public Processor(double frequency, int numberOfCores, ProcessorEfficiency efficiency, double weight) {
        this.frequency = frequency;
        this.numberOfCores = numberOfCores;
        this.efficiency = efficiency;
        this.weight = weight;
    }
    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "frequency=" + frequency +
                ", numberOfCores=" + numberOfCores +
                ", efficiency=" + efficiency +
                ", weight=" + weight +
                '}';
    }
}
