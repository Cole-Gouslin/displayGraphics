/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author CGouslin2026
 */

import java.awt.*;
import javax.swing.*;
import java.awt.Color;

//create a constructor method
public class Main extends JPanel{
public Main(){
super();
}

public void paintComponent(Graphics g){
g.setColor(new Color (150, 15, 15));
g.fillRect(61, 49, 46, 40);
g.setColor(new Color (200, 20, 20));    
g.fillRect(64, 49, 40, 40);
g.fillOval(64, 29, 40, 40);
g.fillRect(64, 89, 17, 17);
g.fillRect(87, 89, 17, 17);
g.setColor(new Color (150, 150, 200));
g.fillRect(70, 45, 28, 10);
g.setColor(new Color (150, 15, 15));
}

    public static void main(String[] args) {
        JFrame frame = new JFrame("BasicJPanel");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(200,200);
// Create a new identifier for a BasicJPanel called "panel",
// then create a new BasicJPanel object for it to refer to.
Main panel = new Main();
// Make the panel object the content pane of the JFrame.
// This puts it into the drawable area of frame, and now
// we do all our drawing to panel, using paintComponent(), above.
frame.setContentPane(panel);
frame.setVisible(true);
    }
}
