package ComputerComponents.RAM;

public class RAM {
    private final RAMType type;
    private final int volume;
    private final double weight;

    public RAM(RAMType type, int volume, double weight) {
        this.type = type;
        this.volume = volume;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "RAM{" +
                "type=" + type +
                ", volume=" + volume +
                ", weight=" + weight +
                '}';
    }
}
