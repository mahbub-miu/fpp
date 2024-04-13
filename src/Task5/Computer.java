package src.Task5;

import java.util.Objects;

public class Computer {
    String manufacturer;
    String processor;
    int ramSize;
    double processorSpeed;

    Computer(String manufacturer, String processor, int ramSize, double processorSpeed){
        this.manufacturer=manufacturer;
        this.processor=processor;
        this.ramSize=ramSize;
        this.processorSpeed=processorSpeed;
    }

    public String getProcessor() {return processor;}
    public int getRamSize() {return ramSize;}

    double computePower(){
        return ramSize*processorSpeed;       //computePower= ramSize multiplied by processorSpeed
    }

    @Override
    public String toString(){
        return "Manufacturer: "+manufacturer+"\nProcessor: "+processor+"\nRam Size: "+ramSize+"\nProcessor speed: "+processorSpeed+"\nComputer Power: "+computePower();
    }

    @Override
    public boolean equals(Object obj){
        //if(obj==null) return false;
        if(this==obj) return true;
        if(obj==null || getClass()!=obj.getClass()){
            return false;
        }
        Computer com=(Computer) obj;
        return (Objects.equals(manufacturer, com.manufacturer) && Objects.equals(processor,com.processor) && ramSize==com.ramSize);
    }

    @Override
    public int hashCode(){
        return Objects.hash(manufacturer, processor, ramSize);
    }

}
