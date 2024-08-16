package net.sanjeev.classex3.laptop;

import net.sanjeev.classex3.laptop.components.GraphicsCard;
import net.sanjeev.classex3.laptop.components.Processor;

public class Laptop {
    private float        screen;
    private Processor    processor;
    private String       ram;
    private String       hardDrive;
    private GraphicsCard graphicsCard;
    private String       opticalDriver;
    private String       keyboard;

    public Laptop() {
        this.screen=15.6f;
        this.processor=new Processor();
        this.ram="DDR4";
        this.hardDrive="2TB";
        this.graphicsCard=new GraphicsCard();
        this.opticalDriver="MLT layer";
        this.keyboard="backlit";
    }

    public Laptop(float screen, Processor processor, String ram, String hardDrive, GraphicsCard graphicsCard, String opticalDriver, String keyboard) {
        this.screen = screen;
        this.processor = processor;
        this.ram = ram;
        this.hardDrive = hardDrive;
        this.graphicsCard = graphicsCard;
        this.opticalDriver = opticalDriver;
        this.keyboard = keyboard;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "screen=" + screen +
                ", processor=" + processor +
                ", ram='" + ram + '\'' +
                ", hardDrive='" + hardDrive + '\'' +
                ", graphicsCard=" + graphicsCard +
                ", opticalDriver='" + opticalDriver + '\'' +
                ", keyboard='" + keyboard + '\'' +
                '}';
    }

    public float getScreen() {
        return screen;
    }

    public void setScreen(float screen) {
        this.screen = screen;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(String hardDrive) {
        this.hardDrive = hardDrive;
    }

    public GraphicsCard getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(GraphicsCard graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public String getOpticalDriver() {
        return opticalDriver;
    }

    public void setOpticalDriver(String opticalDriver) {
        this.opticalDriver = opticalDriver;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    public String gamingMode(){
        processor.setFrequency(processor.getMaxFrequency());
        return "Success";
    }
}
