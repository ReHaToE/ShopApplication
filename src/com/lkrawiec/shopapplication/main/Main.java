package com.lkrawiec.shopapplication.main;

import com.lkrawiec.shopapplication.model.Model;
import com.lkrawiec.shopapplication.view.View;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 * Main of ShopApplication
 * @author lukasz
 */
public class Main {

    /**
     * Starts the program
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Model m = new Model();
        View v = new View(m);
    }
    
}
