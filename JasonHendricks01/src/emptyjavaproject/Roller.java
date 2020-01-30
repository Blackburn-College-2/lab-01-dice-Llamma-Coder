/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emptyjavaproject;

import java.util.Random;

/**
 *
 * @author jason.hendricks
 */
public class Roller {

    Random rand = new Random();
    int counter = 0;
    Counter count = new Counter(roll, sides);
    public Roller(int sides, int dice) {
        for (int i = 0; i < dice; i++) {
            int roll = rand.nextInt(sides) + 1;
            this.counter++;
            
            
        }
    }

    public int getCounter() {
        return counter;
    }

    public Counter getCount() {
        return count;
    }

}
