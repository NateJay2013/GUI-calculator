package com.techelevator;

import javax.swing.*;

public class CalculatorFace {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CalculatoGui());
    }
}