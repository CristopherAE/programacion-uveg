package com.cristopher.applibreriasjava;


import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import com.formdev.flatlaf.FlatDarculaLaf;
import com.github.weisj.darklaf.LafManager;
import javax.swing.UIManager;
import mdlaf.MaterialLookAndFeel;


public class AppLibreriasJava extends JFrame {
    AppLibreriasJava() {
        setTitle("Librerías en Java");
        setLocationRelativeTo(null);
        setSize(300, 300);
        setLayout(new GridLayout(3, 1, 10, 20));
        setResizable(false);
        
        JButton libreria1 = new JButton("Librería FlatLaf");
        JButton libreria2 = new JButton("Librería Material UI Swing");
        JButton libreria3 = new JButton("Librería Darklaf");
        
        libreria1.addActionListener((ActionEvent ae) -> {
            try {
                UIManager.setLookAndFeel(new FlatDarculaLaf());
            } catch (Exception ex) {
                System.err.println("Failed to initialize LaF");
            }
            NuevaVentana ventana1 = new NuevaVentana("Librería FlatLaf");
        });
        
        libreria2.addActionListener((ActionEvent ae) -> {
            try {
                UIManager.setLookAndFeel(new MaterialLookAndFeel());
            } catch (Exception ex) {
                System.err.println("Failed to initialize LaF");
            }
            NuevaVentana ventana2 = new NuevaVentana("Librería Material UI Swing");
        });
        
        libreria3.addActionListener((ActionEvent ae) -> {
            LafManager.install();
            NuevaVentana ventana3 = new NuevaVentana("Librería Darklaf");
        });
        
        getContentPane().add(libreria1);
        getContentPane().add(libreria2);
        getContentPane().add(libreria3);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        AppLibreriasJava ventanaPrincipal = new AppLibreriasJava();
    }
}
