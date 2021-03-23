package com.gioco.Alessandro.Gioco;

import javax.swing.*;

public class Label extends JLabel {
    Label(){
        this.setText("Inserisci qui la tua altezza in centimetri.");
        this.setBounds(20,20,250,50);
        this.setHorizontalAlignment(JLabel.CENTER);
        this.setVerticalAlignment(JLabel.TOP);

    }
}
