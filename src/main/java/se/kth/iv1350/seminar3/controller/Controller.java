/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package se.kth.iv1350.seminar3.controller;

import se.kth.iv1350.seminar3.model.Sale;

/**
 * 
 * @author aliceljungstrom
 * 
 * This is the application's controller. All calls to the model pass through this class. 
 * 
 */
public class Controller {
    private Sale sale;
    
    /**
     * Starts a new sale. The first method that is created for a new sale. 
     */
    
    public void startSale(){
        sale = new Sale();
    }
    
}
