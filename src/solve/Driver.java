package solve;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args){
        boolean isDone = false;
        Scanner s = new Scanner(System.in);
        CalculatorSolutionVisitor visitor = new CalculatorSolutionVisitor();
        do{
            System.out.println("Enter an expression? (Y/N)");
            String input = s.nextLine();
            switch(input){
                case "Y":
                case "y":
                    isDone = false;
                    break;
                case "N":
                case "n":
                    isDone = true;
                    break;
                default:
                    isDone = true;
            }

            System.out.println("Please enter your expression:");
            String expression = s.nextLine();

            Float output = visitor.solve(expression);
            if(output != null){
                System.out.println("Answer: "+ output);
            }else{
                System.out.println("Invalid Expression.");
            }
        }while(!isDone);

    }



}
