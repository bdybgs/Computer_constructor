package ComputerComponents.Keyboard;

public class Keyboard {
    private final KeyboardType type;
    private final boolean availabilityRGB;
    private final double weight;

    public Keyboard(KeyboardType type, boolean availabilityRGB, double weight) {
        this.type = type;
        this.availabilityRGB = availabilityRGB;
        this.weight = weight;
    }
    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "type=" + type +
                ", availabilityRGB=" + availabilityRGB +
                ", weight=" + weight +
                '}';
    }
}
