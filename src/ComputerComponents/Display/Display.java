package ComputerComponents.Display;

import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
public class Display {
    private double diagonal;
    private DisplayType type;
    private double weight;

    public Display(double diagonal, DisplayType type, double weight) {
        this.diagonal = diagonal;
        this.type = type;
        this.weight = weight;
    }
    public double getWeight() {
        return weight;
    }

}

