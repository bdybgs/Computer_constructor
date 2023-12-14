package ComputerComponents;

import ComputerComponents.Display.Display;
import ComputerComponents.Keyboard.Keyboard;
import ComputerComponents.Processor.Processor;
import ComputerComponents.RAM.RAM;
import ComputerComponents.StorageOfInformation.StorageOfInformation;
import lombok.AllArgsConstructor;



public class Computer {
    public final String vendor;
    public final String name;
    private Processor processor;
    private RAM ram;
    private StorageOfInformation storageOfInformation;
    private Display display;
    private Keyboard keyboard;


    public Computer(String vendor, String name) {
        this.vendor = vendor;
        this.name = name;
        setDisplay(display);
        setKeyboard(keyboard);
        setProcessor(processor);
        setRAM(ram);
        setStorageOfInformation(storageOfInformation);

    }
    public double getWeight() {
        return processor.getWeight() + ram.getWeight() + storageOfInformation.getWeight()
                + display.getWeight() + keyboard.getWeight();
    }

    @Override
    public String toString() {
        return "Computer{" +
                "vendor='" + vendor.toString() + '\'' +
                ", name='" + name + '\'' +
                ", processor=" + processor +
                ", ram=" + ram +
                ", storageOfInformation=" + storageOfInformation +
                ", display=" + display +
                ", keyboard=" + keyboard +
                '}';
    }

    public RAM getRam() {
        return ram;
    }

    public Display getDisplay() {
        return display;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public Processor getProcessor() {
        return processor;
    }

    public StorageOfInformation getStorageOfInformation() {
        return storageOfInformation;
    }

    public void setRAM(RAM ram) {
        this.ram = ram;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public void setStorageOfInformation(StorageOfInformation storageOfInformation) {
        this.storageOfInformation = storageOfInformation;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }


}
