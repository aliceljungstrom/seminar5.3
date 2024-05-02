/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package se.kth.iv1350.seminar3.model;

import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;

/**
 *
 * @author aliceljungstrom
 * 
 * One single sale made by one single customer and payed with one payment. 
 */
public class Sale {
    private LocalDateTime saleTime;
    private Receipt receipt;
    
    /**
     * Creates a new instance of and saves the time of the sale. 
     */
    public Sale(){
        setTimeOfSale();
        receipt = new Receipt();
    }
    
    private void setTimeOfSale(){
        saleTime = LocalDateTime.now();
    }
    
    public LocalDateTime getDateTimeOfSale(){
        return saleTime;
    }
    
}
