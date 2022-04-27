package CalcMain;

import java.util.Scanner;

import myCalc.Add;
import myCalc.Mul;
import myCalc.Sub;
import myCalc.D;
import myCalc.Div;
import myCalc.Fact;
import myCalc.Max;
import myCalc.Min;

public class MiniCalculator {
    public static void main(String[] args)
    {
        System.out.println("1: Add\n2: Subtraction\n3: Multiplication\n4: Division\n5: Factorial\n6: Max\n7: Min");
        int choice = new Scanner(System.in).nextInt();
        switch(choice)
        {
            case 1:{
                Add add = new Add();
                add.getInput();
                add.displayResult();           
                break;
            }
            case 2:{
                Sub sub = new Sub();
                sub.getInput();
                sub.displayResult();
                break;
            }
            case 3:{
                Mul mul = new Mul();
                mul.getInput();
                mul.displayResult();
                break;
            }
            case 4:{
                Div div = new Div();
                div.getInput();
                div.displayResult();
                break;
            }
            case 5:{
                Fact fact = new Fact();
                fact.getInput();
                fact.displayResult();
                break;
            }
            case 6:{
                Max max = new Max();
                max.getInput();
                max.displayResult();
                break;
            }
            case 7:{
                Min min = new Min();
                min.getInput();
                min.displayResult();
            }
        }
    }
}
