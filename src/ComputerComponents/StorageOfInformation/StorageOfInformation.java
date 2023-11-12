package ComputerComponents.StorageOfInformation;

public class StorageOfInformation {
    private final StorageOfInformationType type;
    private final int volume;
    private final double weight;

    public StorageOfInformation(StorageOfInformationType type, int volume, double weight) {
        this.type = type;
        this.volume = volume;
        this.weight = weight;
    }
    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "StorageOfInformation{" +
                "type=" + type +
                ", volume=" + volume +
                ", weight=" + weight +
                '}';
    }
}
