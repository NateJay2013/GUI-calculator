package com.techelevator;

public class Calculator {
    private double results;
    private String input;
    private String operator;

    public Calculator(){
        results = 0;
        input = "";
        operator = "";
    }

    public double getResults() {
        return results;
    }

    public void calculateResults(){
        // logic to calculate results
        if(!input.isEmpty()) {
            double number = Double.parseDouble(input);

            switch (operator) {
                case "+":
                    results += number;
                    break;
                case "-":
                    results -= number;
                    break;
                case "*":
                    results *= number;
                    break;
                case "/":
                    results /= number;
                    break;
                default:
                    results = number;
                    break;
            }

        }
        input ="";
    }
    public String getCurrentInput() {
        return input.isEmpty() ? String.valueOf(results) : input;
    }


    public void update(String command){
        // logic for clear command
        if(command.equals("C")) {
            input ="";
            results = 0;
            operator = "";
        } else if (command.equals("=")) {
            calculateResults();
            operator ="";
        } else if (command.equals("+") || command.equals("*") || command.equals("/") || command.equals("-")){
            calculateResults();
          operator = command;
        } else {
            input += command;
        }
    }
}
