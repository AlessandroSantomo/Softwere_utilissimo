package com.gioco.Alessandro.Gioco;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel extends JPanel implements ActionListener {

    JTextField textField = new JTextField();
    JButton button = new JButton();
    String altezza;


    Panel() {
        textField.setBounds(0,0,250,50);
        textField.setHorizontalAlignment(JTextField.CENTER);
        textField.addActionListener (this);

          button.setBounds(50,60,150,30);
          button.setText("CONFERMA");
          button.setFocusable(false);
          button.addActionListener(this);



        this.setBounds(20,50,250,100);
        this.add(textField);
        this.add(button);
        this.setLayout(null);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==textField){
            altezza=textField.getText();
        }
        else if (e.getSource()==button){
            JOptionPane.showMessageDialog(null,"Sei alto "+altezza+" cm.","Ecco la tua altezza!",JOptionPane.INFORMATION_MESSAGE);
            setVisible(true);
            System.exit(0);
        }
    }
}
