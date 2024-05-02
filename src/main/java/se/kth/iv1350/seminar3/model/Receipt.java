/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package se.kth.iv1350.seminar3.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author aliceljungstrom
 * 
 * The receipt of a sale. 
 * 
 */
public class Receipt {
    
    private final Sale sale;

    /**
     * Creates a new instance.
     * 
     * @param sale The sale proved by this receipt
     */
    Receipt(Sale sale){
        this.sale = sale;
    }
    
    /**
     * 
     * Creates a string witch contains the receipt.
     * 
     * @return the receipt string
     */
    public String createReceiptString(){
        
        StringBuilder builder = new StringBuilder();
        builder.append("------------------ Begin receipt -------------------");
        builder.append("\n");
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime timeOfSale = sale.getDateTimeOfSale();
        
        builder.append("Time of Sale: ");
        builder.append(dtf.format(timeOfSale));
        builder.append("\n\n");
        
        //List of Sold Items
        //L listOfSoldItems = sale.getListOfSoldItems();
        //builder.append(listOfSoldItems);
        builder.append("\n\n");
        
        
        //total Cost and VAT
        //T totalCost = sale.getTotalCost();
        //V VAT = sale.getVAT();
        builder.append("Total: " + totalCost + "SEK\n");
        builder.append("VAT" + VAT + "SEK\n");
        builder.append("\n");
        
        //Cash and Change
        //C cash = sale.getAmountPaid();
        //C change = sale.getChange();
        builder.append("Cash: " + cash + "SEK\n");
        builder.append("Change :" + change + "SEK\n");
        builder.append("------------------ End receipt ---------------------\n");

        return builder.toString();

        
    }
    
}
