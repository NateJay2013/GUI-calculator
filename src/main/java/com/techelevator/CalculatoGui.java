package com.techelevator;

import javax.swing.*;
import java.awt.*;

public class CalculatoGui extends JFrame {
    private JTextField display;
    private Calculator calculator;

    public CalculatoGui() {
        super("Calculator Guru");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 400);
        setLayout(new BorderLayout());

        calculator = new Calculator();

        display = new JTextField();
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.BOLD, 40));
        add(display, BorderLayout.NORTH);
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 4, 5, 5));

        String[] buttonLabels = {
                "1", "2", "3", "/",
                "4", "5", "6", "*",
                "7", "8", "9", "-",
                "0", ".", "=", "+",
                "C"
        };
        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.setFont(new Font("Arial", Font.PLAIN, 20));
            button.addActionListener(new ButtonClickListener(calculator, display));
            button.setBackground(Color.LIGHT_GRAY);
            buttonPanel.add(button);
            button.setForeground(Color.magenta);
        }
        add(buttonPanel, BorderLayout.CENTER);
        setVisible(true);
    }
}
