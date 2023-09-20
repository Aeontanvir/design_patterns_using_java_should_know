package composite;

import composite.composite.Component;
import composite.composite.Composite;
import composite.composite.Leaf;

public class AppForComposite {
    public static void main(String[] args) {
        Component ssd = new Leaf("SSD", 3000);
        Component hdd = new Leaf("HDD", 3000);
        Component processor = new Leaf("Processor", 15000);
        Component ram = new Leaf("RAM", 3500);
        Component psu = new Leaf("PSU", 3500);
        Component keyboard = new Leaf("Keyboard", 200);
        Component mouse = new Leaf("Mouse", 300);
        Component mainboard = new Leaf("Mainboard", 8000);
        Component gpu = new Leaf("GPU", 28000);
        Component monitor = new Leaf("Monitor", 12000);

        Component ioComponents = new Composite("I/O Devices");
        ioComponents.addComponent(monitor);
        ioComponents.addComponent(mouse);
        ioComponents.addComponent(keyboard);

        Component cpuBoard = new Composite("CPU Board");
        cpuBoard.addComponent(ssd);
        cpuBoard.addComponent(hdd);
        cpuBoard.addComponent(processor);
        cpuBoard.addComponent(ram);
        cpuBoard.addComponent(mainboard);

        Component cabinet = new Composite("Cabinet");
        cabinet.addComponent(cpuBoard);
        cabinet.addComponent(psu);
        cabinet.addComponent(gpu);

        cabinet.showPrice();
    }
}
