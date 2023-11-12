import ComputerComponents.Computer;
import ComputerComponents.Display.Display;
import ComputerComponents.Display.DisplayType;
import ComputerComponents.Keyboard.Keyboard;
import ComputerComponents.Keyboard.KeyboardType;
import ComputerComponents.Processor.Processor;
import ComputerComponents.Processor.ProcessorEfficiency;
import ComputerComponents.RAM.RAM;
import ComputerComponents.RAM.RAMType;
import ComputerComponents.StorageOfInformation.StorageOfInformation;
import ComputerComponents.StorageOfInformation.StorageOfInformationType;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("Citilink", "Rich");
        computer.setDisplay(new Display(10.7, DisplayType.IPS, 309.1));
        computer.setRAM(new RAM(RAMType.DDR4, 32, 100));
        computer.setStorageOfInformation(new StorageOfInformation(StorageOfInformationType.HDD, 2048, 400.4));
        computer.setKeyboard(new Keyboard(KeyboardType.MECHANICAL, true, 300));
        computer.setProcessor(new Processor(3.4, 8,  ProcessorEfficiency.INTEL, 79.5));
        System.out.println(computer);
        System.out.println(computer.getWeight());

        Computer computer2 = new Computer("Online_trade", "Medium");
        computer2.setDisplay(new Display(10.7, DisplayType.TN, 209.1));
        computer2.setRAM(new RAM(RAMType.DDR3, 16, 100));
        computer2.setStorageOfInformation(new StorageOfInformation(StorageOfInformationType.HDD, 512, 400.4));
        computer2.setKeyboard(new Keyboard(KeyboardType.MEMBRANE, true, 300));
        computer2.setProcessor(new Processor(3.4, 4,  ProcessorEfficiency.RADEON, 79.5));
        System.out.println(computer2);
        System.out.println(computer2.getWeight());
    }
}

