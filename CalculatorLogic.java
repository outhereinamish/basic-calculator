/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author collincampbell
 */
public class CalculatorLogic {
    private double num1;
    private double num2;
    private double answer = 0;
    
    public void setNumber(String number) { // input string from textfield and convert to double whenever operation is selected
        num1 = Double.parseDouble(number);
    }
    
    public double addition(String number) { // textfield converted to double for num2 whenever a opertion is called
        num2 = Double.parseDouble(number);
        return answer = num1 + num2;
    }
    
    public double multiply(String number) {
        num2 = Double.parseDouble(number);
        return answer = num1 * num2;
    }
    
    public double divide(String number) {
        num2 = Double.parseDouble(number);
        return answer = num1 / num2;
    }
    
    public double subtract(String number) {
        num2 = Double.parseDouble(number);
        return answer = num1 - num2;
    }
}
