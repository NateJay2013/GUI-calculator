package com.techelevator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonClickListener implements ActionListener {
    private Calculator calculator;
    private JTextField display;

    public ButtonClickListener(Calculator calculator, JTextField display) {
        this.calculator = calculator;
        this.display = display;
    }
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        calculator.update(command);
        display.setText(calculator.getCurrentInput());
    }
}





