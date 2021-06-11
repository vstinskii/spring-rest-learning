package com.company.model;

import org.springframework.stereotype.Component;

import java.util.Arrays;

public class Starship {

    private int id;
    private String model;
    private String weapon;
    private int numOfModules;
    private int numOfPassengers;
    private boolean hyperDrive;
    private String[] rockets;

    public Starship() {

    }

    public Starship(String model, String weapon, int numOfModules, int numOfPassengers, boolean hyperDrive) {
        this.model = model;
        this.weapon = weapon;
        this.numOfModules = numOfModules;
        this.numOfPassengers = numOfPassengers;
        this.hyperDrive = hyperDrive;
    }

    public Starship(int id, String model, int numOfModules, int numOfPassengers, boolean hyperDrive) {
        this.id = id;
        this.model = model;
        this.numOfModules = numOfModules;
        this.numOfPassengers = numOfPassengers;
        this.hyperDrive = hyperDrive;
    }

    public Starship(int id, String model, String weapon, int numOfModules, int numOfPassengers, boolean hyperDrive) {
        this.id = id;
        this.model = model;
        this.weapon = weapon;
        this.numOfModules = numOfModules;
        this.numOfPassengers = numOfPassengers;
        this.hyperDrive = hyperDrive;
    }

    @Override
    public String toString() {
        return "Starship{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", weapon='" + weapon + '\'' +
                ", numOfModules=" + numOfModules +
                ", numOfPassengers=" + numOfPassengers +
                ", hyperDrive=" + hyperDrive +
                ", rockets=" + Arrays.toString(rockets) +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumOfModules() {
        return numOfModules;
    }

    public void setNumOfModules(int numOfModules) {
        this.numOfModules = numOfModules;
    }

    public int getNumOfPassengers() {
        return numOfPassengers;
    }

    public void setNumOfPassengers(int numOfPassengers) {
        this.numOfPassengers = numOfPassengers;
    }

    public boolean isHyperDrive() {
        return hyperDrive;
    }

    public void setHyperDrive(boolean hyperDrive) {
        this.hyperDrive = hyperDrive;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String[] getRockets() {
        return rockets;
    }

    public void setRockets(String[] rockets) {
        this.rockets = rockets;
    }

    }
