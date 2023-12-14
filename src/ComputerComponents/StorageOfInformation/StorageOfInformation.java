package ComputerComponents.StorageOfInformation;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
public class StorageOfInformation {
    private StorageOfInformationType type;
    private int volume;
    private double weight;

    public StorageOfInformation(StorageOfInformationType type, int volume, double weight) {
        this.type = type;
        this.volume = volume;
        this.weight = weight;
    }
    public double getWeight() {
        return weight;
    }


}
