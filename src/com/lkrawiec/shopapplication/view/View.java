/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lkrawiec.shopapplication.view;

import com.lkrawiec.shopapplication.model.Model;

/**
 * View of the application.
 * Contains logic for view and GUI.
 * 
 * @author lukasz
 */
public class View {
    
    /* Model to work on */
    private final Model model;
    /* GUI of this project */
    private final GUI gui;
    
    /**
     * Initializes the view
     * 
     * @param model 
     */
    public View(Model model) {
        this.model = model;
        this.gui = new GUI();
    }
    
    public void start() {
        gui.setVisible();
    }
}
