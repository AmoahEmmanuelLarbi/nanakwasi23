package java_gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;

public class GUI implements ActionListener{
    
    static int count = 0;
    JFrame frame;
    JButton button;
    JLabel label;
    JPanel panel;
    
    public GUI() {
        frame = new JFrame(); // create a JFrame object
         
        button = new JButton("CLICK ME"); // create a JButton object
        button.addActionListener(this);
        
        label = new JLabel("Number of Clicks : 0"); // create a JLabel object
        
        panel = new JPanel(); // create JPanel object
        panel.setBorder(BorderFactory.createEmptyBorder(30, 50, 20, 50));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);
        
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("FIRST GUI");
        frame.pack();
        frame.setVisible(true);
        
    }
    
    public static void main(String[] args){
        GUI myGui = new GUI();
        
   
    } // end of main method

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Number of Clicks : " + count);
    }
    
} // end of class FirstGUI
