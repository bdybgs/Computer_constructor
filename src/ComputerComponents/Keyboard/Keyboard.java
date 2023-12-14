package ComputerComponents.Keyboard;

import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
public class Keyboard {
    private KeyboardType type;
    private boolean availabilityRGB;
    private double weight;

    public Keyboard(KeyboardType type, boolean availabilityRGB, double weight) {
        this.type = type;
        this.availabilityRGB = availabilityRGB;
        this.weight = weight;
    }
    public double getWeight() {
        return weight;
    }


}
