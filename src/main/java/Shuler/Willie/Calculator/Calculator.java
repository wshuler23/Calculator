package Shuler.Willie.Calculator;

import java.util.Scanner;

/**
 * Created by willieshuler on 9/11/16.
 */
public class Calculator {

    public static void main(String[] args) {

        //Initalizing object of MathMethods class
        MathMethods calculator = new MathMethods();

        double firstNum = calculator.number, secondNum = calculator.sum, result;
        String Sign;
        Scanner userInput = new Scanner(System.in);

        //User gets presented with 0.0
        System.out.println(firstNum);

        //Prompts user to input operator
        System.out.println("What operation would you like to execute: (+,-,/,*)");
        Sign = userInput.next();

        //If operator is chosen, then it is performed
        if (Sign.equals("+")) {

            //User will put in their second number
            secondNum = userInput.nextDouble();

            result = calculator.add(firstNum, secondNum);
            System.out.println(result);
        }
       if (Sign.equals("-")) {
           //User will put in their second number
           secondNum = userInput.nextDouble();

           result = calculator.add(firstNum, secondNum);
           System.out.println(result);
            System.out.println("Answer: " + calculator.subtract(firstNum, secondNum));
        }
        if (Sign.equals("/")) {
      }
       if (Sign.equals("*")) {
           System.out.println("Answer: " + calculator.multiplication(firstNum, secondNum));
       }

    }
}