package ComputerComponents.RAM;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@AllArgsConstructor
public class RAM {
    private RAMType type;
    private int volume;
    private double weight;

//    public RAM(RAMType type, int volume, double weight) {
//        this.type = type;
//        this.volume = volume;
//        this.weight = weight;
//    }

    public double getWeight() {
        return weight;
    }


}
