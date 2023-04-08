package Homework1;
import Homework1.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
public class Algorithm {
    public static Double calculate(String expression) {
        DecimalFormat df = new DecimalFormat("#.#");
        String[] operations = expression.split("\\s+");
        Stack<Double> values = new Stack<>();
        Stack<String> operators = new Stack<>();
        for (String operation : operations) {
            if (operation.equals("(")) {
                continue;
            }
            else if (operation.equals("+") || operation.equals("-") ||
                    operation.equals("*") || operation.equals("/") ||
                    operation.equals("%") || operation.equals("^") ||
                    operation.equals("√")) {
                operators.push(operation);
            }
            else if (operation.equals(")")) {
                String operator = operators.pop();
                Double secondValue = values.pop();
                if (operator.equals("√")) {
                    values.push(Math.sqrt(secondValue));
                }
                else {
                    Double firstValue = values.pop();
                    Double result;
                    switch (operator) {
                        case "+":
                            result = Double.parseDouble(df.format(firstValue + secondValue));
                            break;
                        case "-":
                            result = Double.parseDouble(df.format(firstValue - secondValue));
                            break;
                        case "*":
                            result = Double.parseDouble(df.format(firstValue * secondValue));
                            break;
                        case "/":
                            result = Double.parseDouble(df.format(firstValue / secondValue));
                            break;
                        case "%":
                            result = Double.parseDouble(df.format(firstValue % secondValue));
                            break;
                        case "^":
                            result = Double.parseDouble(df.format(Math.pow(firstValue, secondValue)));
                            break;
                        default:
                            result = (double) 0;
                            break;
                    }
                    values.push(result);
                }
            } else {
                values.push(Double.valueOf(operation));
            }
        }
        return values.pop();
    }
    public static ArrayList<Double> calculateFromFile(String filePath) {
        ArrayList<String> expressions = FileUtils.readFile(filePath);
        ArrayList<Double> results = new ArrayList<>();
        for (String expression : expressions) {
            results.add(calculate(expression));
        }
        return results;
    }
}
