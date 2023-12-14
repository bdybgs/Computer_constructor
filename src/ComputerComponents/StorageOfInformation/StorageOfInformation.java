package ComputerComponents.StorageOfInformation;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@Getter
public class StorageOfInformation {
    private StorageOfInformationType type;
    private int volume;
    private double weight;

}
