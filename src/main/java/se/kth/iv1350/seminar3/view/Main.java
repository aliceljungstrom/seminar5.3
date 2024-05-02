/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package se.kth.iv1350.seminar3.view;

import se.kth.iv1350.seminar3.controller.Controller;

/**
 *
 * @author aliceljungstrom
 * 
 * This is a placeholder for the real view. 
 * It contains a hardcoded execution call. 
 */
public class Main {
    private Controller contr;
    
    /**
     * Creates a new instance.
     * 
     * @param contr The controller to use for all calls to other layers.
     */
    
    public Main(Controller contr){
        this.contr = contr;
    }
    
    /**
     * Performs a fake sale by calling system operations in the controller. 
     */
    
    public void runFakeExecution(){
        contr.startSale();
        System.out.println("A new sale has been started.");
    }
    
    
}
