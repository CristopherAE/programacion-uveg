package com.cristopher.applibreriasjava;


import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;


public class NuevaVentana extends JFrame {
    NuevaVentana(String s) {
        setTitle(s);
        setSize(350, 500);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());
        
        JToggleButton toggleBtn = new JToggleButton("ToggleButton");
        JButton normalBtn = new JButton("Button");
        JCheckBox checkBox = new JCheckBox("CheckBox");
        JTextField txtField = new JTextField("TextField");
        JRadioButton radioBtn = new JRadioButton("RadioButton");
        JComboBox comboBox = new JComboBox();
        JScrollPane scroll = new JScrollPane();
        JTextArea txtArea = new JTextArea();
        JSlider slider = new JSlider();
        
        txtField.setColumns(20);
        
        comboBox.addItem("Option1");
        comboBox.addItem("Option2");
        comboBox.addItem("Option3");
        
        txtArea.setText("TextArea");
        txtArea.setColumns(20);
        txtArea.setRows(5);
        scroll.setViewportView(txtArea);
        
        getContentPane().add(checkBox);
        getContentPane().add(radioBtn);
        getContentPane().add(txtField);
        getContentPane().add(comboBox);
        getContentPane().add(scroll);
        getContentPane().add(slider);
        getContentPane().add(toggleBtn);
        getContentPane().add(normalBtn);
        
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
}
