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
public class desktop extends Features{
    
    @Override
    public void screenResolution() {
        System.out.println("2560 x 1440");
    }

    @Override
    public void hardwareComponents() {
        System.out.println("Additional Mouse and Keyboard");
    }
}
