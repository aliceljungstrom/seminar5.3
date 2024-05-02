/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package se.kth.iv1350.seminar3.startup;

import se.kth.iv1350.seminar3.controller.Controller;

/**
 *
 * @author aliceljungstrom
 * 
 * Starts the application.
 * 
 */
public class Main {
    
    public static void main(String[] args)
    {
        Controller contr = new Controller();
        se.kth.iv1350.seminar3.view.Main view = new se.kth.iv1350.seminar3.view.Main(contr);
        view.runFakeExecution(); 
    }
    
}
