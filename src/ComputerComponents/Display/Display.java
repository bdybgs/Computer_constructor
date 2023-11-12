package ComputerComponents.Display;

public class Display {
    private final double diagonal;
    private final DisplayType type;
    private final double weight;

    public Display(double diagonal, DisplayType type, double weight) {
        this.diagonal = diagonal;
        this.type = type;
        this.weight = weight;
    }
    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Display{" +
                "diagonal=" + diagonal +
                ", type=" + type +
                ", weight=" + weight +
                '}';
    }
}

