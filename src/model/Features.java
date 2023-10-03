/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author User
 */
public abstract class Features {

    public void ram() {
        System.out.println("16GB RAM");
    }

    public void processor() {
        System.out.println("Intel i7 11th Gen");
    }

    public abstract void screenResolution();

    public abstract void hardwareComponents();

    public final void templateMethod() {
        ram();
        processor();
        screenResolution();
        if (doHardwareComponents()) {
            hardwareComponents();
        }
    }

    public boolean doHardwareComponents() {
        return true;
    }
}
