package ru.evg.springapp;

public class RockMusic implements Music{

    public void doMyInit(){
        System.out.println("Init");
    }

    public void doMyDestroy(){
        System.out.println("Destroy");
    }

    @Override
    public String getSong() {
        return "AC/DC";
    }
}
