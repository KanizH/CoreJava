package coreJavaPart_4;

import java.util.Scanner;

public class SimpleCalculatorUsingSwitchStatement {

    public static void main(String [] args){
        //declaring four variables
        char operator;
        Double number1,number2, result;

        //create an object of scanner class
        Scanner input = new Scanner(System.in);

        //ask users to enter operator
        System.out.println("Choose an operator: +, -, *, or /");
        operator = input.next().charAt(0);

        //ask users to enter numbers
        System.out.println("Enter the first number: ");
        number1=input.nextDouble();

        System.out.println("Enter the second number: ");
        number2=input.nextDouble();
        //calculate the numbers
        switch (operator) {
            // performs addition between two numbers
            case '+':{
                result = number1 + number2;
                System.out.println(number1 + "+" + number2 + "=" + result);
                break;
            }
            // performs subtraction between two numbers
            case '-':
                result = number1 - number2;
                System.out.println(number1 + "-" + number2 + "=" + result);
                break;
            // performs multiplication between two numbers
            case '*':
                result=number1*number2;
                System.out.println(number1 + "*" + number2 + "*" + result);
                break;
            // performs division between two numbers
            case '/':
                result = number1 / number2;
                System.out.println(number1 + "/" + number2 + "=" + result);
                break;
            default:
                System.out.println("Invalid operator!");
            }
            input.close();
        }


        }


