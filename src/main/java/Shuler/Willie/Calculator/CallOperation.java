package Shuler.Willie.Calculator;

/**
 * Created by willieshuler on 9/13/16.
 */
public class CallOperation {

    double operand1, result;
    double numberGiven;
    double memory;


    Input input = new Input();
    CalculatorMethods calculatorMethods = new CalculatorMethods();
    Display display = new Display();


    public double performOperations(String performOperation) {

        switch (performOperation) {

            case "Sum":
                numberGiven = input.getNumberInput();
                result = calculatorMethods.add(operand1, numberGiven);
                break;

            case "Difference":
                numberGiven = input.getNumberInput();
                result = calculatorMethods.subtract(operand1, numberGiven);
                break;

            case "Product":
                numberGiven = input.getNumberInput();
               result = calculatorMethods.multiplication(operand1, numberGiven);
                break;

            case "Division":
                numberGiven = input.getNumberInput();
                result = calculatorMethods.division(operand1, numberGiven);
                break;

            case "Clear Display":
                operand1 = 0.0;
                result = operand1;
                break;

            //number1 is always the number that is displayed and the second number is the one given by user
            case "Exponentiation":
                numberGiven = input.getNumberInput();
                result = Math.pow(operand1, numberGiven);
                break;

            case "Factorial":
                result = calculatorMethods.factorial(operand1);
                break;

            case "log":
                result = Math.log(operand1);
                break;

            case "Square":
                result = operand1 * operand1;
                break;

            case "Sqrt":
                result = Math.sqrt(operand1);
                break;

            case "Inverse":
                result = calculatorMethods.division(1, operand1);
                break;

            case "Negate":
                result = -operand1;
                break;

            case "Sin In Radians":
                result = calculatorMethods.sineInRadians(operand1);
                break;

            case "Sin In Degrees":
                result = calculatorMethods.sineInDegrees(operand1);
                break;

            case "Cos In Radians":
                result = calculatorMethods.cosInRadians(operand1);
                break;

            case "Cos In Degrees":
                result = calculatorMethods.cosInDegrees(operand1);
                break;

            case "Tan In Radians":
                result = calculatorMethods.tanInRadians(operand1);
                break;

            case "Tan In Degrees":
                result = calculatorMethods.tanInDegrees(operand1);
                break;

            case "InverseSin":
                result = 1 / Math.sin(operand1);
                break;

            case "InverseCos":
                result = 1 / Math.cos(operand1);
                break;

            case "InverseTan":
                result = 1 / Math.tan(operand1);
                break;

            case "M": //even though memory and result are the same send result as arg
                memory = result;
                display.displayNumber(result);
                break;

            case "MRC":
                display.displayNumber(memory);
                break;

            case "MC":
                memory = 0;
                display.displayNumber(memory);
                break;

            case "Switch To Hex":
                String hexResult = calculatorMethods.switchToHex(operand1);
                display.displayString(hexResult);
                break;

            case "Switch To Binary":
                String binaryResult = calculatorMethods.switchToBinary(operand1);
                display.displayString(binaryResult);
                break;

            case "Switch To Octal":
                String octalResult = calculatorMethods.switchtoOctal(operand1);
                display.displayString(octalResult);
                break;

        }
        return result;
    }
}
