/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emptyjavaproject;

import java.util.Scanner;

/**
 *
 * @author paul.kline
 */
public class Runner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Die die = new Die();
        
        System.out.println("How many sides are there?");
        die.setSides(scan.nextInt());
        System.out.println("How many Dice are there?");
         die.setDice(scan.nextInt());
        System.out.print("How often should I print?");
        die.setNumPrints(scan.nextInt());
        
        
        Roller roll = new Roller(die.getSides(), die.getDice());

        int ammountOfTimes = 0;
        ammountOfTimes = die.getNumPrints() + ammountOfTimes;
        
        
        if (roll.counter == ammountOfTimes) {
            System.out.println("After " + ammountOfTimes + " rolls, the distribution is:");

            for (int i = 0; i < maxArray(die.getSides()).length; i++) {
                System.out.println(maxArray(die.getSides())[i] + 1 + " was rolled " + Counter.maxArr[i] + " times");
            }

        }

    }

    public static int[] maxArray(int sides) {
        int[] maxArr = new int[sides];
        return maxArr;
    }
}
