package com.mycompany.ejerciciogui;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class Ventana extends JFrame {

    int altura;
    int anchura;
    
    public Ventana() {
        setResizable(false);
        
        getSizeWindow();
        setSize(this.anchura / 2, altura / 2);
        setLocation(this.anchura / 4, altura / 4);
        
        
    }

    public void getSizeWindow() {
        Toolkit screen = Toolkit.getDefaultToolkit();
        Dimension sizeScreen = screen.getScreenSize();
        this.altura = sizeScreen.height;
        this.anchura = sizeScreen.width; 
    }
}
